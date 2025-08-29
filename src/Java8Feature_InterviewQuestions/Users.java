package Java8Feature_InterviewQuestions;

public class Users{
	
	private String name;
	private String uuid;
	private String panNo;
	
	public Users(String name, String uuid, String panNo) {
		super();
		this.name = name;
		this.uuid = uuid;
		this.panNo = panNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", uuid=" + uuid + ", panNo=" + panNo + "]";
	}
	
	
}