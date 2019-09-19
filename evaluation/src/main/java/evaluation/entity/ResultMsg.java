package evaluation.entity;

public class ResultMsg {
	private int flag;
	private Object content;
	public ResultMsg(int flag, Object content) {
		this.flag = flag;
		this.content = content;
	}
	public int getFlag() {
		return flag;
	}
	public void setFlag(int flag) {
		this.flag = flag;
	}
	public Object getContent() {
		return content;
	}
	public void setContent(Object content) {
		this.content = content;
	}
}
