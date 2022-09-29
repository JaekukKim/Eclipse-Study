package ch08.sec10.exam02_static_block;

public class TV {
	static String name = "바보상자 ";
	static String company = "tv회사 ";
	static String info;
	static String model = "브라운관 ";
	static int from1to10;
	static {
		info = company + model + name;
	}
	
	static {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum+=i;
			
		}
		from1to10 = sum;
	}
}