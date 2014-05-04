package tk.jimmywang.weichat.entity.message.response;

public class MusicMessage extends BaseMessage {

	private static final long serialVersionUID = 6671949391369114284L;

	private Music music;

	public Music getMusic() {
		return music;
	}

	public void setMusic(Music music) {
		this.music = music;
	}
}
