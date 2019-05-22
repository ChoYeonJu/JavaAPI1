package tostringmethod;

public class SmartPhoneExample {

	public static void main(String[] args) {		//객체의 문자정보를 리턴
		// TODO Auto-generated method stub
		SmartPhone smartPhone = new SmartPhone("구글", "안드로이드");
		
		String strObj = smartPhone.toString();
		System.out.println(strObj);
		
		System.out.println(smartPhone);

	}

}
