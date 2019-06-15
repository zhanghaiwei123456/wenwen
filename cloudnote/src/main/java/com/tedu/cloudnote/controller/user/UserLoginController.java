package com.tedu.cloudnote.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.cloudnote.service.UserService;
import com.tedu.cloudnote.util.NoteResult;
@Controller
@RequestMapping("/user")
public class UserLoginController {
	@Autowired
	private UserService userService;
	@RequestMapping("/login.do")
	@ResponseBody//json输出
	public NoteResult excute(String name,String password) {
		NoteResult rsult = userService.checkLogin(name, password);
		return rsult;
		
	}

}
