package tk.jimmywang.weichat.entity.message.response;

import java.io.Serializable;

public class Music implements Serializable {

	private static final long serialVersionUID = 4050598921742978441L;

	private String title;

	private String description;

	private String musicUrl;

	private String musicUrlHQ;

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

	public String getMusicUrl() {
		return musicUrl;
	}

	public void setMusicUrl(String musicUrl) {
		this.musicUrl = musicUrl;
	}

	public String getMusicUrlHQ() {
		return musicUrlHQ;
	}

	public void setMusicUrlHQ(String musicUrlHQ) {
		this.musicUrlHQ = musicUrlHQ;
	}
}
