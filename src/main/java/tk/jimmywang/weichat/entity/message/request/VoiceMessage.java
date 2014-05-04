package tk.jimmywang.weichat.entity.message.request;

public class VoiceMessage extends BaseMessage {

	private static final long serialVersionUID = 7796756025724650569L;

	// √ΩÃÂID
	private String MediaId;
	// ”Ô“Ù∏Ò Ω
	private String Format;

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}
}
