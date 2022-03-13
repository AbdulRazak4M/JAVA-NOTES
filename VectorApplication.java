// create vector with 10 valuyes and 
// 1. carrange in ascending order withous using Collections.sort()
// 2. find max without using Collections.max()
// 3. search specific value
// 4. Find Occurance of Every Element
// 5. Reverse it without using Collections.reverse() method
// 6. Remove Elemment without using remove() method 

import java.util.*;
public class VectorApplication
{
	public static void main(String[] args) throws Exception
	{
		Vector <Integer> v = new Vector<>(10);
		int capacity = v.capacity();
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter values in Vector");
		for(int i = 0; i < capacity; i++)
		{
			int value = s.nextInt();
			v.add(value);
		}
		
		int key;

	do{
		System.out.println("Select the Choice to perfrom operation:");
		System.out.println("Choice 1 : Sorting in Ascending");
		System.out.println("Choice 2 : Find Max");
		System.out.println("Choice 3: Searching");
		System.out.println("Choice 4 : Find Occurance");
		System.out.println("Choice 5: Reverse");
		System.out.println("Choice 6 : Remove Elements");
		
		key = s.nextInt();
		
		switch(key)
		{
			// sorting in Ascending Order
			case 1:
			{/* by using inbuilt function
				Collections.sort(v);
				*/
				for(int round =0; round < v.size()-1 ; round++)
				{
					for(int i = 0; i< v.size() - 1; i++)
					{
						if(v.get(i) > v.get(i+1))
						{
							int temp = v.get(i);
							v.set(i,v.get(i+1));
							v.set(i+1, temp);
						}
					}
				}
				print(v);
			}
			break;
			
			// Find max Value
			case 2:
			{/*find max by using inbuilt method
				int max = Collections.max(v);*/
				
			 // by using manual Logic
			 int max = (int)v.get(0);
			 for(int v1: v)
			 {
				if(max < v1)
				{
					max = v1;
				}
			 }
			 System.out.println("MAX VALUE IS:" + max);
			 System.out.println("MAX VALUE At INDEX OF:" + v.indexOf(max));
			}
			break;
			
			// Searching the value
			case 3:
			{
				System.out.println("Enter the value you want to Search");
				int search = s.nextInt();
				boolean b = v.contains(search);
				if(b)
				{
					System.out.println("The value is Found");
				}
				else
				{
					System.out.println("The value Not Found");
				}
			}
			break;
			
			//Occurance 
			case 4: 
			{
				
				for(int i=0; i < v.size() - 1; i++)
				{
					int count = 1;
					for(int j = i+1; j<v.size(); j++)
					{
						if((v.get(i) == v.get(j)) && v.get(i) != null )
						{
							count++;
							v.set(j,null);
						}							
					}
					if(v.get(i) != null)
					{
						System.out.println("The Repeat value of "+ v.get(i) + "is" + count);
					}
				}
			}
			break;
			
			// Reverse Elements
			case 5:
			{
				int end = (int)v.size()-1;
				for(int start = 0; start <= end; start++)
				{
					System.out.println("Start: " + start);
					int temp = (int) v.get(start);
					v.set(start, v.get(end));
					v.set(end, temp);
					end--;
				}
				print(v);
			}
			break;
			
			// Remove Element
			case 6:
			{
				System.out.println("Enter the value you want to remove: ");
				int value = s.nextInt();
				int count = 0;
				for(int i = 0; i<v.size()-1; i++)
				{
					if(value == (int)v.get(i))
					{
						for(int j = i; j < v.size()-1; j++)
						{
							v.set(j,v.get(j+1));
						}
						count++;
						//continue;
					}
				}
				System.out.println("After removing Element");
				for(int i = 0; i < v.size()- count; i++)
				{
					System.out.println(v.get(i));
				}
			}
			break;
			
			// false key entered
			default:
			{
				System.out.println("Please Enter the valid choice\n\n");
			}
			break;
		}
	} while(key<1 || key > 6);
	}
	static void print(Vector <Integer> v) throws Exception
	{
		for(int v1: v)
		{
			System.out.println("The value is: " + v1);
		}
	}
}