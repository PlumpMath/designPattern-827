package memento;

public class Test 
{
	public static void main(String[] args) 
	{
		Originator originator = new Originator();
		originator.setState("������");

		// �����ݷ�װ��caretaker��
		Caretaker caretaker = new Caretaker();
		caretaker.setMemento(originator.createMemento());

		// �ı�state����ʾ
		originator.setState("˯����");
		originator.showState();

		// �����ݴ�caretaker���µ���originator����ʾ
		originator.setMemento(caretaker.getMemento());
		originator.showState();
	}
}