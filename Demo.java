package Method;

public class Demo {
	int sum(int a,int b) {
		return a + b;
	}

	public static void main(String[] args) {
		Demo d=new Demo();
		int a=d.sum(20, 40);
		System.out.println(a);
	}

}
