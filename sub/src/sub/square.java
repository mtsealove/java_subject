package sub;

public class square {

	public static void main(String[] args) {
		//�ν��Ͻ� ����
		Rectangle rect=new Rectangle(10, 20, 400, 500);
		
		System.out.println("�簢���� ����: "+rect.square());
		rect.show();
		System.out.println("x, y��ǥ�� �簢�� ���� �ִ���: "+rect.contain(new Rectangle(20, 30, 100, 300)));
	}

}

class Rectangle {
	int x, y;
	int width, height;
	
	//������
	Rectangle(int x, int y, int width, int height) {
		this.x=x;
		this.y=y;
		this.width=width;
		this.height=height;
	}
	
	int square() { //�簢���� ���� ����
		return width*height;
	}
	
	void show() { //�簢���� ��ǥ�� ���� ���
		System.out.println("x��ǥ: "+x+" y��ǥ: "+y);
		System.out.println("�簢���� ����: "+width*height);
	}
	
	boolean contain(Rectangle r) { //�簢���� �ȿ� ��ǥ�� �ִ��� ����
		if(r.x>x&&r.y>y) {
			if(r.x+r.width<x+width&&r.y+r.height<y+height) return true;
			else return false;
		}
		else return false;
	}
}
