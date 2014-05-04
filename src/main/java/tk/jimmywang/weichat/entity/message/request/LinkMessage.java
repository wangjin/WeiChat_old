package tk.jimmywang.weichat.entity.message.request;

public class LinkMessage extends BaseMessage {

	private static final long serialVersionUID = 8307732875461106833L;

	// ��Ϣ����
	private String title;
	// ��Ϣ����
	private String description;
	// ��Ϣ����
	private String url;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
