package one.digital.singleton;
/**
 * Singleton "apressado"
 * @author phillipe77
 *
 */
public class SingletonEager {
	
	private static SingletonEager instancia = new SingletonEager();
	
	private SingletonEager() {
		super(); 
	}
	
	public static SingletonEager getInstancia() {
		return instancia;
	
	}
	
}
