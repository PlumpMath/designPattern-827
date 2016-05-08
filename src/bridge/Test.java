package bridge;

public class Test 
{
	public static void main(String[] args) 
	{
		Person man = new Man();
		Person lady = new Lady();

		Clothing jacket = new Jacket();
		Clothing trouser = new Trouser();

		jacket.personDressCloth(man);
		jacket.personDressCloth(lady);

		trouser.personDressCloth(man);
		trouser.personDressCloth(lady);
	}
}