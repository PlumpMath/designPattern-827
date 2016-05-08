package chainOfResponsibility;

public class PMRequestHandle implements RequestHandle 
{
	private RequestHandle rh;

	public PMRequestHandle(RequestHandle rh) 
	{
		this.rh = rh;
	}

	@Override
	public void handleRequest(Request request) 
	{
		if (request instanceof AddMoneyRequest) 
		{
			System.out.println("Ҫ��н����Ŀ��������");
		} 
		else 
		{
			rh.handleRequest(request);
		}
	}
}