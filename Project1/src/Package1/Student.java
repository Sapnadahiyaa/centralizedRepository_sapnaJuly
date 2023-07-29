package Package1;

public class Student {
int age;
int rollno;
public void display1(){
	System.out.println("Automation is very easy.");
}

public void display2(){
System.out.println("Welcome to all of you.");
}

public static void main(String[] args)
{
	Student s1= new Student();
s1.display1();
s1.display2();

s1.age=40;
s1.rollno=20;
System.out.println("Age :"+s1.age);
System.out.println("Rollno :"+s1.rollno);
}
}