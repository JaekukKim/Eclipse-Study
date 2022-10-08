package ch12.sec14.Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ ElementType.METHOD })
// 어노테이션을 어디에 적용 할 것인지 명시를 해야한다. 적용 대상을 지정할때는 @Target 어노테이션을 사용하며
// 매개변수는 배열을 값으로 가지며 열거상수로 정의되어있다.
// 열거상수는 TYPE , ANNOTATION_TYPE , FIELD,CONSTRUCTOR , METHOD , LOCAL_VARIABLE , PACKAGE 가 있다.
// 위 어노테이션의 의미는 PrintAnnotation은 메소드 선언에만 적용 할 수 있다는 의미이다.

@Retention(RetentionPolicy.RUNTIME)
// 어노테이션 유지 정책에 의거하여 어노테이션이 어디까지 유지 되는지를 지정해준다. 보통 RUNTIME 열거상수를 가장 많이 쓴다.
// RetentionPolicy의 열거상수 중 하나인 RUNTIME 은 바이트코드 파일까지 어노테이션의 정보를 유지하면서 리플렉션으로도 정보를 얻을 수 있기에 가장 많이 쓴다. 
// 어노테이션 유지 정책은 어노테이션의 적용 범위를 target으로 설정 한 다음 명시 해 주어야한다.

public @interface PrintAnnotation {
	// 어노테이션 타입을 적용한다. 어노테이션 타입 적용은 인터페이스 타입 적용과 유사하다.
	// @interface 뒤에 어노테이션 이름을 기술한다.

	// 엘리먼트(속성)를 선언한다.
	String value() default "-";
	// 타입이 string인 **value라고 하는 기본 엘리먼트**를 생성한다.
	// 기본 엘리먼트가 하는 역할은 출력될 문자를 저장하는 역할로 설정 해 줄 것이다.
	// 기본 엘리먼트이든 사용자 엘리먼트이든 엘리먼트 이름 뒤에는 반드시 괄호()로 끝나야한다.

	int number() default 15;
	// 기본 엘리먼트의 값을 설정할때는 반드시 default를 붙여줘야한다. 여기서 쓰이는 디폴트는 접근제한자가 아니다!!

}
