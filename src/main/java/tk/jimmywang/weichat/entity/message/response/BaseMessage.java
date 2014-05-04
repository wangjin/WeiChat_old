package tk.jimmywang.weichat.entity.message.response;

import java.io.Serializable;

public class BaseMessage implements Serializable {

	private static final long serialVersionUID = 2399295218989649915L;

	// ���շ��ʺţ��յ���OpenID��
	private String toUserName;
	// ������΢�ź�
	private String fromUserName;
	// ��Ϣ����ʱ�� �����ͣ�
	private long createTime;
	// ��Ϣ���ͣ�text/music/news��
	private String msgType;
	// λ0x0001����־ʱ���Ǳ���յ�����Ϣ
	private int funcFlag;

	public String getToUserName() {
		return toUserName;
	}

	public void setToUserName(String toUserName) {
		this.toUserName = toUserName;
	}

	public String getFromUserName() {
		return fromUserName;
	}

	public void setFromUserName(String fromUserName) {
		this.fromUserName = fromUserName;
	}

	public long getCreateTime() {
		return createTime;
	}

	public void setCreateTime(long createTime) {
		this.createTime = createTime;
	}

	public String getMsgType() {
		return msgType;
	}

	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public int getFuncFlag() {
		return funcFlag;
	}

	public void setFuncFlag(int funcFlag) {
		this.funcFlag = funcFlag;
	}
}
