package com.pa.view;

import java.util.Scanner;

import com.pa.util.CaesarEncryption;
import com.pa.util.Md5Encryption;

public class MainView {
	public static void main(String[] args) { 
	System.out.println("\n\t ��ӭʹ�üӽ��ܹ���1.0��  \n");
	System.out.println("********************************************");
	System.out.println("[A.����][B.����],������һ��(֧�ִ�Сд)");
	
	boolean con=true;
	do {
		
		Scanner input = new Scanner(System.in);
			
		    // ��д����
	
		String command =input.nextLine();
		switch(command) {
		case "a":
			//���ܽ���
			encryption();
			con=true;
			break;
		case "A":	
			//���ܽ���
			encryption();
			con=true;
			break;
		case "b":	
			//���ܽ���
			decryption();
			con=true;
			break;
		case "B":	
			//���ܽ���
			decryption();
			con=true;
			break;	
		default:
			System.out.println("����������������룺");
			con=false;
			
		}
	}while(con!=true);
	
	}
	private static void decryption() {
		CaesarEncryption.decryption();
	
		
		
		
	}
	public static void encryption() {
		
		System.out.println("[A.��������][B.MD5����],������һ��(֧�ִ�Сд)");
		boolean con2=true;
		do {
			
			Scanner intput=new Scanner(System.in);
			String command =intput.nextLine();
			switch(command) {
			case "a":
				//�������ܽ���
				CaesarEncryption.encryption();
				con2=true;
				break;
			case "A":	
				//�������ܽ���
				CaesarEncryption.encryption();
				con2=true;
				break;
			case "b":	
				//MD5���ܽ���
				Md5Encryption.md5();
				con2=true;
				break;
			case "B":	
				//MD5���ܽ���
				Md5Encryption.md5();
				con2=true;
				break;	
			default:
				System.out.println("����������������룺");
				con2=false;
				
			}
		}while(con2!=true);
	}

}
