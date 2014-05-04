package tk.jimmywang.weichat.entity.message.response;

import java.util.List;

public class NewsMessage extends BaseMessage {

	private static final long serialVersionUID = 4642635937018632773L;
	
	private int aritleCount;
	
	private List<Article> articles;

	public int getAritleCount() {
		return aritleCount;
	}

	public void setAritleCount(int aritleCount) {
		this.aritleCount = aritleCount;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
}
