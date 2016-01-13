package kr.co.blli.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	/**
	 * No.1 goAnyWhere()-ModelAndView
	 * 설명 :  단순 페이지 이동 시 요청 유알엘과 뷰의 파일명을 맞추기만 하면 사용가능한 메서드
	 * @author junyoung
	 */
	@RequestMapping("{viewId}.do")
	public String goAnyWhere(@PathVariable String viewId){
		return viewId;
	}
	/**
	 * @author junyoung
	 */
	@RequestMapping("member_goMain.do")
	public ModelAndView goMainPage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/blli/main");
		return mav;
	}
	
	/**
	 * @author junyoung
	 */
	@RequestMapping("admin_goAdminPage.do")
	public ModelAndView goAdminPage(){
		ModelAndView mav = new ModelAndView();
		mav.setViewName("/admin/adminPage");
		return mav;
	}
	
	
	
}
