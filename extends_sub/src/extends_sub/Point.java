package extends_sub;

public class Point {
	private int x, y;
	
	public Point(int x, int y ) {
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		ColorPoint cp=new ColorPoint(5, 6, "yellow");
		
		System.out.println(cp.color);
		System.out.println("x: "+cp.getX()+" y: "+cp.getY());
		cp.setXY(10, 20);
		cp.setColor("red");
		
		System.out.println(cp.color);
		System.out.println("x: "+cp.getX()+" y: "+cp.getY());
	}
	public int getX() { //x좌표 반환
		return x;
	}
	public int getY() { //y좌표 반환
		return y;
	}
	protected void move(int x, int y) { //좌표 이동 메서드
		this.x=x;
		this.y=y;
	}
}

class ColorPoint extends Point {
	String color;
	int x, y;
	ColorPoint(int x, int y, String color) {
		super(x, y); //private변수 접근
		this.color=color;
	}
	void setXY(int x, int y) { //좌표 이동 메서드
		move(x, y); //private변수에 접근
	}
	void setColor(String color) {
		this.color=color;
	}

}