package com.tedu.cloudnote.service;

import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tedu.cloudnote.dao.UserDao;
import com.tedu.cloudnote.entity.User;
import com.tedu.cloudnote.util.NoteException;
import com.tedu.cloudnote.util.NoteResult;
import com.tedu.cloudnote.util.NoteUtil;
@Service("userService")
@Transactional

public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;//注入

	@Override
	public NoteResult checkLogin(String name, String password) {
		User user = userDao.findByName(name);
		NoteResult result = new NoteResult();
		//判断用户名
		if(user==null) {
			result.setStatus(1);
			result.setMsg("用户名不存在");
			return result;
		}
		//判断密码
		//将用户输入的明文加密
		try {
			String md5_pwd = NoteUtil.md5(password);
			if(!user.getCn_user_password().equals(md5_pwd)) {
				result.setStatus(2);
				result.setMsg("密码错误");
				return result;
			}
		}catch(Exception e) {
			throw new NoteException("密码加密异常",e);
		}
		
		//登录成功
		result.setStatus(0);
		result.setMsg("登录成功");
		user.setCn_user_password("");//把密码不返回
		result.setData(user);//返回user信息
		return result;
	}

	
	@Override
	public NoteResult addUser(String name, String password, String nick) {
		//创建返回结果
		NoteResult result = new NoteResult();
		try{
			//检测是否重名
			User has_user = userDao.findByName(name);
			if(has_user!=null) {
				result.setStatus(1);
				result.setMsg("用户名已被占用");
				return result;
			}
			//执行注册
			User user = new User();
			user.setCn_user_name(name);
			user.setCn_user_nick(nick);
			String md5_pwd = NoteUtil.md5(password);
			user.setCn_user_password(md5_pwd);
			
			String userId = NoteUtil.creatdId();
			user.setCn_user_id(userId);
			userDao.save(user);
			//创建返回结果
			result.setStatus(0);
			result.setMsg("注册成功");
			//模拟异常
//			String s = null;
//			s.length();//抛一个空指针异常
			return result;
		}catch(Exception e) {
			throw new NoteException("用户注册异常",e);
		}
		
	
	}

}
