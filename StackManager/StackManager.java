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
	//Vector 객체 생성
	Vector<T> v=new Vector<T>();
	int tos=0;
	
	@Override
	public T pop() { //원소 삭제
		tos--; //하위 원소로 포인터 이동
		if (tos>=0)
		return v.get(tos);
		//원소가 없으면 null값 반환
		else return null;
	}

	@Override
	public boolean push(T ob) { //원소 추가
		v.add(ob); //Vector 객체에 추가
		tos++; 
		return false;
	}
	
}

//pop과 push기능을 가진 스택 인터페이스 생성
interface IStack<T> {
	T pop();
	boolean push(T ob);
}