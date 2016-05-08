package observer;

public class Test 
{
	public static void main(String[] args) 
	{
		// ��Ӿ��������
		Policeman tianHePoliceman = new TianHePoliceman();
		Citizen tianHeCitizen = new TianHeCitizen(tianHePoliceman);
		tianHeCitizen.sendMessenger("normal");
		tianHeCitizen.sendMessenger("unnormal");

		// ���Ҿ��������
		Policeman huangPuPoliceman = new HuangPuPoliceman();
		Citizen huangPuCitizen = new HuangPuCitizen(huangPuPoliceman);
		huangPuCitizen.sendMessenger("normal");
		huangPuCitizen.sendMessenger("unnormal");
	}
}