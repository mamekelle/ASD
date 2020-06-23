package lab1;

import java.util.Optional;

public class MySingletonLazy {

	private static MySingletonLazy instance = null;
	
	static int count = 0;

	private MySingletonLazy() {
		count++;
	}
	
	 private static MySingletonLazy setInstance() {
		instance = new MySingletonLazy();
		return instance;
	}
	synchronized public static MySingletonLazy getInstance() {
		return Optional.ofNullable(instance).orElseGet(MySingletonLazy::setInstance);
	}
}
