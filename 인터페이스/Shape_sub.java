
public class Shape_sub {

	public static void main(String[] args) {
		Shape[] list=new Shape[3]; //인터페이스 배열 생성
		//동일한 인터페이스를 구현하는 다른 클래스의 인스턴스 생성
		list[0]=new Circle(7);
		list[1]=new Oval(30, 40);
		list[2]=new Rect(20, 50);
		
		for(int i=0; i<list.length; i++)
			list[i].redraw();
		for(int i=0; i<list.length; i++)
			System.out.println("도형 "+i+"의 면적은 "+list[i].getArea()+"입니다");
	}

}
class Circle implements Shape {
	int radius;
	Circle(int radius) {
		this.radius=radius;
	}
	
	@Override
	public double getArea() {
		return radius*radius*pi;
	}

	@Override
	public void draw() {
		System.out.println("반지름이 "+radius+"인 원입니다.");
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
		return (width*height/4)*pi;
	}

	@Override
	public void draw() {
		System.out.println(width+"x"+height+"에 내접하는 타원입니다");
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
	public void draw() {
		System.out.println(width+"x"+height+"크기의 사각형입니다");
	}
	
}

interface Shape { //도형 인터페이스
	final double pi=3.14;
	double getArea(); //도형의 크기 반환
	void draw(); //도형 설명
    default	void redraw() {
    	System.out.println("---다시 그립니다");
    	draw();
    } 
}
