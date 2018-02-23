import addons.curse.AddOnAttachment
import addons.curse.AddOnAuthor
import addons.curse.AddOnCategory
import addons.curse.AddOnFile
import addons.curse.AddOnFileDependency
import addons.curse.AddOnModule
import addons.curse.CategorySection
import addons.curse.DownloadToken
import addons.curse.FingerprintMatch
import org.datacontract.schemas._2004._07.curse_addons.GameVersionLatestFile

import java.lang.reflect.ParameterizedType

def classes = [AddOnAttachment.class, AddOnAuthor.class, AddOnCategory.class, AddOnFile.class, AddOnFileDependency.class, AddOnModule.class, CategorySection.class, GameVersionLatestFile.class]
def pkg = "com.thiakil.curseapi.json.adaptors"
def folder = "D:\\git\\CurseSoap\\src\\main\\java\\"+pkg.replaceAll("\\.", "\\\\")+"\\"

static def printReplace(Writer w, String n, String s){
    w.print(s.replaceAll("%s", n))
}

for (clazz in classes){
    def name = clazz.getSimpleName()
    def writer = new PrintWriter((String)folder+name+"Adaptor.java", "utf-8")

    writer.println("package "+pkg+";\n")
    writer.println("import "+clazz.getName()+";\n" +
            "import com.thiakil.curseapi.json.adaptors.ProjectFeedAdaptor;\n" +
            "import com.google.gson.JsonParseException;\n" +
            "import com.google.gson.TypeAdapter;\n" +
            "import com.google.gson.stream.JsonReader;\n" +
            "import com.google.gson.stream.JsonWriter;\n\n" +
            "import java.io.IOException;\n")

    this.printReplace(writer, name, (String)"public class %sAdaptor extends TypeAdapter<%s> {\n" +
            "\tpublic static %sAdaptor INSTANCE = new %sAdaptor();\n" +
            "\t\n" +
            "\t@Override\n" +
            "\tpublic void write(JsonWriter out, %s value) throws IOException {\n" +
            "\t\tout.beginObject();\n")

    for (field in clazz.getDeclaredFields()) {
        def fname = field.getName()
        if (!fname.startsWith("local") || fname.endsWith("Tracker")) {
            continue
        }
        fname = fname.substring("local".length())
        writer.println("\t\tout.name(\"" + fname + "\");")
        switch (field.getType()) {
            case int.class:
            case String.class:
            case long.class:
            case double.class:
            case boolean.class:
                writer.println("\t\tout.value(value.get" + fname + "());")
                break
            case List.class:
                def genType = field.getGenericType()
                if (genType instanceof ParameterizedType) {
                    writer.println("\t\tProjectFeedAdaptor.writeArray(out, value.get" + fname + "(), " + ((Class) (genType.actualTypeArguments[0])).getSimpleName() + "Adaptor.INSTANCE);")
                } else {
                    writer.println("not parameterized!")
                }
                break
            default:
                writer.println("\t\t"+field.getType().getSimpleName()+"Adaptor.INSTANCE.write(out, value.get" + fname + "());")
        }
        writer.println()
    }

    this.printReplace(writer, name, "\t\tout.endObject();\n" +
            "\t}\n" +
            "\t\n" +
            "\t@Override\n" +
            "\tpublic %s read(JsonReader in) throws IOException {\n" +
            "\t\t%s out = new %s();\n" +
            "\t\t\n" +
            "\t\tin.beginObject();\n" +
            "\t\twhile (in.hasNext()){\n" +
            "\t\t\tString prop = in.nextName();\n" +
            "\t\t\tswitch (prop) {\n")

    for (field in clazz.getDeclaredFields()) {
        def fname = field.getName()
        if (!fname.startsWith("local") || fname.endsWith("Tracker")) {
            continue
        }
        fname = fname.substring("local".length())

        writer.println("\t\t\t\tcase \""+fname+"\":")

        switch (field.getType()) {
            case int.class:
                writer.println("\t\t\t\t\tout.set" + fname + "(in.nextInt());")
                break
            case String.class:
                writer.println("\t\t\t\t\tout.set" + fname + "(in.nextString());")
                break
            case long.class:
                writer.println("\t\t\t\t\tout.set" + fname + "(in.nextLong());")
                break
            case double.class:
                writer.println("\t\t\t\t\tout.set" + fname + "(in.nextDouble());")
                break
            case boolean.class:
                writer.println("\t\t\t\t\tout.set" + fname + "(in.nextBoolean());")
                break
            case List.class:
                def genType = field.getGenericType()
                if (genType instanceof ParameterizedType) {
                    writer.println("\t\t\t\t\tout.set" + fname + "(ProjectFeedAdaptor.readListOfObjects(in, " + ((Class) (genType.actualTypeArguments[0])).getSimpleName() + "Adaptor.INSTANCE));")
                } else {
                    writer.println("not parameterized!")
                }
                break
            default:
                writer.println("\t\t\t\t\tout.set" + fname + "(ProjectFeedAdaptor.readListOfObjects(in, " + field.getType().getSimpleName() + "Adaptor.INSTANCE));")
        }
        writer.println("\t\t\t\t\tbreak;")
    }

    writer.println("\t\t\t}\n" +
            "\t\t}\n" +
            "\t\tin.endObject();\n" +
            "\t\t\n" +
            "\t\treturn out;\n" +
            "\t}\n" +
            "}")
    writer.flush()
    writer.close()
}