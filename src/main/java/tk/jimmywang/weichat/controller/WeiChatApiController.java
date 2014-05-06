package tk.jimmywang.weichat.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tk.jimmywang.weichat.service.ProcessService;
import tk.jimmywang.weichat.service.WeiChatService;
import tk.jimmywang.weichat.util.SignUtil;

@Controller
public class WeiChatApiController {

	@Autowired
	private WeiChatService weiChatService;

	public static final String TOKEN = "WANGJINWEICHAT";

	private Logger logger = LoggerFactory.getLogger(WeiChatApiController.class);

	@RequestMapping(value = "/weichatapi", method = RequestMethod.GET)
	public void APIGet(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		String signature = request.getParameter("signature");
		String timestamp = request.getParameter("timestamp");
		String nonce = request.getParameter("nonce");
		String echostr = request.getParameter("echostr");
		PrintWriter writer = response.getWriter();

		logger.info("signature:" + signature);
		logger.info("timestamp:" + timestamp);
		logger.info("nonce:" + nonce);
		logger.info("echostr:" + echostr);

		if (SignUtil.checkSignature(TOKEN, signature, timestamp, nonce)) {
			writer.print(echostr);
		}
		writer.close();
		writer = null;
	}

	@RequestMapping(value = "/weichatapi", method = RequestMethod.POST)
	public void APIPost(HttpServletRequest request, HttpServletResponse response)
			throws IOException {
		logger.info("Access weichatapi with POST method!!!");
		request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();
		writer.print(ProcessService.processRequest(request));
		writer.close();
		writer = null;
	}
}
