package decorator;

public class Test 
{
	public static void main(String[] args) 
	{
		Person man = new Man();
		Decorator manDecoratorA = new ManDecoratorA();
		Decorator manDecoratorB = new ManDecoratorB();

		manDecoratorA.setPerson(man);
		manDecoratorB.setPerson(manDecoratorA); // ½«manDecoratorA¸³¸ømanDecoratorB

		manDecoratorB.eat();
	}
}