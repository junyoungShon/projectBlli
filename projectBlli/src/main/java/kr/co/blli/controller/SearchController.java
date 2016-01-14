package kr.co.blli.controller;

<<<<<<< HEAD
import java.io.IOException;

import javax.annotation.Resource;

import kr.co.blli.model.posting.PostingService;
=======
import javax.annotation.Resource;

import kr.co.blli.model.posting.PostingService;
import kr.co.blli.model.product.ProductService;
>>>>>>> branch 'master' of https://github.com/junyoungShon/projectBlli.git

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SearchController {
	@Resource
<<<<<<< HEAD
	private PostingService postingService;
	@RequestMapping("search_jsoupTest.do")
	public ModelAndView JsoupTest() throws IOException{
		String content = postingService.jsoupTest();
		return new ModelAndView("TestPosting","content",content);
	}
}
=======
	private ProductService productService;
	@Resource
	private PostingService postingService;

}
>>>>>>> branch 'master' of https://github.com/junyoungShon/projectBlli.git
