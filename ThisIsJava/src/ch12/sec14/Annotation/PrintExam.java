package ch12.sec14.Annotation;
import java.lang.reflect.Method;

public class PrintExam {
	public static void main(String[] args) throws Exception {
		
		// 반드시 Service 파일과 PrintAnnotation 파일과 같이 봐야한다.
		
		
		// 먼저 서비스라고 하는 클래스에 메소드가 무엇이 있는지를 조사해주어야 한다. (리플렉션)
		Method[] method = Service.class.getDeclaredMethods();
		// 클래스명.class.메소드명 으로 알맞게 호출해준다. 중요한건 클래스명.class 이다.
		
		for (Method anoMethod : method) { // 향상된 for문으로 메소드를 호출해준다.

			// System.out.println(anoMethod.getName());
			// 새로운 배열변수에 대입된 메소드들의 "이름"만 출력한다.

			if (anoMethod.isAnnotationPresent(PrintAnnotation.class)) {
				// 이제 나온 메소드들에 어노테이션이 적용이 되어있는지를 확인 해 주어야한다.
				// isAnnotationPresent(어노테이션이름.class) 로 어노테이션이 적용이 되어있는지 확인을 해 줄 수 있다.
				// boolean타입으로 리턴한다.
				System.out.println(anoMethod.getName() + " 에는 어노테이션이 적용이 되어 있음.");

			} else {
				System.out.println(anoMethod.getName() + " 에는 어노테이션이 적용이 되어 있지 않음.");
			}

		}

		System.out.println("\n==여기까지 메소드 이름 호출과 어노테이션 적용 여부 조사==");
		System.out.println("\n==지금부터 메소드에 적용된 어노테이션의 엘리먼트 값들을 조사해보자==");

		for (Method anoMethod : method) {
			if (anoMethod.isAnnotationPresent(PrintAnnotation.class)) {
				// 메소드에 어노테이션이 적용이 되어 있는지 확인을 해주었으므로 이제 어노테이션을 호출해야한다.
				PrintAnnotation printAno = anoMethod.getAnnotation(PrintAnnotation.class);
				// 어노테이션이름 변수명 = 배열변수이름.getAnnotation(어노테이션이름.class) 의 식으로 어노테이션을 호출한다.

				System.out.println();
				System.out.println(anoMethod.getName());
				System.out.println("value Element의 값 : " + printAno.value());
				// 어노테이션이 가지고 있는 value값을 조사를 해보자. (엘리먼트 값 조사)
				// value() 메소드를 호출하는 것 처럼 어노테이션이대입된변수명.value() 라고 하면 value()메소드가
				// value 엘리먼트 값을 리턴해준다.
				System.out.println("number Element의 값 : " + printAno.number());
				// 이건 value값을 호출하는게 아닌 number 값을 호출하는 과정이다.

				// 마지막 한단계 남았다. 이제 본격적으로 우리의 최종 목표인 전체출력을 해 보자....

				System.out.println();

				// [1] 메소드 이름 출력
				System.out.println("[" + anoMethod.getName() + "(<-메소드 이름[1]) 의 엘리먼트 사용 결과" + "]");

				// [2] 어노테이션의 엘리먼트를 이용한 출력.
				System.out.print("[2]PrintAnnotation에서 설정된 value와 number 값의 사용 결과 \n-> ");
				for (int i = 0; i < printAno.number(); i++) {
					System.out.print(printAno.value());
				}
				System.out.println();

				// [3] 메소드들을 호출.
				
				
				anoMethod.invoke(new Service());
				
				// 이 코드는 우리가 질리도록 썼던 아래의 코드와 같다.
				
				// Service service = new Service();
				// service.method1();
				
				// anoMethod.invoke(new Service());이 코드 같은 경우는 그대로 사용한다면 예외가 발생한다.
				// 그래서 예외 떠넘기기를 하던가 아니면 try-catch로 예외처리를 해주자.
				// 나같은경우는 try - catch를 해 주었다.
				
				// 하지만 Service 클래스에 있는 메소드가 출력이 되지 않는다. 분명 예외처리 해주었는데....
				// 지식이 부족하여 해결이 어렵다.... 조금 더 공부 한 뒤에 다시 오자..

			}
		}

	}

}
