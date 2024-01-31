package Method;

public class Add_Array {
	int sum(int k[],int i) {
		if(i==k.length-1) {
			return k[i];
		}else {
			return k[i]+sum(k,i+1);
		}
	}
	

	public static void main(String[] args) {
		Add_Array AdAr=new Add_Array();
		int a[]= {1,2,3,4,5};
		System.out.println(AdAr.sum(a, 0));
	}

}
