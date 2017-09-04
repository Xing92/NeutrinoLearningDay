package singleton;

public class LazySingleton {
	
	private static LazySingleton lazySingleton;
	
	private LazySingleton(){
		System.out.println("LazySingleton Created");
		}
	
	public synchronized static LazySingleton getInstance(){
		if(lazySingleton==null){
			lazySingleton = new LazySingleton();
		}
		return lazySingleton;
	}
	
	public static void dada(){
		
	}

}
