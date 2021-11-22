package Week3.Assignments;

public class StringCompare {
public static void main(String[] args)
{
	String str1= new String("I am Learning Java");
	String str2= new String ("I am learning java");
	
	if(str1==str2)
	{
		System.out.println("str1 and str2 are equal");
	}
	else System.out.println("str1 and str2 are not equal");
	
	//if (str1.equals(str2))
	//{
	//	System.out.println("str1 and str2 are equal");
	//}
	//else System.out.println("str1 and str2 are not equal");
	
	//if (str1.equalsIgnoreCase(str2))
	//{
	//	System.out.println("str1 and str2 are equal");
	//}
	//else System.out.println("str1 and str2 are not equal");
//}//
System.out.println("Comparing " + str1+ " and "+str2+" : "+str1.equals(str2));
System.out.println("Comparing " + str1+ " and "+str2+" : "+str1.equalsIgnoreCase(str2));
}
}
