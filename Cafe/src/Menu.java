import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	private ArrayList<String> alMenu;
	private ArrayList<Integer> alPrice;

	// 생성자 없으면 add 안됨, 초기화
	public Menu() {
		// 실행코드는 반드시 메소드 안에 들어가야함.
		// 그냥 클래스에 작성하면 안됨. 클래스 자체는 코드를 실행하는게 아니라 코드를 품고있는 것.
		// 생성자도 호출되니까 메소드 안에 들어있어야함.
		this.alMenu = new ArrayList<String>();
		this.alPrice = new ArrayList<Integer>();
		
		
		String filename = "d:\\menu.txt";
		File file = new File(filename);
		if(file.exists()){
		    BufferedReader inFile;
			try {
				inFile = new BufferedReader(new FileReader(file));

			    String sLine = null;
			    try {
					while( (sLine = inFile.readLine()) != null ) {
						String[] menu=sLine.split(",");
						this.alMenu.add(menu[0]);
						this.alPrice.add(Integer.parseInt(menu[1]));
					}   
				} catch (IOException e) {
					e.printStackTrace();
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
		}

		
	}

	private void addMenu(String name) {
		this.alMenu.add(name);
	}

	private void addPrice(int price) {
		this.alPrice.add(price);
	}

public String getName(int i) {
		return this.alMenu.get(i);
	}

	public int getPrice(int i) {
		return this.alPrice.get(i);
	}

	private int getSize() { // Size() 를 만들어서 반복문 조건식에 써야함
		return this.alMenu.size();
	}

	public void display() {
		for (int i = 0; i < getSize(); i++) {
			System.out.print(i+"."+this.getName(i) + ",");
			System.out.println(getPrice(i));
		}
	}

//	public void getMenuList() {
//		Scanner s = new Scanner(System.in);
//		Scanner s1 = new Scanner(System.in);
//		// 문자읽는스캐너, 숫자읽는스캐너 2개를 쓰는데 에러방지에 좋다
//
//		System.out.print("메뉴명을 입력하시오: ");
//		String name = s.nextLine();
//		while (!name.equals("x")) {
//			addMenu(name);
//			System.out.println("가격을 입력하시오: ");
//			int price = s1.nextInt();
//			addPrice(price);
//			System.out.print("메뉴명을 입력하시오: ");
//			name = s.nextLine();
//		}
//		s.close();
//		s1.close();
//	}
}
