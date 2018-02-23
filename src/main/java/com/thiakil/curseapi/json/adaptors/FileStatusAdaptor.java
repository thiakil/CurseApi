package com.thiakil.curseapi.json.adaptors;

import org.datacontract.schemas._2004._07.curse_addons.FileStatus;

public class FileStatusAdaptor extends BeanEnumAdaptor<FileStatus> {
	public static final FileStatusAdaptor INSTANCE = new FileStatusAdaptor();
	
	private FileStatusAdaptor(){
		super(
				FileStatus.Normal,
				FileStatus.SemiNormal,
				FileStatus.Reported,
				FileStatus.Malformed,
				FileStatus.Locked,
				FileStatus.InvalidLayout,
				FileStatus.Hidden,
				FileStatus.NeedsApproval,
				FileStatus.Deleted,
				FileStatus.UnderReview,
				FileStatus.MalwareDetected,
				FileStatus.WaitingOnProject,
				FileStatus.ClientOnly
		);
	}
}
