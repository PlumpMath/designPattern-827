package chainOfResponsibility;

public class TLRequestHandle implements RequestHandle 
{
	private RequestHandle rh;

	public TLRequestHandle(RequestHandle rh) 
	{
		this.rh = rh;
	}

	@Override
	public void handleRequest(Request request) 
	{
		if (request instanceof LeaveRequest) 
		{
			System.out.println("Ҫ��٣���Ŀ�鳤����");
		} 
		else 
		{
			rh.handleRequest(request);
		}
	}
}