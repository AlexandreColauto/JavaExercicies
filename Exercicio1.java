package exercicios;
import java.util.*;  

public class Exercicio1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Selecione a operação:");
		System.out.println("1 - (+)");
		System.out.println("2 - (-)");
		System.out.println("3 - (/)");
		System.out.println("4 - (*)");
		System.out.println("5 - Todos");
		
		int input = sc.nextInt();
		switch (input) {
		case 1 :
			Soma();
			break;
		case 2 :
			Subtracao();
			break;
		case 3 :
			Divisao();
			break;
		case 4 :
			Multiplica();
			break;
		case 5 :
			Soma();
			Subtracao();
			Divisao();
			Multiplica();
			break;
		
		}
		
	}
	
	static void Soma() {
		int i = 0,j=0;
		while (i <= 10) {
			j = 0;
			while (j <= 10) {
				System.out.println( j + " + "  + i + " = " +  (i+j) + "\n");
				j++;
			}
			System.out.println("\n");
			i ++;
		}
	}
	
	static void Subtracao() {
		int i = 0,j=0;
		while (i <= 10) {
			j = 0;
			while (j <= 10) {
				System.out.println( j + " - "  + i + " = " +  (i-j) + "\n");
				j++;
			}
			System.out.println("\n");
			i ++;
		}
	}
	
	static void Divisao() {
		int i = 1;
		while (i <= 10) {
			int j = 1;
			while (j <= 10) {
				System.out.println( j + " / "  + i + " = " +  ((float)j/(float)i) + "\n");
				j++;
			}
			System.out.println("\n");
			i ++;
		}
	}
	static void Multiplica() {
		int i = 1;
		while (i <= 10) {
			int j = 1;
			while (j <= 10) {
				System.out.println( j + " * "  + i + " = " +  (j*i) + "\n");
				j++;
			}
			System.out.println("\n");
			i ++;
		}
	}
	
}
