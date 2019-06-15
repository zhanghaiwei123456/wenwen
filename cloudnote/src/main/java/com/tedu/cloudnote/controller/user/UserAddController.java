package com.tedu.cloudnote.controller.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.tedu.cloudnote.service.UserService;
import com.tedu.cloudnote.util.NoteResult;

@Controller
public class UserAddController {
	@Autowired
	private UserService userSerivace;
	
	@RequestMapping("/user/add.do")
	@ResponseBody
	public NoteResult execute(String name,String password,String nick) {
		NoteResult result = userSerivace.addUser(name, password, nick);
		return result;
		
	}

}
