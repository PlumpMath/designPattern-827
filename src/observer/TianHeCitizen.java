package observer;

public class TianHeCitizen extends Citizen 
{
	public TianHeCitizen(Policeman policeman) 
	{
		setPoliceman();
		register(policeman);
	}

	@Override
	void sendMessenger(String help) 
	{
		setHelp(help);
		for (int i = 0; i < policemans.size(); i++) 
		{
			Policeman policeman = policemans.get(i);
			// ֪ͨ�����ж�
			policeman.action(this);
		}
	}
}