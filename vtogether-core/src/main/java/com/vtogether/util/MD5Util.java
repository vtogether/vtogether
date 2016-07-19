package com.vtogether.util;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author gaowei Date:2016年7月19日
 **/
public class MD5Util {
	public static String md5s = "helloworld";

	public static String toMd5(String input) {
		if (input == null) {
			return null;
		}
		String md5 = null;
		// Create MessageDigest object for MD5
		MessageDigest digest = null;
		try {
			digest = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			throw new IllegalArgumentException("无法进行MD5加密", e);
		}
		// Update input string in message digest
		digest.update(input.getBytes(), 0, input.length());
		// Converts message digest value in base 16 (hex)
		md5 = new BigInteger(1, digest.digest()).toString(16);
		return md5;
	}
	
	public static void main(String args[])
	{
		String input = "lll";
		//md5散列
		System.out.println(toMd5(input));
		//md5加密
		System.out.println(convertMD5(toMd5(input)));
		//md5解密
		System.out.println(convertMD5(convertMD5(toMd5(input))));
	}
	
	public static String convertMD5(String inStr){  
		  
        char[] a = inStr.toCharArray();  
        for (int i = 0; i < a.length; i++){  
            a[i] = (char) (a[i] ^ 't');  
        }  
        String s = new String(a);  
        return s;  
  
    }  
	
	
}
