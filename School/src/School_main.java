
public class School_main {

	public static void main(String[] args) {
		//������ �ڵ带 �ּ�ȭ�ؼ� ����� 4-5�� �̳� 
		
		// �л��̸� �д´�
		// �̸��� ""�� �ƴ� ����
		// 		���������� �д´�
		// 		���������� �д´�
		// 		���������� �д´�
		// 		����/����/���������� �� ArrayList�� ����
		//		���� �л��̸��� �д´�.
		
		// ��� �л��� �̸�/����/����/���������� ���
		// ��� �л��� ��������, ��������, ���������� ���
		// ��� �л��� �������, �������, ������� ������ ���
		// ��ü�л� ���ڸ� ���.
		
		Student student = new Student();
		
		student.getStudentList();
		
		student.display();
		System.out.println();
		
		student.getAllStudentScoreSum();
		System.out.println();
		
		student.getAllStudentAverageScore();
		System.out.println();
		
		student.getAllStudentCount();

	}

}
