package sub;

public class square {

	public static void main(String[] args) {
		//�ν��Ͻ� ����
		Rectangle rect=new Rectangle(10, 20, 40, 500);
		
		System.out.println("�簢���� ����: "+rect.square());
		rect.show();
		System.out.println("x, y��ǥ�� �簢�� ���� �ִ���: "+rect.contain());
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
	
	boolean contain() { //�簢���� �ȿ� ��ǥ�� �ִ��� ����
		if(x<=width&&y<height) return true;
		else return false;
	}
}
