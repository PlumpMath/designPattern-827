package composite;

public class Programmer extends Employer 
{
	public Programmer(String name) 
	{
		setName(name);
		employers = null; // ����Ա����ʾû������
	}

	@Override
	public void add(Employer employer) 
	{
	}

	@Override
	public void delete(Employer employer)
	{
	}
}