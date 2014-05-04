package tk.jimmywang.weichat.entity.message.request;

public class ImageMessage extends BaseMessage {

	private static final long serialVersionUID = 6965845776612895041L;
	
	private String imageUrl;

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
}
