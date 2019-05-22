package hashcodemethod;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {		//객체 해쉬코드 : 객체를 식별할 하나의 정수값
		// TODO Auto-generated method stub
		
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		hashMap.put(new Key(1), "홍길동");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);

	}

}
