package day09;

public class ButtonExample {
	public static void main(String ar[]){
		Button btn=new Button();
		
		//singleton pattern�� ���������� GOF ���������� �߿� �ϳ� 
		//���� ����(strategy pattern) ��
		//���� �����̶� ? --> �˰��� �йи��� �̸� �����صΰ� 
		//��Ÿ�ӽÿ� ��ü�ؼ� ����ϴ� ������ ���Ѵ�.
		
		btn.setOnClickListener(new CallListener());
		btn.touch();
		
		btn.setOnClickListener(new MessageListener());
		btn.touch();
	}
}
