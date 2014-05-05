package tk.jimmywang.weichat.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import tk.jimmywang.weichat.entity.message.response.Article;
import tk.jimmywang.weichat.entity.message.response.NewsMessage;
import tk.jimmywang.weichat.util.MessageUtil;
import tk.jimmywang.weichat.util.XmlUtil;

public class ProcessService {

	public static String processRequest(HttpServletRequest request) {
		String respMessage = null;
		try {

			// xml�������
			Map<String, String> requestMap = XmlUtil.parseXml(request);
			// String content = requestMap.get("Content");
			// ���ͷ��ʺţ�open_id��
			String fromUserName = requestMap.get("FromUserName");
			// �����ʺ�
			String toUserName = requestMap.get("ToUserName");
			// ��Ϣ����
			String msgType = requestMap.get("MsgType");

			// �ı���Ϣ
			if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_TEXT)) {
				// // �ظ��ı���Ϣ
				// TextMessage textMessage = new TextMessage();
				// //������
				// textMessage.setToUserName(fromUserName);
				// //���ͷ��ʺţ�һ��OpenID��
				// textMessage.setFromUserName(toUserName);
				// textMessage.setCreateTime(new Date().getTime());
				// textMessage.setMsgType(MessageUtil.RESP_MESSAGE_TYPE_TEXT);
				// textMessage.setContent("��ã�");
				// textMessage.setFuncFlag(0);
				// respMessage = MessageUtil.textMessageToXml(textMessage);
				// ����ͼ����Ϣ
				NewsMessage newsMessage = new NewsMessage();
				newsMessage.setToUserName(fromUserName);
				newsMessage.setFromUserName(toUserName);
				newsMessage.setCreateTime(new Date().getTime());
				newsMessage.setMsgType(MessageUtil.RESPONSE_MESSAGE_TYPE_NEWS);
				newsMessage.setFuncFlag(0);

				List<Article> articleList = new ArrayList<Article>();
				Article article1 = new Article();
				article1.setTitle("��������");
				article1.setDescription("����һ����������");
				article1.setImageUrl("http://weichat.wangjinzone.tk/resources/images/car.jpg");
				article1.setUrl("http://weichat.wangjinzone.tk/");
				// article1.setUrl("http://user.qzone.qq.com/652810758?ptlang=2052");

				Article article2 = new Article();
				article2.setTitle("��2ƪ\n΢�Ź����ʺŵ�����");
				article2.setDescription("");
				article2.setImageUrl("http://202.102.83.54/4sWeixin/img/pic/xtp.png");
				article2.setUrl("http://www.ibrdp.com/WeiXinTest/Driving!drivingList.action");

				// Article article3 = new Article();
				// article3.setTitle("��3ƪ\n����ģʽ���ü��ӿ�����");
				// article3.setDescription("");
				// article3.setPicUrl("http://avatar.csdn.net/1/4/A/1_lyq8479.jpg");
				// article3.setUrl("http://blog.csdn.net/lyq8479/article/details/8944988");

				articleList.add(article1);
				// articleList.add(article2);
				// articleList.add(article3);
				newsMessage.setArticleCount(articleList.size());
				newsMessage.setArticles(articleList);
				respMessage = XmlUtil.newsMessageToXml(newsMessage);
			}
			// ͼƬ��Ϣ
			else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_IMAGE)) {
				respMessage = "�����͵���ͼƬ��Ϣ��";
				// ImageMessage imageMessage=new ImageMessage();
				// imageMessage.setToUserName(fromUserName);
				// imageMessage.setFromUserName(toUserName);
				// imageMessage.setCreateTime(new Date().getTime());
				// imageMessage.setMsgType(MessageUtil.REQUEST_MESSAGE_TYPE_IMAGE);
				// imageMessage.setFuncFlag(0);
				// imageMessage.setPicUrl("http://202.102.83.54/4sWeixin/img/pic/xtp.png");
				// respMessage = MessageUtil.imageMessageToXml(imageMessage);

			}
			// ����λ����Ϣ
			else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_LOCATION)) {
				respMessage = "�����͵��ǵ���λ����Ϣ��";
			}
			// ������Ϣ
			else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_LINK)) {
				respMessage = "�����͵���������Ϣ��";
			}
			// ��Ƶ��Ϣ
			else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_VOICE)) {
				respMessage = "�����͵�����Ƶ��Ϣ��";
			}
			// ͼ����Ϣ
			else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_NEWS)) {
				respMessage = "�����͵���ͼ����Ϣ��";

			}
			// �¼�����
			else if (msgType.equals(MessageUtil.REQUEST_MESSAGE_TYPE_EVENT)) {
				// �¼�����
				String eventType = requestMap.get("Event");
				// ����
				if (eventType.equals(MessageUtil.EVENT_TYPE_SUBSCRIBE)) {

					// ����ͼ����Ϣ
					NewsMessage newsMessage = new NewsMessage();
					newsMessage.setToUserName(fromUserName);
					newsMessage.setFromUserName(toUserName);
					newsMessage.setCreateTime(new Date().getTime());
					newsMessage.setMsgType(MessageUtil.RESPONSE_MESSAGE_TYPE_NEWS);
					newsMessage.setFuncFlag(0);

					List<Article> articleList = new ArrayList<Article>();
					Article article1 = new Article();
					article1.setTitle("��������");
					article1.setDescription("����һ����������");
					article1.setImageUrl("http://weichat.wangjinzone.tk/resources/images/car.jpg");
					article1.setUrl("http://weichat.wangjinzone.tk/");

					Article article2 = new Article();
					article2.setTitle("��2ƪ\n΢�Ź����ʺŵ�����");
					article2.setDescription("");
					article2.setImageUrl("http://202.102.83.54/4sWeixin/img/pic/xtp.png");
					article2.setUrl("http://www.ibrdp.com/WeiXinTest/Driving!drivingList.action");

					// Article article3 = new Article();
					// article3.setTitle("��3ƪ\n����ģʽ���ü��ӿ�����");
					// article3.setDescription("");
					// article3.setPicUrl("http://avatar.csdn.net/1/4/A/1_lyq8479.jpg");
					// article3.setUrl("http://blog.csdn.net/lyq8479/article/details/8944988");

					articleList.add(article1);
					// articleList.add(article2);
					// articleList.add(article3);
					newsMessage.setArticleCount(articleList.size());
					newsMessage.setArticles(articleList);
					respMessage = XmlUtil.newsMessageToXml(newsMessage);
				}
				// ȡ������
				else if (eventType.equals(MessageUtil.EVENT_TYPE_UNSUBSCRIBE)) {
					// TODO ȡ�����ĺ��û����ղ������ںŷ��͵���Ϣ����˲���Ҫ�ظ���Ϣ
				}
				// �Զ���˵�����¼�
				else if (eventType.equals(MessageUtil.EVENT_TYPE_CLICK)) {
					// TODO �Զ���˵�Ȩû�п��ţ��ݲ����������Ϣ

				}
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return respMessage;
	}
}
