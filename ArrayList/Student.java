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
		
		System.out.println("�л� �̸�, �а� �й� ���� ����� �Է��ϼ���");
		for(int i=0; i<4; i++) {
			System.out.print(">>");
			String tmp=input.nextLine(); //��� ���ڸ� �����ϴ� �ʵ�
			String[] each=tmp.split(", "); //���� �и�
			String name=each[0];
			String major=each[1];
			int std_num=Integer.parseInt(each[2]);
			float avg=Float.parseFloat(each[3]);
			//��ü�� �����Ͽ� ����Ʈ�� �߰�
			student_list.add(new Student(name, major, std_num, avg));
		}
		
		//��� �л��� ���� ���
		for(int i=0; i<4; i++) 
			show_student(student_list.get(i));
		
		//�̸��� �Է¹ް� �л� �̸� ���
		while(true) {
			System.out.print("�л� �̸�>>");
			String name=input.nextLine(); //�̸� �Է�
			if(name.equals("�׸�"))
				break;
			for(int i=0; i<student_list.size(); i++) { //�˻�
				if(name.equals(student_list.get(i).name))
					show_student(student_list.get(i));
			}
		}
		input.close();
	}
	
	//�л� ��ü�� ����ϴ� �޼���
	static void show_student(Student st) {
		System.out.println("--------------");
		System.out.println("�̸�: "+st.name);
		System.out.println("�а�: "+st.major);
		System.out.println("�й�: "+st.student_num);
		System.out.println("���� ���: "+st.avg_score);
	}

}
