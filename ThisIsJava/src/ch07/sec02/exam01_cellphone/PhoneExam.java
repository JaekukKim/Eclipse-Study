package ch07.sec02.exam01_cellphone;

public class PhoneExam {
	public static void main(String[] args) {
		Phone1 po = new Phone1("듀퐁","똥폰",14);
		
		System.out.println("모델 : " + po.model);
		System.out.println("이름 : " + po.name);
		System.out.println("채널 : " + po.ch);
		System.out.println();
		
		po.powerOn();
		po.bell();
		po.sendVoice("ㅎㅇ");
		po.receiveVoice("하이");
		po.sendVoice("별일없으시죵");
		po.receiveVoice("네~");
		po.hangUp();
		
		System.out.println();
		po.onPhone1();
		po.changech(55);
		po.offPhone1();
		po.powerOff();
		
		
	}

}
