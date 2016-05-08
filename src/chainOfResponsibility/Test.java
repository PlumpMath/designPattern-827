package chainOfResponsibility;

public class Test 
{
	public static void main(String[] args) 
	{
		// 按照下面的赋值方式，可以将所有的请求交给tl处理
		// tl是接受请求的第一对象，它会智能交给其它对象处理
		RequestHandle hr = new HRRequestHandle();
		RequestHandle pm = new PMRequestHandle(hr);  // 将hr赋值给pm，当pm处理不了时，hr处理
		RequestHandle tl = new TLRequestHandle(pm);  // 将pm赋值给tl，当tl处理不了时，pm处理

		// 处理离职
		Request request = new DimissionRequest();
		tl.handleRequest(request);

		// 处理请假
		request = new LeaveRequest();
		tl.handleRequest(request);

		// 处理加薪
		request = new AddMoneyRequest();
		pm.handleRequest(request);
	}
}