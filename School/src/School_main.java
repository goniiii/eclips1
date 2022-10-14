
public class School_main {

	public static void main(String[] args) {
		//메인의 코드를 최소화해서 만들기 4-5개 이내 
		
		// 학생이름 읽는다
		// 이름이 ""이 아닌 동안
		// 		영어점수를 읽는다
		// 		국어점수를 읽는다
		// 		수학점수를 읽는다
		// 		영어/국어/수학점수를 각 ArrayList에 저장
		//		다음 학생이름을 읽는다.
		
		// 모든 학생의 이름/영어/국어/수학점수를 출력
		// 모든 학생의 영어총합, 국어총합, 수학총합을 출력
		// 모든 학생의 영어평균, 국어평균, 수학평균 점수를 출력
		// 전체학생 숫자를 출력.
		
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
