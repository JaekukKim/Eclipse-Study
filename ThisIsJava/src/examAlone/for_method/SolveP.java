package examAlone.for_method;

public class SolveP {

	public static void main(String[] args) {
		try {
			int value = Integer.parseInt("1oo");
		}catch(NumberFormatException e){
			System.err.println("에러내용");
			System.err.println(e.getMessage());
			
		}

	}

}
