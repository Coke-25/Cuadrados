package es.studium.Cuadrados;

public class Cuadrados 
{

	public static void main(String[] args) 
	{
		System.out.println("El resultado es: " + funcuadrados());
	}
	public static int funcuadrados()
	{
		int resultado, i;
		resultado=0;
		for (i=0;i<100;i++)
		{
			 resultado=resultado+(i*i);
		}
		return(resultado);
	}

}
