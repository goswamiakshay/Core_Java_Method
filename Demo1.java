package Method;

public class Demo1 {
	
	void show(int a) {
		System.out.println("hello world");
		if(a<10) {
			show(a+1);
		}
		
	}
	public static void main(String[] args) {
		Demo1 d=new Demo1();
		d.show(0);
	}

}
