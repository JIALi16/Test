package com.pa.util;
import java.util.Scanner;
import com.pa.entity.Variate;
public class CaesarEncryption implements Encryption{

	public static void decryption() { 
		Variate variate=new Variate(null, 0, null);
		CaesarEncryption  ja =new CaesarEncryption();//���� ������=new ����();��ָ��Ľ��;������޲������췽��ʵ�������󲢽����������ڴ��� �ø�������������ġ������������ñ���	
			System.out.println("�������������:");
			variate.setContent(extracted().nextLine());
			System.out.println("��������Կ��");
			variate.setNumber(extracted().nextInt());
			int key=variate.getNumber();
			ja.decryption(variate.getContent(),key);//���ý��ܷ���
	}
	public static void encryption() { 
		Variate variate=new Variate(null, 0, null);
		CaesarEncryption  ja =new CaesarEncryption();//���� ������=new ����();��ָ��Ľ��;������޲������췽��ʵ�������󲢽����������ڴ��� �ø�������������ġ������������ñ���
			System.out.println("������������ݣ�");
			variate.setContent(extracted().nextLine());
			System.out.println("��������Կ:");
			variate.setNumber(extracted().nextInt());
			int key=variate.getNumber();//��������ת����int����
			ja.encryption(variate.getContent(),key);//���ü��ܷ���
	}
	private static Scanner extracted() {
		return new Scanner(System.in);
	}
	@Override //���������д���෽���õ�,�����ע����Ա��ⷽ����������д��
	public void encryption(String str, int k) {
		// TODO Auto-generated method stub
		//����
		String string="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='a'&&c<='z')//����ַ����е�ĳ���ַ���Сд��ĸ
			{
				c=(char)(c+(k%26));//�ƶ�key%26λ
				if(c<'a')
					c=(char)(c+26);
				if(c>'z')
					c=(char)(c-26);
			}else if(c>='A'&&c<='Z')//����ַ����е�ĳ���ַ��Ǵ�д��ĸ
			{
				c=(char)(c+(k%26));//�ƶ�key%26λ
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
			string +=c;//�����ܺ���ַ������ַ���
		}
		System.out.println(str+"���ܺ�Ϊ��"+string);		
	}
	@Override
	public void decryption(String str, int n) {
		// TODO Auto-generated method stub
		//����
		int k=Integer.parseInt("-"+n);
		String string="";
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(c>='a'&&c<='z')//����ַ����е�ĳ���ַ���Сд��ĸ
			{
				c=(char)(c+(k%26));//�ƶ�key%26λ
				if(c<'a'){
					c=(char)(c+26);
				}
				if(c>'z'){
					c=(char)(c-26);
							}
			}else if(c>='A'&&c<='Z')//����ַ����е�ĳ���ַ��Ǵ�д��ĸ
			{
				c=(char)(c+(k%26));//�ƶ�key%26λ
				if(c<'A') {
					c=(char)(c+26);
				}
				if(c>'Z') {
					c=(char)(c-26);
				}
			}else{
				if(c>='0'&&c<='9')//����ַ����е�ĳ���ַ�������
				{
					c=(char)(c+(k%10));//�ƶ�key%10λ
					if(c<'0') {
						c=(char)(c+10);
					}
					if(c>'9') {
						c=(char)(c-10);
					}
					
				}

			}
			string +=c;//�����ܺ���ַ������ַ���
		}	
		System.out.println(str+"���ܺ�Ϊ��"+string);	//���������̨
	
	}
}
