package observer;

public class HuangPuPoliceman implements Policeman 
{
	@Override
	public void action(Citizen citizen) 
	{
		String help = citizen.getHelp();
		if ("normal".equals(help)) 
		{
			System.out.println("һ���������������");
		} 
		else if ("unnormal".equals(help)) 
		{
			System.out.println("�з�����Ϊ�����Ҿ������");
		}
	}
}