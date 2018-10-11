package sub;

public class square {

	public static void main(String[] args) {
		//인스턴스 생성
		Rectangle rect=new Rectangle(10, 20, 40, 500);
		
		System.out.println("사각형의 넓이: "+rect.square());
		rect.show();
		System.out.println("x, y좌표가 사각형 내에 있는지: "+rect.contain());
	}

}

class Rectangle {
	int x, y;
	int width, height;
	
	//생성자
	Rectangle(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	int square() { //사각형의 넓이 리턴
		return width*height;
	}
	
	void show() { //사각형의 좌표와 넓이 출력
		System.out.println("x좌표: "+x+" y좌표: "+y);
		System.out.println("사각형의 넓이: "+width*height);
	}
	
	boolean contain() { //사각형의 안에 좌표가 있는지 리턴
		if(x<=width&&y<height) return true;
		else return false;
	}
}
