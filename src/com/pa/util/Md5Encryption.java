package com.pa.util;

import java.util.Scanner;


//package com.Test;  

//import java.io.UnsupportedEncodingException;  
import java.security.MessageDigest;  

/** 
 * ����MD5���ܽ��� 
 * @author tfq 
 * @datetime 2011-10-13 
 */  
public class Md5Encryption implements Encryption{  
	
	
	//System.out.println("[A.����][B.����],��ѡ��һ��");
	
  

    public static String string2MD5(String inStr){  
        MessageDigest md5 = null;  
        try{
           //����  java.security.MessageDigest������
           // getInstance("MD5")���� ���ü��ܸ�ʽ
            md5 = MessageDigest.getInstance("MD5");  //�˾��Ǻ���
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

  
    // ����������  
   public static void md5() {  
	   System.out.println("����bai��һ���ַ���(�м��ܼӿո�du���zhi��)");
	   try (Scanner input = new Scanner(System.in)) {
		String s = input.nextLine();
      System.out.println("ԭʼ��" + s);  
       System.out.println("MD5���ܺ�" + string2MD5(s));  
	}  
  
    }  
 // ʵ�ֽӿ�
    @Override 
    public void  encryption(String str, int k) {
    	
    }
    @Override 
    public void  decryption(String str, int k) {
    	
    }

}  


   