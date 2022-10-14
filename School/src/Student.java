import java.util.ArrayList;
import java.util.Scanner;

public class Student {
	ArrayList<String> sname;
	ArrayList<Integer> english;
	ArrayList<Integer> korean;
	ArrayList<Integer> math;
	
	public Student() {
		this.sname = new ArrayList<String>();
		this.english = new ArrayList<Integer>();
		this.korean = new ArrayList<Integer>();
		this.math = new ArrayList<Integer>();
	}
	
	
	public void addName(String name) {
		this.sname.add(name);
	}
	
	public void addEnglish(int escore) {
		this.english.add(escore);
	}
	
	public void addKorean(int kscore) {
		this.korean.add(kscore);
	}
	
	public void addMath(int mscore) {
		this.math.add(mscore);
	}
	
	
	
	public String getName(int i) {
		return this.sname.get(i);
	}
	
	public int getEnglishScore(int i) {
		return this.english.get(i);
	}
	public int getKoreanScore(int i) {
		return this.korean.get(i);
	}
	public int getMathScore(int i) {
		return this.math.get(i);
	}
	
	public int getSize() {
		return this.sname.size();
	}
	
	
	public void display() {
		for(int i=0; i<getSize(); i++) {
			System.out.println("�̸�: "+this.getName(i)+","
					+"��������: "+ this.getEnglishScore(i)+","
					+"��������: "+ this.getKoreanScore(i)+","
					+"��������: "+ this.getMathScore(i));
		}
	}
	
	
	public void getStudentList() {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		System.out.println("�л��̸��� �Է��ϼ���: ");
		String name = s.nextLine();
		while(!name.equals("")) {
			addName(name);
			System.out.println("���������� �Է��ϼ���: ");
			int escore = s1.nextInt();
			addEnglish(escore);
			System.out.println("���������� �Է��ϼ���: ");
			int kscore = s1.nextInt();
			addKorean(kscore);
			System.out.println("���������� �Է��ϼ���: ");
			int mscore = s1.nextInt();
			addMath(mscore);
			
			System.out.println("�л��̸��� �Է��ϼ���: ");
			name = s.nextLine();
		}
		s.close();
		s1.close();
	
	}
	
	int sum1 =0;
	int sum2 =0;
	int sum3 =0;
	
	public void getAllStudentScoreSum() {
		// ��� �л��� �� ���� ���� �����ֱ�
		
		
		for(int i=0; i<getSize();i++) {
			sum1 =  sum1  + getEnglishScore(i);
			sum2 =  sum2  + getKoreanScore(i);
			sum3 =  sum3  + getMathScore(i);
			
		}
		System.out.println("��� �л��� ��������: " + sum1);
		System.out.println("��� �л��� ��������: " + sum2);
		System.out.println("��� �л��� ��������: " + sum3);
	}
	
	public void getAllStudentAverageScore() {
		// ��� �л��� �� ���� ���
		
		System.out.println("�������: "+sum1/getSize());
		System.out.println("�������: "+sum2/getSize());
		System.out.println("�������: "+sum3/getSize());
		
		
		
	}
	
	public void getAllStudentCount() {
		// ��ü �л� ���� 
		System.out.println("��ü�л���: "+getSize());
		
	}
}

