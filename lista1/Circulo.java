package lista1;

import java.util.Scanner;
public class Circulo {
	public static void main (String[] args) {
		Scanner sc = new Scanner (System.in);
		 System.out.println("Digite o raio da entrada");
		 float raio = sc.nextFloat();
		 float perimetro = 2*3.14f*raio;
		 System.out.println("O valor do perimetro é : "+perimetro);
		 System.out.println("O valor do perimetro é : %21f "+perimetro); 
		 sc.close();	
		 }

}
