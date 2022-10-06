package ch12.sec13.reflection;

public class RefExam {
	
	// 필드선언
	private String variable;
	private String variable2;
	
	// 생성자
	public RefExam() {
		
	}
	
	public RefExam(String variable) {
		this.variable=variable;
	}
	
	// 메소드
	public String getVariable() {
		return variable;
	}
	public void setVariable (String variable) {
		this.variable = variable;
	}
	public String getVariable2 () {
		return variable2;
	}
	public void setVariable2 (String variable2) {
		this.variable2=variable2;
	}
	

}
