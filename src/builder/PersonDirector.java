package builder;

public class PersonDirector 
{
	public Person constructPerson(PersonBuilder personBuilder)
	{
		personBuilder.bulidHead();
		personBuilder.buileBody();
		personBuilder.buildFoot();

		return personBuilder.buildPerson();
	}
}