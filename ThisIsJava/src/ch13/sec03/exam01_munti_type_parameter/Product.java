package ch13.sec03.exam01_munti_type_parameter;

public class Product <K, M> {
	
		// 제네릭 타입을 이용한 필드 선언.
		private K kind;
		private M model;
		
		// 소스탭의 제네레이트 게터세터를 이용하여 쉽게 만들수있다.
		public K getKind() {
			return kind;
		}
		public void setKind(K kind) {
			this.kind = kind;
		}
		public M getModel() {
			return model;
		}
		public void setModel(M model) {
			this.model = model;
		}
		
	}


