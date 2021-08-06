package exercicios;

import java.lang.Math;
import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int loopLock = 1;
		
		do {
			System.out.println("Digite o primeiro digito:");
			int primeiro = sc.nextInt();
			
			System.out.println("Digite o segundo digito:");
			int segundo = sc.nextInt();
			
			System.out.println("Selecione a operação:");
			System.out.println("1 - (+)");
			System.out.println("2 - (-)");
			System.out.println("3 - (/)");
			System.out.println("4 - (*)");
			System.out.println("5 - (%)");
			System.out.println("6 - (**)");
			System.out.println("7 - (sqrt) (somente do primeiro digito)");
			
			
			int input = sc.nextInt();
			
			
			switch (input) {
			case 1 :
				Soma(primeiro,segundo);
				break;
			case 2 :
				Subtracao(primeiro,segundo);
				break;
			case 3 :
				Divisao(primeiro,segundo);
				break;
			case 4 :
				Multiplica(primeiro,segundo);
				break;
			case 5 :
				Resto(primeiro,segundo);
				break;
			case 6 :
				Exponencial(primeiro,segundo);
				break;
			case 7 :
				Raiz(primeiro);
				break;
			default :
				System.out.println("Opção Invalida, tente novamente");
			}
		
		
			System.out.println("Deseja Cacular novamente? \n 1 - Sim  \n 0 - Não");
			loopLock= sc.nextInt();
			
		 } while (loopLock == 1);
		
		System.out.println("Até Logo");
		
		}
		
		
		static void Soma(int i, int j) {
		
			System.out.println( j + " + "  + i + " = " +  (i+j) + "\n");
		}
		
		static void Subtracao(int i, int j) {
			
			System.out.println( j + " - "  + i + " = " +  (i-j) + "\n");
		}
		
		
		static void Divisao(int i, int j) {
				System.out.println( j + " / "  + i + " = " +  ((float)i/(float)j) + "\n");
		}
		
		static void Multiplica(int i, int j) {
			System.out.println( j + " * "  + i + " = " +  (i*j) + "\n");
		}
		
		static void Resto(int i, int j) {	
			System.out.println( j + " % "  + i + " = " +  (i%j) + "\n");
		}
		
		static void Exponencial(int i, int j) {	
			int aux = i;
			for (int k = j; k > 1 ; k --) {
				aux = aux * i;
			}
			System.out.println( i + " ** "  + j + " = " +  (aux) + "\n");
		}

		static void Raiz (int i) {
			System.out.println("raiz-quadrada (" + i + ") = " + Math.sqrt(i));
		}
	}
	




