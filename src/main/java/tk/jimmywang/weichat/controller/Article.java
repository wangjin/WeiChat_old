package tk.jimmywang.weichat.controller;

import java.io.Serializable;

public class Article implements Serializable {

	private static final long serialVersionUID = -7848524937076146984L;

	private String title;

	private String description;

	private String imageUrl;

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

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}
