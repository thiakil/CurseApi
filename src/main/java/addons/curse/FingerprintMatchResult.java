package addons.curse;

import java.util.List;
import java.util.Map;

public class FingerprintMatchResult {
	public long[] exactFingerprints;
	public List<FingerprintMatch> exactMatches;
	public long[] installedFingerprints;
	public boolean isCacheBuilt;
	public List<FingerprintMatch> partialMatches;
	public Map<Integer,Long> partialMatchFingerprints;
}