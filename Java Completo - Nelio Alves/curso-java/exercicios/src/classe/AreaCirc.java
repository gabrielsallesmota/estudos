package classe;

public class AreaCirc {

	double raio;
	final static double pi = 3.14; //quando coloca static ele associa diretamente a variável a classe. Final é um 
								  // um modificador responsável por transformar a variável em uma constante.
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	
	double area () {
		return pi * Math.pow(raio, 2);
	}
	
	static double area (double raio) {
		return pi * Math.pow(raio, 2);
	}
 }
