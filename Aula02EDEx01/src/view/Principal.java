package view;
import controller.Recursiva01;
public class Principal {

	public static void main(String[] args) 
	{
		Recursiva01 funcao = new Recursiva01();
		
		int a=4;
		int b=3;
		int res =funcao.multiplica(a, b);
		System.out.println(res);
		
		
	}

}
