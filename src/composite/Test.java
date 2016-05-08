package composite;

import java.util.List;

public class Test 
{
	public static void main(String[] args) 
	{
		Employer projectManager = new ProjectManager("��Ŀ����");
		Employer projectAssistant = new ProjectAssistant("��Ŀ����");
		Employer programmer1 = new Programmer("����Ա1");
		Employer programmer2 = new Programmer("����Ա2");

		projectManager.add(projectAssistant); // Ϊ��Ŀ���������Ŀ����
		projectManager.add(programmer1);      // Ϊ��Ŀ������ӳ���Ա1
		projectManager.add(programmer2);      // Ϊ��Ŀ������ӳ���Ա2

		List<Employer> employers = projectManager.getEmployers();
		for (Employer employer : employers) {
			System.out.println(employer.getName());
		}
	}
}