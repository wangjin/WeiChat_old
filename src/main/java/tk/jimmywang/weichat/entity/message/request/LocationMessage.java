package tk.jimmywang.weichat.entity.message.request;

public class LocationMessage extends BaseMessage {

	private static final long serialVersionUID = 4378720389536273921L;

	// ����λ��ά��
	private String location_X;
	// ����λ�þ���
	private String location_Y;
	// ��ͼ���Ŵ�С
	private String scale;
	// ����λ����Ϣ
	private String label;

	public String getLocation_X() {
		return location_X;
	}

	public void setLocation_X(String location_X) {
		this.location_X = location_X;
	}

	public String getLocation_Y() {
		return location_Y;
	}

	public void setLocation_Y(String location_Y) {
		this.location_Y = location_Y;
	}

	public String getScale() {
		return scale;
	}

	public void setScale(String scale) {
		this.scale = scale;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}
}
