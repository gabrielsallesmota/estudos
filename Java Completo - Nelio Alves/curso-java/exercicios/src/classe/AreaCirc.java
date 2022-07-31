package classe;

public class AreaCirc {

	double raio;
	final static double pi = 3.14; //quando coloca static ele associa diretamente a vari�vel a classe. Final � um 
								  // um modificador respons�vel por transformar a vari�vel em uma constante.
	
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
