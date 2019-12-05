package es.Studium.BuscarPosicion;
import java.util.Scanner;
public class BuscarPosicion 
{
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String frase;
		char caracter;
		int posicion=-1;
		System.out.println("indique una frase");
		frase=teclado.nextLine();
		System.out.println("indique el caracter a buscar");
		caracter=teclado.next().charAt(0);
		teclado.close();
		for(int i=0;i<frase.length();i++)
		{
			if(frase.charAt(i)==caracter)
			{
				posicion = i;
				i=frase.length();
			}

		}
		if(posicion==-1)
		{
			System.out.println("Caracter no encontrado");
		}
		else
		{
			System.out.println("Se ha encontrado en la posicion"+(posicion+1));
		}
	}

}
