package tk.jimmywang.weichat.entity.message.response;

public class TextMessage extends BaseMessage {

	private static final long serialVersionUID = 7111727185277718394L;
	
	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
