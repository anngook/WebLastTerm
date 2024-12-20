package code;

public enum ApplyStatus {
	APPLIED("지원"),
	REJECTED("거절"),
	EXCEPTED("수락"),
	CLOSED("마감");
	
	ApplyStatus (String description){
		this.description = description;
	}
	
	private final String description;
}
