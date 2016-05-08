package chainOfResponsibility;

public class Test 
{
	public static void main(String[] args) 
	{
		// ��������ĸ�ֵ��ʽ�����Խ����е����󽻸�tl����
		// tl�ǽ�������ĵ�һ�����������ܽ�������������
		RequestHandle hr = new HRRequestHandle();
		RequestHandle pm = new PMRequestHandle(hr);  // ��hr��ֵ��pm����pm������ʱ��hr����
		RequestHandle tl = new TLRequestHandle(pm);  // ��pm��ֵ��tl����tl������ʱ��pm����

		// ������ְ
		Request request = new DimissionRequest();
		tl.handleRequest(request);

		// �������
		request = new LeaveRequest();
		tl.handleRequest(request);

		// �����н
		request = new AddMoneyRequest();
		pm.handleRequest(request);
	}
}