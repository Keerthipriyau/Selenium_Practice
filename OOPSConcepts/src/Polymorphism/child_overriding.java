package Polymorphism;

public class child_overriding extends parent_overriding{

String name ="QAClickAcademy";


public child_overriding()
{
super();// this should be always be at first line
System.out.println("child class construtor");

}
public void getStringdata()
{
System.out.println(name);
System.out.println(super.name);
}


public void getData()
{
super.getData();
System.out.println("I am in child class");
}
public static void main(String[] args) {
// TODO Auto-generated method stub



	child_overriding cd = new child_overriding();

cd.getStringdata();
cd.getData();
}

}