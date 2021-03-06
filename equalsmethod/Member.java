package equalsmethod;

public class Member {

	public String id;
	
	public 	Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof Member) {			//매개값이 Member 타입인지 확인
			Member member = (Member)obj;	//Member 타입으로 강제 변환 
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
