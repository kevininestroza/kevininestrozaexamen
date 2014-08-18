import java.util.Scanner
//Implementar las funciones
//Sugerencia: pueden usar la funcion main para probar sus funciones pero no es necesario
//Recuerden que pueden:
//"devolver" valores con el "return"
//"Imprimir" valores con el "System.out.print"
//"Pedir" valores con el "Scanner"

public class Ejercicios
{
	//devuelve x multiplicado por 2 (1pt)
	int multiplicarPorDos(int x)
	{
		int multiplicadoporDos = x*2;
		return multiplicadoporDos;
	}
	
	//devuelve el numero mayor entre a, b, c y d (2pts)
	int getMayor(int a, int b, int c, int d)
	{
		if((a>b)&&(a>c)&&(a>d))
		{
		return a;
		
}
else if((b>a)&&(b>c)&&(b>d))
{
	return b;
}else
	return c;
}
	

	
	//Pide 2 nombres de personas.
	//Si los nombres son iguales imprime "Tocayos" de lo contrario imprime "No son tocayos". (2pts)
	
	void sonTocayos()
	{
		int nombre1;
		int nombre2;
		System.out.print("Ingrese un nombre");
		Scanner  s = new Scanner (System.in);
		System.out.print("INgrese un segundo nombre" );
		if(nombre1==nombre2)
		{
			return sontocayos;
        }
		}
		
		
		
	
	
	//Imprime 100 numeros que sean multiplos de 5(3pts)
	void imprimirMultiplosDe5()
	{
		int imprimirmultiplo = 100;
		while(x<100);
		
		
		

		
		}
	

	
	//Devuelve true si edad es menor o igual a 25 y promedio mayor o igual a 85 (3pts)
	boolean aplicaBeca(int edad, int promedio)
	{
		if((edad<=25)&&(promedio>=85))
		{
			return true;
		}
			
		return false;
	}
	
	//Pide 4 numeros, si todos son pares devuelve true, de lo contrario devuelve false (4puntos)
	boolean sonPares()
	{
		int numero1;
		int numero2;
		int numero3;
		int numero4;
		
		System.out.print("Ingrese un numero: ");
		Scanner s = new Scanner (System.in);
		System.out.print("Ingrese un segundo numero: ");
		System.out.print("Ingrese un tercer numero: ");
		System.out.print("Ingrese un cuarto numero: ");
		
		
		
		if ((numero1%2)&&(numero2%2)&&(numero3%2)&&(numero4%2))
		{
			return true;
		}
		
		
		return false;
	}
	
	//Pueden probar sus funciones en el main pero no es necesario ni será evaluado
	public static void main(String args[])
	{
		
	}
}
