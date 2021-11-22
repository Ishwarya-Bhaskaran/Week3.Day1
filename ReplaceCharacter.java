package Week3.Assignments;

public class ReplaceCharacter {
public static void main(String[] args)
{
	//replace character using string builder 
	String str= new String("I am working with Java8");
	char ch= '11';
	int index= str.indexOf('8');
	
	//original string
	System.out.println("original string is : "+ str);
	
	//new string 
	StringBuilder newstr= new StringBuilder(str);
	newstr.setCharAt(index, ch);
	
	//printing the new string
	System.out.println("original string is : "+ newstr);
	
}
}
