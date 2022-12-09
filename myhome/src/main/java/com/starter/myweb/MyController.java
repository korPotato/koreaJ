package com.starter.myweb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	@GetMapping("/")			// /my로 들어가면
	public String home() {
		return "index";			// 해당 html파일 열어줌
	}
	
	@GetMapping("/keyboard")
	public String keyboardPage() {
		return "keyboard";			// keyboard.hteml 열기
	}
	
	// HTML <=> JAVA 1. jsp 2. thymeleaf
	// 타임리프 자바를 가장 많이 사용
	// 타임리프는 스트림부트만 사용할수있다
	// 스트림부트는 둘다(jsp,thymeleaf)사용 가능하다
	// 
	@GetMapping("/result")
	public String resyltPage(Model model, @RequestParam("id")String name) {
		if(name.equalsIgnoreCase("1234")) {
			// equalsIgnoreCase (이이퀄스이그노어케이스)
			// 대소문자를 무시하고 같은지 아닌지 비교해줌
			model.addAttribute("re", "로그인"); 		// re = name			
		}else {
			model.addAttribute("re", "아이디 없음"); 		// re = name						
		}
		return "result";			// result.html 열기
	}
	
}
