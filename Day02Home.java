package day02home;

public class Day02Home {

	public static void main(String[] args) {

		/*
		 * 반지름을 주고 원의 넓이를 구하라 
		 * 원의 넓이 : 반지름 * 반지름 * 원주율 
		 * 반지름 = 10 
     * 원주율 = 3.14
		 */

		int a = 3; // 반지름
		final double PI = 3.14; // 원주율
	
		System.out.println("원의 넓이는? = " + (a * a * PI));
    
	}

}