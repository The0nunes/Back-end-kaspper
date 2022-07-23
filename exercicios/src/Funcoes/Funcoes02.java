package Funcoes;

import java.util.Scanner;

public class Funcoes02 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite os n�meros para serem comparados: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		int maior = max(a, b, c);
		
		showResult(maior);
		
		sc.close();
	}
	
	public static int max(int a, int b, int c) {
		int aux;
		if(a > b && a > c) {
			aux = a;
		}else if(b > c) {
			aux = b;
		}else {
			aux = c;
		}
		return aux;
	}
	public static void showResult ( int valor) {
		System.out.println("Maior " + valor);
	}
}
