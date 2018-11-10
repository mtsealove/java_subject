package extends_sub;

public class Point {
	private int x, y;
	
	public Point(int x, int y ) {
		this.x=x;
		this.y=y;
	}
	public static void main(String[] args) {
		ColorPoint cp=new ColorPoint(5, 6, "yellow");
		
		System.out.println("cp.color: "+ cp.color);
		System.out.println("x: "+cp.getX()+" y: "+cp.getY());
		cp.setXY(10, 20);
		cp.setColor("red");
		
		System.out.println("cp.color: "+cp.color);
		System.out.println("x: "+cp.getX()+" y: "+cp.getY());
	}
	public int getX() { //x��ǥ ��ȯ
		return x;
	}
	public int getY() { //y��ǥ ��ȯ
		return y;
	}
	protected void move(int x, int y) { //��ǥ �̵� �޼���
		this.x=x;
		this.y=y;
	}
}

class ColorPoint extends Point {
	String color;
	int x, y;
	ColorPoint(int x, int y, String color) {
		super(x, y); //private���� ����
		this.color=color;
	}
	void setXY(int x, int y) { //��ǥ �̵� �޼���
		System.out.println("setXY ȣ��");
		move(x, y); //private������ ����
	}
	void setColor(String color) {
		System.out.println("setColor ȣ��");
		this.color=color;
	}

}