package ch12.free_section.math_class;

import java.util.Arrays;
import java.util.Random;

public class lotto {
	public static void main(String[] args) {
		int[] selectNumber = new int[6];
		Random random = new Random();
		System.out.print("선택번호 : ");
		for (int i = 0; i < 6; i++) {
			selectNumber[i] = random.nextInt(45)+1;
			System.out.print(selectNumber[i] + " ");
		}
		System.out.println();
		
		int[] winningNumber = new int [6];
		random = new Random(8);
		System.out.print("당첨번호 : ");
		for (int i = 0; i < 6; i++) {
			winningNumber[i] = random.nextInt(45)+1;
			System.out.print(winningNumber[i] + " ");
		}
		System.out.println();
		
		Arrays.sort(selectNumber);
		Arrays.sort(winningNumber);
		boolean result = Arrays.equals(selectNumber, winningNumber);
		System.out.print("당첨여부 : ");
		if(result) {
			System.out.println("1등 축하");
		} else {
			System.out.println("당첨안댐");
		}
		
	}

}
