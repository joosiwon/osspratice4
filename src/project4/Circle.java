package project4;
/*
public class Circle {
	int radius;
	String name;
	
	public Circle() {}
	public double getArea()
	{
		return 3.14*radius*radius;
	}

	public static void main(String[] args)
	{
		Circle pizza = new Circle();
		pizza.radius = 10;
		pizza.name = "�ڹ�����";
		double area = pizza.getArea();
		System.out.println(pizza.name + "�� ������"+ area);
		
		Circle donut = new Circle();
		donut.radius = 2;
		donut.name = "�ڹٵ���";
		area = donut.getArea();
		System.out.println(donut.name + "�� ������"+ area);
		
	}

}
*/

public class Circle {
int radius;
String name;

public Circle() 
{ // �Ű� ���� ���� ������
radius = 1; name = ""; // radius�� �ʱⰪ�� 1
}
public Circle(int r, String n)
{ // �Ű� ������ ���� ������
radius = r; name = n;
}
public double getArea() 
{
return 3.14*radius*radius;
}
public static void main(String[] args)

{
Circle pizza = new Circle(10, "�ڹ�����"); // Circle ��ü ����, ������ 10
double area = pizza.getArea();
System.out.println(pizza.name + "�� ������ " + area);
Circle donut = new Circle(); // Circle ��ü ����, ������ 1
donut.name = "��������";
area = donut.getArea();
System.out.println(donut.name + "�� ������ " + area);
}

}