package kr.co.blli.util;

import java.io.FileNotFoundException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Map;



public class MailTest {
	
	/*@Autowired
	private static MailService mailService;*/
	
	public static void main(String[] args) {
		
		String recipient = "sk1597530@gmail.com";
		String subject = "왔다!!!!!!!!!";
		String text = "velocity로 메일 보내기 테스트";
		String formUrl = "mailForm_default.vm";
		
		Map<String, Object> textParams = new HashMap<String, Object>();
		
		textParams.put("contents", text);
		textParams.put("contentHeight", 150);
		
		MailService mailService = new MailService();
		
		try {
			mailService.sendMail(recipient, subject, text, textParams, formUrl);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
	}
}
