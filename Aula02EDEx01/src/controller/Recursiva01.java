package controller;
//1. Criar uma função recursiva que receba 2 valores A e B e, por somas, apresente o resultado da 
//multiplicação de A por B.

public class Recursiva01 
{
	public Recursiva01() 
	{
		super();
	}
	public int multiplica (int a , int b)
	{
		
		if(b==0)
		{
			return 0;
		}
		else
		{
			
			return a+multiplica(a,b-1);
		}
		
	}
	
}
