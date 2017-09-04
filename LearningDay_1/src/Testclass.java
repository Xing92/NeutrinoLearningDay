
public class Testclass {

	int a, b, c;
	static final int DEFAULT = 10;
	int d;

	public Testclass(int a, int b, int c) {
		this(a, b, c, DEFAULT);
	}

	public Testclass(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int myMethod(int a, int b) {
		return myMethod(a, b, 0);
	}

	public int myMethod(int a, int b, int c) {
		return 0;
	}
}
