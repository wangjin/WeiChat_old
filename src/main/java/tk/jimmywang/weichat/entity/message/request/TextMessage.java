package tk.jimmywang.weichat.entity.message.request;

public class TextMessage extends BaseMessage {

	private static final long serialVersionUID = -6945783344648412601L;

	private String content;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
}
