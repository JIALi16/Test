package com.pa.util;
import java.util.Scanner;
import com.pa.entity.Variate;
public class CaesarEncryption implements Encryption{

	public static void decryption() { 
		Variate variate=new Variate(null, 0, null);
		CaesarEncryption  ja =new CaesarEncryption();//类名 对象名=new 类名();用指针的解释就是以无参数构造方法实例化对象并将这个对象的内存引 用赋给“类名”类的“对象名”引用变量	
			System.out.println("请输入解密内容:");
			variate.setContent(extracted().nextLine());
			System.out.println("请输入密钥：");
			variate.setNumber(extracted().nextInt());
			int key=variate.getNumber();
			ja.decryption(variate.getContent(),key);//调用解密方法
	}
	public static void encryption() { 
		Variate variate=new Variate(null, 0, null);
		CaesarEncryption  ja =new CaesarEncryption();//类名 对象名=new 类名();用指针的解释就是以无参数构造方法实例化对象并将这个对象的内存引 用赋给“类名”类的“对象名”引用变量
			System.out.println("请输入加密内容：");
			variate.setContent(extracted().nextLine());
			System.out.println("请输入密钥:");
			variate.setNumber(extracted().nextInt());
			int key=variate.getNumber();//将输入项转换成int类型
			ja.encryption(variate.getContent(),key);//调用加密方法
	}
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
	@Override //这个用于重写父类方法用的,用这个注解可以避免方法名跟参数写错
	public void encryption(String str, int k) {
		// TODO Auto-generated method stub
		//加密
		String string="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='a'&&c<='z')//如果字符串中的某个字符是小写字母
			{
				c=(char)(c+(k%26));//移动key%26位
				if(c<'a')
					c=(char)(c+26);
				if(c>'z')
					c=(char)(c-26);
			}else if(c>='A'&&c<='Z')//如果字符串中的某个字符是大写字母
			{
				c=(char)(c+(k%26));//移动key%26位
				if(c<'A')
					c=(char)(c+26);
				if(c>'Z')
					c=(char)(c-26);
			}else{
				if(c>='0'&&c<='9'){
					c=(char)(c+(k%10));
					if(c<'0')
						c=(char)(c+10);
					if(c>'9')
						c=(char)(c-10);
					
				}
			
				
			
			}
			string +=c;//将解密后的字符连成字符串
		}
		System.out.println(str+"加密后为："+string);		
	}
	@Override
	public void decryption(String str, int n) {
		// TODO Auto-generated method stub
		//解密
		int k=Integer.parseInt("-"+n);
		String string="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='a'&&c<='z')//如果字符串中的某个字符是小写字母
			{
				c=(char)(c+(k%26));//移动key%26位
				if(c<'a'){
					c=(char)(c+26);
				}
				if(c>'z'){
					c=(char)(c-26);
							}
			}else if(c>='A'&&c<='Z')//如果字符串中的某个字符是大写字母
			{
				c=(char)(c+(k%26));//移动key%26位
				if(c<'A') {
					c=(char)(c+26);
				}
				if(c>'Z') {
					c=(char)(c-26);
				}
			}else{
				if(c>='0'&&c<='9')//如果字符串中的某个字符是数字
				{
					c=(char)(c+(k%10));//移动key%10位
					if(c<'0') {
						c=(char)(c+10);
					}
					if(c>'9') {
						c=(char)(c-10);
					}
					
				}

			}
			string +=c;//将解密后的字符连成字符串
		}	
		System.out.println(str+"解密后为："+string);	//输出到控制台
	
	}
}
