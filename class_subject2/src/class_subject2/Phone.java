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
		//파일에서 전화번호와 이름을 읽어와 클래스 배열의 인스턴스 생성
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
			System.out.println("파일 찾기 실패");
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("파일 읽기 실패");
			e.printStackTrace();
		}
		//콘솔 입력으로 클래스 배열에 새 인스턴스 생성
		while(true) {
			System.out.print("이름과 전화번호 입력>>");
			String et=input.nextLine();
			if(et.equals("q")) break;
			String name=(et.split(" "))[0];
			String tel=(et.split(" "))[1];
			pb[count++]=new PhoneBook(name, tel);
		}

		//배열의 수 및 모든 인스턴스 출력
		System.out.println("인원 수>>"+count);
		for(int i=0; i<count; i++)
			pb[i].show_all();
		
		//name필드를 입력받아 tel 필들 출력
		while(true) {
			boolean isFound=false;
			System.out.print("검색할 이름>>");
			String et=input.nextLine();
			if(et.equals("q")) break;
			for(int i=0; i<count; i++) {
				if(et.equals(pb[i].name)) {
					System.out.println(pb[i].name+"전화번호는 "+pb[i].tel+"입니다");
					isFound=true;
				}
			}
			if(!isFound) System.out.println(et+"가(이) 없습니다");
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
		System.out.println("이름과 전화번호>>"+name+" "+tel);
	}
	
}