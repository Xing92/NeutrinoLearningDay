package singleton;

public class EagerSingleton {

	private static EagerSingleton eagerSingleton = new EagerSingleton();

	private EagerSingleton() {
		System.out.println("EagerSingleton Created");
	}

	public static EagerSingleton getInstance() {
		return eagerSingleton;
	}

	public void test123() {
		System.out.println("DADA");
	}

	public static void dada() {

	}
}
