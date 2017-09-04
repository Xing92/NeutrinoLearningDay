import java.lang.reflect.Constructor;

import builder.v2.Person;
import factory.FactoryClass;
import factory.FactoryClass.MachineType;
import factory.Machine;
import singleton.EagerSingleton;
import singleton.LazySingleton;
import factory.Computer;

public class MainClass {

	public static void main(String[] args) {
				
		System.out.println("======Creational Design Patterns======");
		// Creational: Singleton, Factory, AbstractFactory, Builder, Prototype
		
		// Structural: Adapter, Composite, Proxy, Flyweight, Facade, Bridge,
		// Decorator
		
		// Behavior: Template Method, Mediator, Chain of Responsibility,
		// Observer, Strategy, Command, State, Visitor, Interpreter, Iterator,
		// Memento
		MainClass mc = new MainClass();
//		mc.builder();
		mc.factory();
//		mc.singleton();
//		mc.breakSingleton();
		
		
		
	}

	private void builder() {
		System.out.println();
		System.out.println("===Builder===");

		System.out.println("Normal:");
		builder.v1.Person normalPerson = new builder.v1.Person("Ciazynski", "Pawel", null, null, null, null, "Lodz", null, false, false, false);
		System.out.println(normalPerson.toString());

		System.out.println("Try 1:");
		builder.v1.Person person1 = new builder.v1.PersonBuilder().setCity("Lodz").setFirstName("Pawel").setLastName("Ciazynski").build();
		System.out.println(person1.toString());

		System.out.println("Try 2:");
		Person person2 = new Person.PersonBuilder().setCity("Lodz").setFirstName("Pawel").setLastName("Ciazynski").build();
		System.out.println(person2.toString());

		System.out.println("Try 3:");
		builder.v3.Person person3 = new builder.v3.Person.PersonBuilder("Pawel", "Ciazynski", false).setCity("Lodz").build();
		System.out.println(person3.toString());
		
		//TODO: v4 - adnotacje do mandatory parametrow, refleksje
		//TODO: v5 - http://www.algorytm.org/wzorce-projektowe/budowniczy-builder.html
	}

	private void factory() {
		System.out.println();
		System.out.println("===Factory===");

		Machine computer = FactoryClass.getMachine(MachineType.COMPUTER, 2500, 30000);
		Machine server   = FactoryClass.getMachine(MachineType.SERVER, 2000, 30000);

//		Helpers.pm().pmHelper(G2RbsNode).dodoSth();
		
		System.out.println(computer.getRam());
		System.out.println(server.getRam());
//		((Computer) computer).getName();
	}

	private void singleton() {
		System.out.println();
		System.out.println("===Singleton===");

		System.out.println("EagerSingleton:");
		EagerSingleton eSingleton1 = EagerSingleton.getInstance();
		EagerSingleton eSingleton2 = EagerSingleton.getInstance();
		System.out.println("HashCode: " + eSingleton1.hashCode());
		System.out.println("HashCode: " + eSingleton2.hashCode());

		System.out.println("LazySingleton:");
		LazySingleton lSingleton1 = LazySingleton.getInstance();
		LazySingleton lSingleton2 = LazySingleton.getInstance();
		System.out.println("HashCode: " + lSingleton1.hashCode());
		System.out.println("HashCode: " + lSingleton2.hashCode());

	}

	private void breakSingleton() {
		System.out.println();
		System.out.println("===Singleton Break===");
		EagerSingleton eSingleton1 = EagerSingleton.getInstance();
		EagerSingleton eSingleton2 = null;
		try {
			Constructor[] constructors = EagerSingleton.class.getDeclaredConstructors();
			for (Constructor constructor : constructors) {
				constructor.setAccessible(true);
				eSingleton2 = (EagerSingleton) constructor.newInstance();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("HashCode: " + eSingleton1.hashCode());
		System.out.println("HashCode: " + eSingleton2.hashCode());
	}

}
