package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCirculo {

	@Test
	public void testCalculaElPerimetroDeUnCirculo () 
	
	{
		Circulo miCirculo1 = new Circulo ();  /* Tipo de dato (Clase), objeto, (= new Circulo) es el Constructor INICIALIZA */ 
			miCirculo1.guardaRadio(8.0);
		
		Circulo miCirculo2 = new Circulo ();  /* Estos son objetos de clase Circulo */
			miCirculo2.guardaRadio(6.0);
		
			Double perimetro1;
			perimetro1 = miCirculo1.calcularPerimetro();
			
			Double perimetro2;
			perimetro2 = miCirculo2.calcularPerimetro();
			
		Assert.assertEquals(50.26, perimetro1, 0.01);
		Assert.assertEquals(37.69, perimetro2, 0.01);
	}
	
	@Test
	public void testQueCalculaElAreaDeUnCirculo()
	{
		Circulo miCirculo1 = new Circulo();
			miCirculo1.guardaRadio(5.0);
			
			Double area1;
			area1 = miCirculo1.calcularArea();
			
			Assert.assertEquals(78.53, area1, 0.01);
			
		Circulo miCirculo2 = new Circulo();
			miCirculo2.guardaRadio(9.0);
			
			Double area2;
			area2 = miCirculo2.calcularArea();
			
			Assert.assertEquals(254.46, area2, 0.01);
	}

}
