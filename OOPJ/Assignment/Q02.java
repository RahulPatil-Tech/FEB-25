public class Q02{
	public static void main(String[] args){
		int n = 20, m = 90;
		check(n);
		check(m);
	}
	
	public static void check(int a){
		if((n&1) == 0){
			System.out.println(n + " is even");
		} else {
			System.out.println(n + " is odd");
		}
	}
}	
