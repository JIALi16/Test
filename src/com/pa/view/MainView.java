package com.pa.view;

import java.util.Scanner;

import com.pa.util.CaesarEncryption;
import com.pa.util.Md5Encryption;

public class MainView {
	public static void main(String[] args) { 
	System.out.println("\n\t 欢迎使用加解密工具1.0版  \n");
	System.out.println("********************************************");
	System.out.println("[A.加密][B.解密],请输入一个(支持大小写)");
	
	boolean con=true;
	do {
		
		Scanner input = new Scanner(System.in);
			
		    // 读写数据
	
		String command =input.nextLine();
		switch(command) {
		case "a":
			//加密界面
			encryption();
			con=true;
			break;
		case "A":	
			//加密界面
			encryption();
			con=true;
			break;
		case "b":	
			//解密界面
			decryption();
			con=true;
			break;
		case "B":	
			//解密界面
			decryption();
			con=true;
			break;	
		default:
			System.out.println("输入错误，请重新输入：");
			con=false;
			
		}
	}while(con!=true);
	
	}
	private static void decryption() {
		CaesarEncryption.decryption();
	
		
		
		
	}
	public static void encryption() {
		
		System.out.println("[A.凯撒加密][B.MD5加密],请输入一个(支持大小写)");
		boolean con2=true;
		do {
			
			Scanner intput=new Scanner(System.in);
			String command =intput.nextLine();
			switch(command) {
			case "a":
				//凯撒加密界面
				CaesarEncryption.encryption();
				con2=true;
				break;
			case "A":	
				//凯撒加密界面
				CaesarEncryption.encryption();
				con2=true;
				break;
			case "b":	
				//MD5加密界面
				Md5Encryption.md5();
				con2=true;
				break;
			case "B":	
				//MD5加密界面
				Md5Encryption.md5();
				con2=true;
				break;	
			default:
				System.out.println("输入错误，请重新输入：");
				con2=false;
				
			}
		}while(con2!=true);
	}

}
