package chainOfResponsibility;

public class HRRequestHandle implements RequestHandle 
{
	@Override
	public void handleRequest(Request request) 
	{
		if (request instanceof DimissionRequest) 
		{
			System.out.println("Ҫ��ְ����������");
		}
		
		System.out.println("�������");
	}
}