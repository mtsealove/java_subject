import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	String name, major;
	int student_num;
	float avg_score;
	
	Student(String name, String major, int student_num, float avg_score) {
		this.name=name;
		this.major=major;
		this.student_num=student_num;
		this.avg_score=avg_score;
	}

	public static void main(String[] args) {
		ArrayList<Student> student_list=new ArrayList<Student>();
		Scanner input=new Scanner(System.in);
		
		System.out.println("학생 이름, 학과 학번 학점 평균을 입력하세요");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String tmp=input.nextLine(); //모든 글자를 저장하는 필들
			String[] each=tmp.split(", "); //각각 분리
			String name=each[0];
			String major=each[1];
			int std_num=Integer.parseInt(each[2]);
			float avg=Float.parseFloat(each[3]);
			//객체를 생성하여 리스트에 추가
			student_list.add(new Student(name, major, std_num, avg));
		}
		
		//모든 학생의 정보 출력
		for(int i=0; i<4; i++) 
			show_student(student_list.get(i));
		
		//이름을 입력받고 학생 이름 출력
		while(true) {
			System.out.print("학생 이름>>");
			String name=input.nextLine(); //이름 입력
			if(name.equals("그만"))
				break;
			for(int i=0; i<student_list.size(); i++) { //검색
				if(name.equals(student_list.get(i).name))
					show_student(student_list.get(i));
			}
		}
		input.close();
	}
	
	//학생 객체를 출력하는 메서드
	static void show_student(Student st) {
		System.out.println("--------------");
		System.out.println("이름: "+st.name);
		System.out.println("학과: "+st.major);
		System.out.println("학번: "+st.student_num);
		System.out.println("학점 평균: "+st.avg_score);
	}

}
