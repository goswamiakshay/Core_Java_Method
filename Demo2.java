package Method;

public class Demo2 {
	int sum(int k) {
		if(k>0) {
			return k +sum(k-1);
		}else {
			return 0;
		}
	}

	public static void main(String[] args) {
		Demo2 d=new Demo2();
		System.out.println(d.sum(5));
	}

}
