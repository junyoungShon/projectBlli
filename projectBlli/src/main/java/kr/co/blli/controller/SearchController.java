package kr.co.blli.controller;

import javax.annotation.Resource;

import kr.co.blli.model.posting.PostingService;
import kr.co.blli.model.product.ProductService;

import org.springframework.stereotype.Controller;

@Controller
public class SearchController {
	@Resource
	private ProductService productService;
	@Resource
	private PostingService postingService;

}
