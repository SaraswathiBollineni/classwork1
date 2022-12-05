import java.util.Scanner;
class Employee{
double bp,da,hra,pf,scf,gs,ns;
Scanner sc=new Scanner(System.in);
Scanner scs=new Scanner(System.in);
String emp_name,emp_id,address,mail_id;
long mobileno;
void getdata(){
System.out.println("enter employee name:");
emp_name=sc.nextChar();
System.out.println("employee id:");
emp_id=sc.next();
System.out.println("enter employee address:");
address=sc.next();
System.out.println("enter employeemailid:");
mail_id=sc.next();
System.out.println("enter employee mobileno:");
mobileno=sc.nextLong();
}
void cal(){
System.out.println("enter basic pay of employee:");
bp=sc.nextDouble();
da=(97/100)*bp;
hra=(10/100)*bp;
pf=(12/100)*bp;
scf=(0.1/100)*bp;
gs=bp+da+hra+pf;
ns=gs-pf-scf;
}
void payslip1(){
System.out.println("programmr name:"+emp_name);
System.out.println("programmer id:"+emp_id);
System.out.println("programmer address:"+address);
System.out.println("programmer mail id:"+mail_id);
System.out.println("programmer mobileno:"+mobileno);
System.out.println("programmer da:"+da);
System.out.println("programmer hra:"+hra);
System.out.println("programmer pf:"+pf);
System.out.println("programmer scf:"+scf);
System.out.println("programmer gross salary:"+gs);
System.out.println("programmer net salary:"+ns);
}
void payslip2(){
System.out.println("assistant professor name:"+emp_name);
System.out.println("assistant professor  id:"+emp_id);
System.out.println( "assistant professor address:"+address);
System.out.println("assistant proffessor mail id:"+mail_id);
System.out.println("assistant professor mobileno:"+mobileno);
System.out.println("assistant professor da:"+da);
System.out.println("assistant professor hra:"+hra);
System.out.println("assistant professorr pf:"+pf);
System.out.println("assistant professor scf:"+scf);
System.out.println("assistant professor gross salary:"+gs);
System.out.println("assistant professor net salary:"+ns);
}
void payslip3(){
System.out.println("associate proffessor name:"+emp_name);
System.out.println("associate professor id:"+emp_id);
System.out.println("associate professor address:"+address);
System.out.println("associate professor mail id:"+mail_id);
System.out.println("associate professor mobileno:"+mobileno);
System.out.println("associate professor da:"+da);
System.out.println("associate professor hra:"+hra);
System.out.println("associate professor pf:"+pf);
System.out.println("associate professor scf:"+scf);
System.out.println("associate professor gross salary:"+gs);
System.out.println("associate professor net salary:"+ns);
}
void payslip4(){
System.out.println("proffessorname:"+emp_name);
System.out.println("professor id:"+emp_id);
System.out.println(" professoraddress:"+address);
System.out.println("professor mail id:"+mail_id);
System.out.println("professorr mobileno:"+mobileno);
System.out.println("professor da:"+da);
System.out.println("professor hra:"+hra);
System.out.println("professor pf:"+pf);
System.out.println("professor scf:"+scf);
System.out.println("professor gross salary:"+gs);
System.out.println("professor net salary:"+ns);
}
}
class Programmer extends Employee{
Programmer(){
getdata();
cal();
payslip1();
}
}
class AssistantProfessor extends Employee
{
AssistantProfessor(){
getdata();
cal();
payslip2();
}
}
class AssociateProfessor extends Employee{
AssociateProfessor(){
getdata();
cal();
payslip3();
}
}
class Professor extends Employee{
Professor(){
getdata();
cal();
class Lab8
payslip4();
}
}
{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
Employee in=new Employee();
int choice;
do{
System.out.println("###menu for type of employee###");
System.out.println("1.programmer\n2.assistant professor\n3.associate professor\n4.professor");
System.out.println("enter your choice:");
choice=sc.nextInt();
switch(choice){
case 1:
System.out.println("programmer details");
Programmer p=new Programmer();
break;
case 2:
System.out.println("assistant professor details:");
AssistantProfessor a=new AssistantProfessor();
break;
case 3:
System.out.println("Associate professor details");
AssociateProfessor b=new AssociateProfessor();
break;
case 4:
System.out.println("professor details");
Professor c=new Professor();
break;
}
}while(choice!=5);
}
} 

