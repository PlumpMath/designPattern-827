package builder;

public class ManBuilder implements PersonBuilder 
{
	private Person person;

	public ManBuilder() {
		person = new Man();
	}

	@Override
	public void bulidHead() {
		person.setHead("building man's head");
	}

	@Override
	public void buileBody() {
		person.setBody("building man's body");
	}

	@Override
	public void buildFoot() {
		person.setFoot("building man's foot");
	}

	@Override
	public Person buildPerson() {
		return person;
	}
}