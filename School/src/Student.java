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
			System.out.println("이름: "+this.getName(i)+","
					+"영어점수: "+ this.getEnglishScore(i)+","
					+"국어점수: "+ this.getKoreanScore(i)+","
					+"수학점수: "+ this.getMathScore(i));
		}
	}
	
	
	public void getStudentList() {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		System.out.println("학생이름을 입력하세요: ");
		String name = s.nextLine();
		while(!name.equals("")) {
			addName(name);
			System.out.println("영어점수를 입력하세요: ");
			int escore = s1.nextInt();
			addEnglish(escore);
			System.out.println("국어점수를 입력하세요: ");
			int kscore = s1.nextInt();
			addKorean(kscore);
			System.out.println("수학점수를 입력하세요: ");
			int mscore = s1.nextInt();
			addMath(mscore);
			
			System.out.println("학생이름을 입력하세요: ");
			name = s.nextLine();
		}
		s.close();
		s1.close();
	
	}
	
	int sum1 =0;
	int sum2 =0;
	int sum3 =0;
	
	public void getAllStudentScoreSum() {
		// 모든 학생의 각 과목별 총합 보여주기
		
		
		for(int i=0; i<getSize();i++) {
			sum1 =  sum1  + getEnglishScore(i);
			sum2 =  sum2  + getKoreanScore(i);
			sum3 =  sum3  + getMathScore(i);
			
		}
		System.out.println("모든 학생의 영어총합: " + sum1);
		System.out.println("모든 학생의 국어총합: " + sum2);
		System.out.println("모든 학생의 수학총합: " + sum3);
	}
	
	public void getAllStudentAverageScore() {
		// 모든 학생의 각 과목별 평균
		
		System.out.println("영어평균: "+sum1/getSize());
		System.out.println("국어평균: "+sum2/getSize());
		System.out.println("수학평균: "+sum3/getSize());
		
		
		
	}
	
	public void getAllStudentCount() {
		// 전체 학생 숫자 
		System.out.println("전체학생수: "+getSize());
		
	}
}

