import java.util.Scanner;
class student
{
	int rollno;
	String name;
	public void detail()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of student:");
		name = scan.nextLine();
		System.out.println("Enter roll no of student:");
		rollno=scan.nextInt();
	}
	public void display()
	{
		System.out.println("Student name is "+ name + "and student rollno is "+rollno);
	}
}
public class objofarray
{
	public static void main(String args[])
	{
		Scanner scan = new Scanner (System.in);
		int no,i;
		System.out.println("Enter total no of student:");
		no=scan.nextInt();
		student obj[]=new student[no];
		for(i=0;i<no;i++)
		{
			obj[i]=new student();
			obj[i].detail();
		}
		for(i=0;i<no;i++)
		{
			obj[i].display();
		}
	}
}
		