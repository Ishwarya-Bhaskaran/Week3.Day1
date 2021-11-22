package Week3.Assignments;

public class Students {
public void getStudentInfo(int id)
{
	System.out.println("Student info using ID");
}
public void getStudentInfo(String name)
{
	System.out.println("Student info using name");
}
public void getStudentInfo(int id, String name)
{
	System.out.println("Student info using ID and Name");
}
public void getStudentInfo(String email, int phonenum)
{
	System.out.println("Student info using Email and Phone Number");
}
public static void main(String[] args)
{
	Students std= new Students();
	std.getStudentInfo("Ishwarya");
	std.getStudentInfo("abc@gmail.com", 1234);
}
}
