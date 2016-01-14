package kr.co.blli.controller;

import java.io.IOException;

import javax.annotation.Resource;

import kr.co.blli.model.posting.PostingService;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	@Resource
	private PostingService postingService;
	@RequestMapping("search_jsoupTest.do")
	public ModelAndView JsoupTest() throws IOException{
		String content = postingService.jsoupTest();
		return new ModelAndView("TestPosting","content",content);
	}
}