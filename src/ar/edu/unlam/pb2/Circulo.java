package ar.edu.unlam.pb2;

public class Circulo {

		private Double radio; 
		
			public Double calcularPerimetro ()  	/* Firma del metodo (tipo de variable, tipo de retorno, nombre y parametros) */
			
			{
					Double perimetro; 				/* variable interna del metodo - Ctrl+Space para autocompletar */
					perimetro = 2*Math.PI*radio;
					return perimetro; 				/* Retorno valor del perimetro -  Ctrl+Shif+7 para autocomentar */
			} 
			
			public Double calcularArea ()
			
			{
					return Math.PI*(radio*radio); 	/* Retorna el valor del area */
			}
			
			public void guardaRadio (Double radio1)
			{
				radio = radio1;
			}
			
}
