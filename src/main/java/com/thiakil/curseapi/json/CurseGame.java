package com.thiakil.curseapi.json;

public enum CurseGame {
	WORLD_OF_WARCRAFT("World of Warcraft", 1),
	THE_SECRET_WORLD("The Secret World", 64),
	RUNES_OF_MAGIC("Runes of Magic", 335),
	WORLD_OF_TANKS("World_of Tanks", 423),
	RIFT("Rift", 424),
	MINECRAFT("Minecraft", 432),
	WILDSTAR("WildStar", 454),
	THE_ELDER_SCROLLS_ONLINE("The Elder Scrolls Online", 455),
	DARKEST_DUNGEON("Darkest Dungeon", 608),
	KERBAL_SPACE_PROGRAM("Kerbal Space Program", 4401),
	SECRET_WORLD_LEGENDS("Secret World Legends", 4455);
	
	public final String name;
	public final int id;
	
	CurseGame(String name, int id){
		this.name = name;
		this.id = id;
	}
}
