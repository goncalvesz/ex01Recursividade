package controller;

/*1. Criar uma aplicação em Java que tenha uma função recursiva que calcule o somatório do N primeiros
número NATURAIS (a função deve retornar zero para números nega�vos)
O Código deve apresentar, em formato de comentário, como foi definida a condição de parada;
O Código deve apresentar, em formato de comentário, como foi definida a relação de chamada dos passos;*/

public class RecursividadeController {

	public RecursividadeController(){
		
	}
	
	public double calcSomatoria(int n) {
		//Optei por utilizar um valor double, uma vez que (13! = 6.227.020.800) > (int max value = 2.147.483.647)
		
		if (n > 0) {
			return n * calcSomatoria(n-1); //a recursiva chama a si mesma enquanto n >= 0, em outras palavras, passando por todos os números positivos desde o valor escolhido para n
		}
		if (n == 0) { //garante que 0! = 1 e começa os retornos das chamadas da recursiva, uma vez que a partir daqui n-1 seria um valor negativo, é o ponto de parada da recursiva
			return 1;
		} else { //retorna zero para numeros negativos
			return 0;
		}
		
	}
	
}
