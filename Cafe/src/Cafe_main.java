import java.util.Scanner;

public class Cafe_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Menu menu = new Menu();
		Sales sell = new Sales();

	

		// 작업코드를 읽는다
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		System.out.print("작업코드 입력 (m=메뉴보기, o=주문하기,s:매출보기): ");
		String code = s.nextLine();
		// 작업코드가 "" 이 아닌 동안 (while)
		while (!code.equals("x")) 
		{
			// if 작업코드가 "m"이면 menu.display();	
			if (code.equals("m")) 
			{
				menu.display();
				break;
			}
			
			// else if 작업코드가 "o"면 , 주문받아들이기.
			else if (code.equals("o")) 
			{
				Order order = new Order();
				// 메뉴번호를 입력받는다
				System.out.print("메뉴번호 입력 : ");
				String num = s.nextLine();
				// 메뉴번호가 ""이 아닌 동안(while)
				while(!num.equals("")) 
				{	
					// 수량을 입력받는다
					System.out.print("수량 입력 : ");
					int qty = s1.nextInt();
					// 총액 자동계산 -> 저장
					System.out.println("총액 : " + qty*menu.getPrice(Integer.parseInt(num)) );
					// 메뉴명(getName) 찾은후 order.alName에 메뉴명 입력
					// order.alQty에 수량입력
					// order.alSum에 총액입력
					order.addName(menu.getName(Integer.parseInt(num)),
								  qty, 
								  qty*menu.getPrice(Integer.parseInt(num)));
					// 새 메뉴번호를 입력받는다. 끝나면 다시 돌아가게
					System.out.print("메뉴번호 입력 : ");
					num  = s.nextLine();
//					if(num.equals("x")) 
//					{
//						break;
//					}
				}
				
//				if(num.equals("x")) 
//				{
//					break;
//				}
				// 입력된 주문 목록을 표시
				order.display();
				System.out.println("적립할 모바일 번호를 입력하시오:");
				String mobile = s.nextLine();
				for(int i =0; i<order.orderSize();i++) {
					sell.add(mobile, order.getName(i), order.getQty(i), order.getSum(i));
				}
			}else if(code.equals("s")) {
				sell.display();
			}
		}
		System.out.print("작업코드 입력 (m=메뉴보기, o=주문하기) : ");
		code = s.nextLine();
		
	}
}

// 스캐너 2개 문자, 숫자 수량도 숫자 스캐너 이용  
