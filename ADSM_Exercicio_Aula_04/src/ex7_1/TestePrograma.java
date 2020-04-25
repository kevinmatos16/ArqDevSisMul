package ex7_1;

public abstract class TestePrograma 
{
	private final String str;
	
	public TestePrograma(String str)
	{
		this.str = str;
	}
	
	public final void rodar()
	{
		Maiuscula();
		Minuscula();
		Inverte();
		Duplica();
	}
	
	public void Maiuscula()
	{
		System.out.println(str.toUpperCase());
	}
	
	public void Minuscula()
	{
		System.out.println(str.toLowerCase());
	}
	
	public void Inverte()
	{
		StringBuffer stringBuffer = new StringBuffer(str);
		stringBuffer.reverse();
		System.out.println(stringBuffer);
	}
	
	public void Duplica()
	{
		System.out.println(str+str);
	}
}