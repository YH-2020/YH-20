package evaluation.entity;

public class ResultMsg {
	private int flage;
	private String content;
	public int getFlage() {
		return flage;
	}
	public void setFlage(int flage) {
		this.flage = flage;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	
	public ResultMsg ( int flage,String content) {
		this.flage=flage;
		this.content=content;
	}
}
