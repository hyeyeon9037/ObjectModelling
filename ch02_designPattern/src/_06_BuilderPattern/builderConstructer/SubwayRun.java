package _06_BuilderPattern.builderConstructer;

import java.util.Scanner;

public class SubwayRun {

	public static void main(String[] args) {

		Subway menu1 = new SubwayBuilder(15, "허니오트", "올리브오일") // 반드시 넣어야하는 것
				.setCheese("모짜렐라") //setter로 추가
				.build(); // build()를 호출해야 오류가 안뜬다.
		
		System.out.println(menu1);
		
		Subway menu2 = new SubwayBuilder(30, "화이트", "머스타드")
				.setExtraTopping("아보카도")  //setter로 추가
				.build(); 
		System.out.println(menu2);
		
		
		SubwayBuilder sb = new SubwayBuilder(30,"화이트","머스타드")
				.setCheese("모짜렐라");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("추가 토핑을 선택하세여 : ");
		String topping = sc.nextLine();
		
		Subway menu3 = sb.setExtraTopping(topping).build(); // build를 호출함으로써 Subway 반환함
		System.out.println(menu3);
		
		
		
	}

}

