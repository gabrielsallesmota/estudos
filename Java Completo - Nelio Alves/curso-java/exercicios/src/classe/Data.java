package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data (int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	Data (){
		this(1,1,1970);
		
		//Objetos -> null (variável nao aponta para nenhum local de memória, variavel local precisa ser inicializada)
	}
	
	String obterDataFormatada(){
		String formato = "%d/%d/%d"; //por estar dentro do método, é uma variável local
		return String.format(formato, this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(this.obterDataFormatada());
	}	
}



/*
 * DESAFIO 01
 * Criar classe Data, e DataTeste. Tres atributos (dia, mes e ano). Criar uma DataTeste, e dentro tenha metodo main
 *e instancie duas datas.
 *
 * DESAFIO 02
 * Mostrar a data atraves do método obterDataFormatada
 *
 * DESAFIO 03
 * Criar construtores da classe Data. Obs.: Quando for chamado o construtor padrão, ele chame o dia padrao (1/1/1970).
 *
*/