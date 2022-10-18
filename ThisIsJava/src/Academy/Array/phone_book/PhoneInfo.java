package Academy.Array.phone_book;

public class PhoneInfo {
	
	
	// 강사님이 하신 방식과는 좀 다르다. 본인은 OOP의 캡슐화를 연습하기 위해 getter과 setter을 사용하였다.
	// 물론 setter를 사용하면 캡슐화나 보안은 의미가 없지만 객체에 대한 연습을 필요로 하는 단계라고 생각하며 사용하였다.
	
	
	private String name;
	private String phoneNumber;
	private String birthDay;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getBirthDay() {
		return birthDay;
	}

	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}

	
	// 생성자 오버로딩
	public PhoneInfo () {
		
	}
	
	public PhoneInfo (String name, String phoneNumber) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthDay=null;
	}
	
	public PhoneInfo (String name, String phoneNumber, String birthDay) {
		this.name=name;
		this.phoneNumber=phoneNumber;
		this.birthDay=birthDay;
	} // 생성자 오버로딩 끝.
	
	public void showPhoneNum() {
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		System.out.println("생년월일 : " + this.birthDay + "\n");
		if (this.birthDay == null) {
			System.out.println("생년월일 정보는 비공개처리됩니다.");
		}
	}



}