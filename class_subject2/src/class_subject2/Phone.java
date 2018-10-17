package class_subject2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Phone {

	public static void main(String[] args) {
		PhoneBook[] pb=new PhoneBook[100];
		Scanner input=new Scanner(System.in);
		int count=0;
		//���Ͽ��� ��ȭ��ȣ�� �̸��� �о�� Ŭ���� �迭�� �ν��Ͻ� ����
		File contact=new File("contact.dat");
		try {
			BufferedReader br=new BufferedReader(new FileReader(contact));
			String tmp="";
			String tel, name;
			
			while((tmp=br.readLine())!=null) {
				name=tmp;
				tmp=br.readLine();
				tel=tmp;
				pb[count++]=new PhoneBook(name, tel);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("���� ã�� ����");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� �б� ����");
			e.printStackTrace();
		}
		//�ܼ� �Է����� Ŭ���� �迭�� �� �ν��Ͻ� ����
		while(true) {
			System.out.print("�̸��� ��ȭ��ȣ �Է�>>");
			String et=input.nextLine();
			if(et.equals("q")) break;
			String name=(et.split(" "))[0];
			String tel=(et.split(" "))[1];
			pb[count++]=new PhoneBook(name, tel);
		}

		//�迭�� �� �� ��� �ν��Ͻ� ���
		System.out.println("�ο� ��>>"+count);
		for(int i=0; i<count; i++)
			pb[i].show_all();
		
		//name�ʵ带 �Է¹޾� tel �ʵ� ���
		while(true) {
			boolean isFound=false;
			System.out.print("�˻��� �̸�>>");
			String et=input.nextLine();
			if(et.equals("q")) break;
			for(int i=0; i<count; i++) {
				if(et.equals(pb[i].name)) {
					System.out.println(pb[i].name+"��ȭ��ȣ�� "+pb[i].tel+"�Դϴ�");
					isFound=true;
				}
			}
			if(!isFound) System.out.println(et+"��(��) �����ϴ�");
		}
		input.close();
	}

}
class PhoneBook {
	String name, tel;
	
	PhoneBook(String name, String tel) {
		this.name=name;
		this.tel=tel;
	}
	
	void show_all() {
		System.out.println("�̸��� ��ȭ��ȣ>>"+name+" "+tel);
	}
	
}