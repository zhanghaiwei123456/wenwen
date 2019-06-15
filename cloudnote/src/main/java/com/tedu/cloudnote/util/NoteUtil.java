package com.tedu.cloudnote.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.UUID;

import org.apache.tomcat.util.codec.binary.Base64;

/**
 * 将传入的src：明文字符串
 * 加密处理return：加密后的字符串
 * @author zhw
 *
 */
public class NoteUtil {
	public static String md5(String src) throws NoSuchAlgorithmException {
		//将字符串信息采用MD5处理
		MessageDigest md = MessageDigest.getInstance("MD5");
		byte[] output = md.digest(src.getBytes());
		//将MD5处理结转成字符串
		//String s = new String(output);有乱码
		//将MD5处理结果利用Base64转成字符串
		String s = Base64.encodeBase64String(output);
		
		return s;
	}
	public static void main(String[] args) throws NoSuchAlgorithmException {
		System.out.println(md5("123456"));
		System.out.println(md5("144423"));
		System.out.println(creatdId());
		System.out.println(creatdId());
	}
	public static String creatdId() {
		UUID uuid = UUID.randomUUID();
	    
		return uuid.toString().replace("-", "");
	}

}
