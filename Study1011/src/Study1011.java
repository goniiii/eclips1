import java.util.Scanner;
public class Study1011 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 피보나치수열(1000이하의 피보나치 숫자를 구하기)
		// 0 1 1 2 3 5 8 13 21 34 55 89 144 233 ...

		// a b c b 를 a에 넣고 c 를 b에 넣는다
		// 0 1 1
		// 1 1 2
		// 1 2 3
		// 2 3 5
		// 3 5 8
		// 5 8 13
		// 8 13 21

//		int a = 0;
//		int b = 1;
//
//		for (int c = 0; c < 1000; c = a + b) {
//
//			System.out.println(c);
//
//			a = b;
//			b = c;
//
//		}

		int a = 0;
		int b = 1;
		int c;
		c = a + b;
		
// 이 덩어리가 계속 반복되는 것 

//		if(c>1000) exit;
//		System.out.println(c);
//		a=b;
//		b=c;
//		c=a+b;


//		if(c>1000) exit; if를 while문으로 바꿀때 조건을 거꾸로 주고 while을 쓰면 됨 
// 		code1
//		code2 
//		끝나는지점에 if 를 걸고 계속 쓰다보면 반복되는 덩어리를 찾을 수 있음 
// 		반복되는 부분을 묶어서 반복문으로 바꿔주면 됨 

//		while (c <= 1000) {
//			System.out.println(c);
//			a = b;
//			b = c;
//			c = a + b;
//		}
		
		// 변수 =================================
		// 변수 : 선언필요, 대문자구문, 알파벳/_/$ 로 시작, 이후는 숫자도 가능, 값들어있는데 다른 값 넣으면 원래값 날아감 ,한번에 하나의 값만 저장 
		//       변수 => 값을 저장하는 메모리 특정 공간, 그릇에 비유 
		//       데이터타입 변수명; (세미콜론필수) , 데이터타입 변수명=값; (값은 데이터타입과 같아야함), (에러) => int i = 3.14f , String str = 14;, float j = 3;

		// 데이터타입 =============================
		// 데이터타입 기초/기본 데이터타입(Primitive Data Type) 모든언어 공통 => 숫자( 정수int / 실수float ), 문자열(0개 이상의 문자로 구성)String , Boolean (true/false), 문자 character인데 잘 안씀      
		//		   복합데이터타입(Complex Data Type) 언어마다 다르다 => ArrayList, List, Map
		//		   String str = "Hello World";  자바 문자열 큰따옴표만 가능 , 자바스크립트 파이썬은 큰/작은 따옴표 모두 사용 가능 
		
		
		// 연산자 ================================== 
		// 산술연산자 : 배정연산자 i=5; 오른쪽의 값을 왼쪽에 넣어라, +, -, /, * (사칙연산자), %(나머지계산),i++ ,++i(i=i+1;) ,i--, --i(i=i-1;) (증가/감소 연산자),파이썬은 증감없음 (i=i+1이렇게 씀)
		//           + => 양쪽이 모두 숫자면 더하기 연산자로 동작, 한쪽이라도 문자열이면 연결연산자로 동작
		//			 println(i++) => 출력 후 증가 , println(++i) => 증가 후 출력, 증감연산자는 변수 앞에 있을 때 우선순위가 가장 높고 , 변수 뒤에 있을때 우선순위가 가장 낮다
		//			 i = i-3, i-=3; / i=3-i != i-=3; 수학의 결합법칙이 성립하는 연산자는 항상 적용가능 
//		int i = 10;
//		int j = 10;
//		System.out.println(i++);
//		System.out.println(++j);
//		System.out.println(i+j*i-j/i); // 연산자 우선순위 * / % -> + - 헷갈리면 괄호치면 됨 , 괄호가 우선순위 제일 높다
		

		
		// 근의 공식 값구하기 
		
//		Scanner scan = new Scanner(System.in);
//		System.out.print("a=");
//		a = scan.nextInt();
//		System.out.print("b=");
//		b = scan.nextInt();
//		System.out.print("c=");
//		c = scan.nextInt();
//		
//	
//	
//		System.out.println("x1=" + ((-b) + Math.sqrt(b*b - 4*a*c))/2*a);
//		System.out.println("x2=" + ((-b) - Math.sqrt(b*b - 4*a*c))/2*a);
	
//		System.out.println(-5%3);
		// -5 = 3*x+y;	x=-1,y=-2
		
		
		
		// 비교연산자 ===================================
		// (숫자)   ==, !=, < , > , <= , >= (부등호가 먼저나옴)
		// (문자열) .equals()  
		
//		Scanner scan = new Scanner(System.in);
//		String x = scan.nextLine();
//		if(x.equals("x")) 괄호안을 x가 아니면으로 하고싶으면 if(!x.equals("x")) 앞에 느낌표 붙임
//		equals 는 자바에서만 씀 다른언어는 == 으로 쓴다
		
		
		
		
		// 논리연산자 =====================================
//		   and , or , not
//		   &&  , || , !   => Java,Javascript
//		   And , Or , Not => Python
//		   And : 양쪽 모두 True 일때만 True, 이외에는 모두 False
//	       Or : 양쪽 모두 False 일때만 False, 이외에는 모두 True
		

		
		// 제어문 =======================================
		
