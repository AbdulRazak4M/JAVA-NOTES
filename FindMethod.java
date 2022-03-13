import java.lang.reflect.*;
public class FindMethod
{
	public static void main(String[] args) throws Exception // might thorw classNotFound
	{
		int count = 0; 
		// Load the class
		Class c = Class.forName("java.util.List"); // Class Name you want to check
		Method[] m = c.getDeclaredMethods(); // to get mathods name
		for(Method m1 : m)
		{
			count++;
			System.out.println(m1.getName());
		}
		System.out.println("Total Methods" + count);
	}
}
