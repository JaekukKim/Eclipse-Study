package Academy.Array;

public class Array05 {
	public static void main(String[] args) {
		
		// 쓸데없는 연산을 줄이기 위한 정렬이 오름차순인 경우에 연산을 멈추는 코드.
		
		int[] num = new int[10];
		int tem = 0;

		System.out.println("무작위 수 생성");
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) (Math.random() * 10);
			System.out.print(num[i] + " ");
		}

		System.out.println();
		System.out.println("============절취선===========");
		System.out.println();
		System.out.println("오름차순 정렬");

		// i) for문(인덱스설정)
		for (int i = 0; i < num.length; i++) {

			// for문의 내부에 boolean타입의 진위여부 변수를 생성해준다.
			// 자리를 변경할때 더이상 변경이 되는지를 판단하기 위한 boolean 변수 설정.
			
			boolean change = false;

			// j) for문(자리변경)
			for (int j = i + 1; j < num.length; j++) {
				if (num[i] > num[j]) {

					// 자리를 변경할 조건이 실행될때만 if문이 실행이 된다.
					// 자리를 변경할수 있는 조건이 된다면 if문이 실행이 되므로 자연스럽게 change는 true로 리턴이된다.
					// 자리변경이 완료가 되지 않는다는거는 if문은 실행되지 않는것이므로 외부의 boolean 초기값 false가 리턴된다.

					tem = num[i];
					num[i] = num[j];
					num[j] = tem;
					change = true;

				}
			}
			
			// 자리변경이 실행되지 않아 false가 리턴이 됬다면 아래의 if문이 실행된다.
			if (change == false) {
				break;
			}
	// **** Arrays.sort(배열변수이름) 로 위의 긴 과정을 단 한번에 해결이 가능하다!!!!
	// **** 배열은 자바에서 매우 많이 쓰이기도하고 중요한 부분이므로
	// **** Arrays.sort(배열변수이름)의 메소드와 Arrays.toString(배열변수이름)은 외워서 사용하자!		
	
			// 배열을 출력하는 아래의 for문은 Arrays.toString(배열변수이름)로 간단하게 가능하다.
			// k for문 (출력)
			for (int k = 0; k < num.length; k++) {
				System.out.print(num[k] + " ");
			}
			System.out.println();

		}

	}

}