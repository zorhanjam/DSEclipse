
public class ExceptionsOrder {
	public static void main(String[] args) {
		int N = 10;
		for(int i = 1; i < N; i++) {
			for(int j = 1; j < i; j++)
				System.out.print("*");
			System.out.println();
		}
		
		for(int i = 1; i < N; i *=2) {
			System.out.println(i);		
		}
		
		
		System.out.println("main()");
		methodA();
		System.out.println("main()");
	}

	public static void methodA() {
		System.out.println("A()");
		methodB();
		System.out.println("A()");
	}

	public static void methodB() {
		System.out.println("B()");
		int x = 1 / 0;
		System.out.println("B()");
	}
}