//		조건문 - if, switch (Python에 없음)
		
		
//		1)
//				if(조건) {
//					실행문(조건이 참이면)
//				}
//		
//		2)
//				if(조건) {
//					실행문(조건이 참이면)
//				} else {
//					실행문(조건이 거짓이면)
//				}
		
		
//		3)                           
				
//				if(조건1) {
//					실행문(조건1이 참이면)
//				}else if(조건2) {
//					실행문(조건1이 거짓이고, 조건2가 참이면)
//				}else {
//					실행문(앞의 조건들이 모두 거짓이면)
//				}
		
//		4) 
//				
//				switch(표현식/변수) {
//				case 값1:
//					....
//					break;
//				case 값2:
//					....
//					break;	
//				case 값n:
//					....
//					break;
//				default:
//					....		
//				}
		
		
//		반복문 - while, for, (자바에는 없음 => do while, do until)
		
		
//		1) while 무한루프(infinite loop) 위험 -> 실행문중에 조건을 거짓으로 만드는 부분 반드시 필요
//										  -> 조건문으로 검사해서 break 호출	 

//			while(조건) {
//				실행문1;
//				....
//				실행문n;
//			}
		
		
//		2) break => 스위치문 아닐때 자기가 속한 가장 안쪽의 반복문을 빠져나감, switch문에서 break는 switch문을 빠져나감 
		
//			while(조건) {
//				while(조건2) {
//					if(조건3) {
//						break;  
//					}
//				}
//				A; 
//			}
//			B; 
		
		
//		3) continue => 가장 안쪽의 반복문의 조건검사를 다시 시행
		
		
		
//		4) for문

//			for(초기화; 조건; 후처리(꼭 증감오는건 아니다)) {
//				....	
//			}
		
		
//			for(;조건;) 초기화 후처리 없어도 되지만 조건은 반드시 있어야함
		
		
		
		
//			for(초기화;조건;후처리) {
//				....	
//				continue;	//후처리 실행 후 조건검사
//				....
//			}
		
		
//		for(int i1=0; i1<10; i1++) {
//			if(i1==10) break;
//			if(i1==5)
//				continue;
//			System.out.println(i1);
//		}
		
		
		
//		5) do while 1번 이상 반드시 실행
//
//			do {
//				실행문1;
//				...
//				실행문n;
//			} while(조건);
			
		
		
//		============================================================
//		소수구하기
		
		
		
		//2중for문 break 나머지가 0인적이 한번도 없으면 소수 
		
		// i 4                    5 6 7 8 9 10 ......
		// j 2 3 4 5 6 7 ... 
		
		// i 4 
		// j 2 일때 나눈 나머지 0 이면 바로 빠져나가서 i++ 하고 
		// i 5 j 2 나머지 비교 되게               
		
		
		
		
//		boolean z =true;
//		
//		for (int i = 4; i <= 100; i++) {
//			for (int j = 2; j < i; j++) {
//				if (i % j == 0) {
//					z = false;
//					break;
//				} else {
//					z = true;
//				}
//
//			}
//			if (z == true) {
//				System.out.println(i);
//			}
//
//		}
		
		

		
		
		
		
//		int i, j;
//		for (i = 4; i <= 100; i++) {
//			for (j = 2; j < i; j++) {
//				if (i % j != 0) {
//
//				} else {
//					break;
//				}
//
//			}
//			if (i == j) {
//				System.out.println(i);
//			}
//		}
		
		/*
		 
		for(int p=4; p<=100; p++) {
			int n;
			for(n=2; n<p; n++) { // n: 지역변수(local변수)
				if(p%n==0) break;
			}
			//두가지 경우,
			// 1. n이 p와 같아져서 자연스럽게 for문이 끝났다 (소수 확정)
			// 2. p%n==0이 돼서 중간에 탈출 (n!=p)(소수 아님 확정)
			if(n==p) {
				System.out.println(p);
			}
		}
		
		*/
		
//		
//		for(int p=4; p<=100; p++) {
//			boolean flag=false;	// flag 초기화
//			for(int n=2; n<p; n++) {
//				if(p%n==0) {
//					flag=true;
//					break;
//				}
//			}
//			// 두가지 경우,
//			// 1.flag==true => 소수 아님 확정
//			// 2.flag==false => 소수 확정 
//			if(flag==false) {
//				System.out.println(p);
//			}
//		}
	
		
		// 구구단 2~9단
		
		
		// for
		
//		for(i=2; i<=9; i++) {
//			for(j=1; j<=9; j++) {
//				System.out.println(i+"*"+j+"="+i*j);
//				
//			}
//			System.out.println();
//		}
		
//		for (i = 2; i <= 9; i++)
//			for (j = 1; j <= 9; j++)
//				System.out.println(i + "*" + j + "=" + i * j);
	
	
		
		
		// while
//		int p = 2;
//
//		while (p <= 9) {
//			int n = 1;
//			while (n <= 9) {
//				System.out.println(p + "*" + n + "=" + p * n);
//				n++;
//			}
//			System.out.println();
//			p++;
//			
//		}
		
		
		 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
 
}
