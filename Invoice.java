import java.util.Scanner;
class Invoice{
String part_number;
String part_description;
int quantity;
double price_item;
public double total=0;
Invoice(){
String part_number="";
String part_description="";
int quantity=0;
double price_item=0.0;
}
public String getPart_number(){
return part_number;
}
public void setPart_number(String part_number){
this.part_number=part_number;
}
public String getPart_description(){
return part_description;
}
public void setPart_description(String part_description){
this.part_description=part_description;
}
public int getQuantity(){
return quantity;
}
public void setQuantity(int quantity){
if(quantity<0)
quantity=0;
else
this.quantity=quantity;
}
public double getPrice_item(){
return price_item;
}
public void setPrice_item(double price_item){
if(price_item<0)
price_item=0.0;
else
this.price_item=price_item;
}
double getInvoiceAmount(){
totalprice();
return total;
}
 void totalprice(){
total=total+getQuantity()*getPrice_item();
}
}
class Main
{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
Invoice in=new Invoice();
System.out.println("enter part number");
in.setPart_number(sc.nextLine());
System.out.println("enter part description");
in.setPart_description(sc.nextLine());
System.out.println("enter no.of items purchased:");
in.setQuantity(sc.nextInt());
System.out.println("enter prive per item:");
in.setPrice_item(sc.nextDouble());
System.out.println("part numbr="+in.getPart_number());
System.out.println("\n part description:"+in.getPart_description());
System.out.println("\ntotal billing amount:"+in.getInvoiceAmount());
}
}
