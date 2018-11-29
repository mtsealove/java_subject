import java.util.Vector;

public class StackManager {

	public static void main(String[] args) {
		IStack<Integer> stack=new MyStack<Integer>();
		
		for(int i=0; i<10; i++) stack.push(i);
		
		while(true) {
			Integer n=stack.pop();
			if(n==null) break;
			System.out.print(n+" ");
		}
	}

}
class MyStack<T> implements IStack<T> {
	//Vector ��ü ����
	Vector<T> v=new Vector<T>();
	int tos=0;
	
	@Override
	public T pop() { //���� ����
		tos--; //���� ���ҷ� ������ �̵�
		if (tos>=0)
		return v.get(tos);
		//���Ұ� ������ null�� ��ȯ
		else return null;
	}

	@Override
	public boolean push(T ob) { //���� �߰�
		v.add(ob); //Vector ��ü�� �߰�
		tos++; 
		return false;
	}
	
}

//pop�� push����� ���� ���� �������̽� ����
interface IStack<T> {
	T pop();
	boolean push(T ob);
}