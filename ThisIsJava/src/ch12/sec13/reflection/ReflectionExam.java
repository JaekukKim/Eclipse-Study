package ch12.sec13.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExam {
	public static void main(String[] args) {
		Class cls = RefExam.class;
		// 클래스 객체를 클래스로부터 얻는 선언.

		System.out.println("--생성자 정보--");

		Constructor[] constructors = cls.getDeclaredConstructors();
		// 생성자의 정보를 읽는 메소드 호출
		for (Constructor constructor : constructors) {
			// 향상된 for문으로 배열타입을 쉽게 호출.
			System.out.print(constructor.getName() + "(");
			// getName()메소드를 호출하여 배열안에 있는 메소드들 차례로 출력.
			Class[] parameters = constructor.getParameterTypes();
			// getParameterTypes() 메소드를 이용하여 생성자 배열에 있는 파라미터를 호출한다.
			printParameters(parameters);
			// 아래 생성자와 메소드의 매개변수를 출력하는 정적메소드를 호출하여 파라미터의 이름을 출력한다.
			System.out.println(")");
		}
		System.out.println();

		System.out.println("--필드 정보--");
		
		Field[] fields = cls.getDeclaredFields();
		// 필드의 정보를 읽는 메소드 호출
		for (Field field : fields) {
			System.out.println(field.getType() + " " + field.getName() + " ");
			// 필드
		}
		System.out.println();

		System.out.println("--메소드 정보--");
		Method[] methods = cls.getDeclaredMethods();
		for (Method method : methods) {
			System.out.print(method.getName() + "(");
			Class[] parameters = method.getParameterTypes();
			printParameters(parameters);
			System.out.println(")");
		}
	}
	
	// 생성자 및 메소드의 매개변수를 출력하기 위한 코드이다.
	public static void printParameters(Class[] parameters) {
		for (int i = 0; i < parameters.length; i++) {
			// 파라미터 배열의 길이만큼 설정을 해 주고
			System.out.print(parameters[i].getName());
			// i번째 인덱스의 파라미터의 이름을 불러와 출력한다.
		}

	}

}
