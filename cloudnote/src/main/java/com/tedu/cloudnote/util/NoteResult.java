package com.tedu.cloudnote.util;

import java.io.Serializable;

/**
 * 结果对像
 * @author zhw
 * {"status":0,"msg":"成功","data":xxx}
 *
 */
public class NoteResult implements Serializable{
	private int status;//0成功,1:用户名不存在，2：密码错误
	private String msg;//消息
	private Object data;//返回来的数据 
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}

}
