import java.util.Scanner;
interface calculator
{
void add(int a,int b);
void sub(int a,int b);
void mul(int a,int b);
void div(int a,int b);
}
class Arithmetic implements calculator
{
public void add(int a,int b)
{
System.out.println("Addition="+(a+b));
}
public void sub(int a,int b)
{
System.out.println("Subtraction="+(a-b));
}
public void mul(int a,int b)
{
System.out.println("Multiplication="+(a*b));
}public void div(int a,int b)
{
if(b!=0)
System.out.println("Division="+(a/b));
else
System.out.println("Division by zero is not possible");
}
}
class operator
{
public static void main(String []agrs)
{
Scanner sc=new Scanner(System.in);
Arithmetic obj=new Arithmetic();
System.out.print("Enter first number:");
int a=sc.nextInt();
System.out.print("Enter second number:");
int b=sc.nextInt();
System.out.println("1.Addition");
System.out.println("2.Subtration");
System.out.println("3.Multiplication");
System.out.println("4.Division");
System.out.print("Enter your choice:");
int choice=sc.nextInt();
switch(choice)
{
case 1:
obj.add(a,b);
break;
case 2:
obj.sub(a,b);
break;
case 3:
obj.mul(a,b);
break;
case 4:
obj.div(a,b);
break;
default:
System.out.println("Invaild choice");
}
}
}