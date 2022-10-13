import java.util.ArrayList;
import java.util.Scanner;

public class Al_main {

	public static void main(String[] args) {
//		Integer, Double, String, 클래스명
		ArrayList al = new ArrayList();
		// 보통은 배열처럼 한가지 타입만 집어넣는다 
//		ArrayList<Integer> al = new ArrayList<Integer>();
		// 정수만 들어가는 List로 만들게 제한
//		ArrayList<String> al = new ArrayList<String>();
		// 문자열만
//		ArrayList<Double> al = new ArrayList<Double>();
		// 실수만
		

		
//		al.add(10);
//		al.add(5);
//		al.add("hello");
//		al.add("world");
//		al.add(3.14);
		
//		for(int i=0; i<al.size(); i++) {
//			System.out.println(al.get(i));
//		}

	
		

		
//		alStudent.add("John");
//		alStudent.add("Jane");
//		alStudent.add("Jacob");
//		alStudent.add("Johanson");
//		alStudent.add("James");
		
		
		//학생이름을 읽고
		//x인지 검사 
		//학생이름이 "x"가 들어오면 반복을 종료.
		//ArrayList에 저장하고 
		//학생이름읽기
		//x인지 검사
		//ArrayList저장 
		//nextLine(),while() 사용
		
		Scanner scan = new Scanner(System.in);

		ArrayList<String> alStudent = new ArrayList<String>();

		String name = scan.nextLine();

//		String name = scan.nextLine();
		
		// 이 덩어리를 반복
//		if(name.equals("x")) exit
//		alStudent.add(name);
//		name=scan.nextLine();

		

			   while (!name.equals("x")) {
				alStudent.add(name);
				name = scan.nextLine();			
				}
			

		
	}
	
	
	
		
	
		
		
//		for(int i=0; i<alStudent.size(); i++) {
//			System.out.println(alStudent.get(i));
//			
//		}
		
		
	}


