import java.lang.reflect.*;
public class FindMethod
{
	public static void main(String[] args) throws Exception
	{
		int count = 0;
		Class c = Class.forName("java.util.List");
		Method[] m = c.getDeclaredMethods();
		for(Method m1 : m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("Totla Methods" + count);
	}
}