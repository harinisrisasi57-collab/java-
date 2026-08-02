import java.util.Scanner;
class employee
{
String empname,address,mobilenum,mailid;
int empid;
double basicpay,da,hra,pf,staffclub,grossSalary,netsalary;
Scanner sc=new Scanner(System.in);
void getDetails()
{
System.out.print("Enter Employee ID:");
empid=sc.nextInt();
sc.nextLine();
System.out.print("Enter Employee Name:");
empname=sc.nextLine();
System.out.print("Enter Address:");
address=sc.nextLine();
System.out.print("Enter mailid:");
mailid=sc.nextLine();
System.out.print("Enter Mobile number:");
mobilenum=sc.nextLine();
System.out.print("Enter Basic pay:");
basicpay=sc.nextDouble();
}
void display(String designation)
{
System.out.println("\n======PAYLSIP======");
System.out.println("Designation:"+designation);
System.out.println("Employee ID:"+empid);
System.out.println("Employee Name:"+empname);
System.out.println("Address:"+address);
System.out.println("Mailid:"+mailid);
System.out.println("Mobile Number:"+mobilenum);
System.out.println("\nBasic pay:"+basicpay);
System.out.println("DA:"+da);
System.out.println("HRA:"+hra);
System.out.println("PF:"+pf);
System.out.println("StaffClub:"+staffclub);
System.out.println("------------------------");
System.out.println("Gross Salary:"+grossSalary);
System.out.println("Net Salary:"+netsalary);
}
}
class Programmer extends employee
{
void calculateSalary()
{
da=basicpay*97/100;
hra=basicpay*10/100;
pf=basicpay*12/100;
staffclub=basicpay*1/100;
grossSalary=basicpay+da+hra;
netsalary=grossSalary-pf-staffclub;
}
}
class AssistantProfessor extends employee{
void calculateSalary()
{
da=basicpay*110/100;
hra=basicpay*20/100;
pf=basicpay*12/100;
staffclub=basicpay*5/100;
grossSalary=basicpay+da+hra;
netsalary=grossSalary-pf-staffclub;
}}
class AssociateProfessor extends employee
{
void calculateSalary()
{
da=basicpay*130/100;
hra=basicpay*30/100;
pf=basicpay*12/100;
staffclub=basicpay*10/100;
grossSalary=basicpay+da+hra;
netsalary=grossSalary-pf-staffclub;
}}
class Professor extends employee
{
void calculateSalary()
{
da=basicpay*140/100;
hra=basicpay*40/100;
pf=basicpay*12/100;
staffclub=basicpay*15/100;
grossSalary=basicpay+da+hra;
netsalary=grossSalary-pf-staffclub;
}
}
public class employeepayroll{
public static void main(String[]args)
{
Scanner sc=new Scanner(System.in);
System.out.println("1.Programmer");
System.out.println("2.Assistant Professor");
System.out.println("3.Associate Professor");
System.out.println("4.Professor");
System.out.print("Enter your choice:");
int choice=sc.nextInt();
switch(choice){
case 1:
Programmer p=new Programmer();
p.getDetails();
p.calculateSalary();
p.display("Programmer");
break;
case 2:
AssistantProfessor ap=new AssistantProfessor();
ap.getDetails();
ap.calculateSalary();
ap.display("AssistantProfessor");
break;
case 3:
AssociateProfessor asp=new AssociateProfessor();
asp.getDetails();
asp.calculateSalary();
asp.display("AssociateProfessor");
break;
case 4:
Professor prof=new Professor();
prof.getDetails();
prof.calculateSalary();
prof.display("Professor");
break;
default:
System.out.println("Invalid choice");
}
}
}