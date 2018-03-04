package day09;

public class ButtonExample {
	public static void main(String ar[]){
		Button btn=new Button();
		
		//singleton pattern과 마찬ㄱ지로 GOF 디자인패턴 중에 하나 
		//전략 패턴(strategy pattern) 예
		//전략 패턴이란 ? --> 알고리즘 패밀리를 미리 정의해두고 
		//런타임시에 교체해서 사용하는 전략을 말한다.
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
