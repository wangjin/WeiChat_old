package tk.jimmywang.weichat.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tk.jimmywang.weichat.util.SignUtil;

@Controller
public class WeiChatApiController {

	public static final String TOKEN = "WANGJINWEICHAT";

	@RequestMapping(value = "weichatapi", method = RequestMethod.GET)
	public void APIGet(String signature, String timestamp, String nonce,
			String echostr, HttpServletResponse response) throws IOException {
		PrintWriter writer = response.getWriter();
		if (SignUtil.checkSignature(TOKEN, signature, timestamp, nonce)) {
			writer.print(echostr);
		}
		writer.close();
		writer = null;
	}

	@RequestMapping(value = "weichatapi", method = RequestMethod.POST)
	public void APIPost() {

	}
}
