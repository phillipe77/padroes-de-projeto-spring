package one.digital.singleton;
/**
 * Singleton "preguiçoso"
 * @author phillipe77
 *
 */
public class SingletonLazy {
	
	private static SingletonLazy instancia;
	private SingletonLazy() {
		super(); 
	}
	
	public static SingletonLazy getInstancia() {
		if(instancia == null) {
			instancia = new SingletonLazy();			
		} 
		return instancia;
	
	}
	
}
