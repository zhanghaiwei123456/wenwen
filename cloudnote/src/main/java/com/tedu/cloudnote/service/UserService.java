package com.tedu.cloudnote.service;

import com.tedu.cloudnote.util.NoteResult;

public interface UserService {
	public NoteResult checkLogin(String name,String password);
	public NoteResult addUser(String name,String password,String nick);

}
