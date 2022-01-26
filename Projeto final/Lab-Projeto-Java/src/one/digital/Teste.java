package one.digital;

import one.digital.facade.facade;
import one.digital.singleton.*;
import one.digital.strategy.Robo;
import one.digital.strategy.*;

public class Teste {

	public static void main (String[] args) {
		// singleton
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		
		
		// strategy
		
		Comportamento normal = new ComportamentoNormal();
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		robo.setComportamento(normal);
		
		robo.mover();
		robo.mover();
		
		
		// Facade
		
		facade facade = new facade();
		facade.migrarCliente("Phillipe","65138000");
		
		
	}

}
