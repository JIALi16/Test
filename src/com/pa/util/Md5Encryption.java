package com.pa.util;

import java.util.Scanner;


//package com.Test;  

//import java.io.UnsupportedEncodingException;  
import java.security.MessageDigest;  

/** 
 * 采用MD5加密解密 
 * @author tfq 
 * @datetime 2011-10-13 
 */  
public class Md5Encryption implements Encryption{  
	
	
	//System.out.println("[A.加密][B.解密],请选择一个");
	
  

    public static String string2MD5(String inStr){  
        MessageDigest md5 = null;  
        try{
           //引用  java.security.MessageDigest公共类
           // getInstance("MD5")方法 设置加密格式
            md5 = MessageDigest.getInstance("MD5");  //此句是核心
        }catch (Exception e){  
            System.out.println(e.toString());  
            e.printStackTrace();  
            return "";  
        }  
        char[] charArray = inStr.toCharArray();  
        byte[] byteArray = new byte[charArray.length];  
  
        for (int i = 0; i < charArray.length; i++)  
            byteArray[i] = (byte) charArray[i];  
        byte[] md5Bytes = md5.digest(byteArray);  
        StringBuffer hexValue = new StringBuffer();  
        for (int i = 0; i < md5Bytes.length; i++){  
            int val = ((int) md5Bytes[i]) & 0xff;  
            if (val < 16)  
                hexValue.append("0");  
            hexValue.append(Integer.toHexString(val));  
        }  
        return hexValue.toString();  
  
    }  

  
    // 测试主函数  
   public static void md5() {  
	   System.out.println("请输bai入一个字符串(中间能加空格du或符zhi号)");
	   try (Scanner input = new Scanner(System.in)) {
		String s = input.nextLine();
      System.out.println("原始：" + s);  
       System.out.println("MD5加密后：" + string2MD5(s));  
	}  
  
    }  
 // 实现接口
    @Override 
    public void  encryption(String str, int k) {
    	
    }
    @Override 
    public void  decryption(String str, int k) {
    	
    }

}  


   