
public class Shape_sub {

	public static void main(String[] args) {
		Shape[] list=new Shape[3]; //�������̽� �迭 ����
		//������ �������̽��� �����ϴ� �ٸ� Ŭ������ �ν��Ͻ� ����
		list[0]=new Circle(7);
		list[1]=new Oval(30, 40);
		list[2]=new Rect(20, 50);
		
		for(int i=0; i<list.length; i++)
			list[i].redraw();
		for(int i=0; i<list.length; i++)
			System.out.println("���� "+i+"�� ������ "+list[i].getArea()+"�Դϴ�");
	}

}
class Circle implements Shape {
	int radius;
	Circle(int radius) {
		this.radius=radius;
	}
	
	@Override
	public double getArea() {
		return radius*radius*3.141592;
	}

	@Override
	public void redraw() {
		System.out.println("---�ٽ� �׸��ϴ�. �������� "+radius+"�� ���Դϴ�.");
	}
	
}
class Oval implements Shape {
	int width, height;
	
	Oval(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double getArea() {
		return (width*height/4)*3.141592;
	}

	@Override
	public void redraw() {
		System.out.println("---�ٽ� �׸��ϴ�. "+width+"x"+height+"�� �����ϴ� Ÿ���Դϴ�");
	}
	
}
class Rect implements Shape {
	int width, height;
	
	Rect(int width, int height) {
		this.width=width;
		this.height=height;
	}
	
	@Override
	public double getArea() {
		return width*height;
	}

	@Override
	public void redraw() {
		System.out.println("---�ٽ� �׸��ϴ�. "+width+"x"+height+"ũ���� �簢���Դϴ�");
	}
	
}

interface Shape { //���� �������̽�
	double getArea(); //������ ũ�� ��ȯ
	void redraw(); //���� ����
}
