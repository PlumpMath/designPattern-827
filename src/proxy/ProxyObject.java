package proxy;

public class ProxyObject implements Object 
{
	private Object object;

	public ProxyObject() 
	{
		System.out.println("���Ǵ�����");
		object = new ObjectImpl();
	}

	@Override
	public void action() 
	{
		System.out.println("����ʼ");
		object.action();
		System.out.println("�������");
	}
}