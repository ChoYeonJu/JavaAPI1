package equalsmethod;

public class Member {

	public String id;
	
	public 	Member(String id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {		
		if(obj instanceof Member) {			//�Ű����� Member Ÿ������ Ȯ��
			Member member = (Member)obj;	//Member Ÿ������ ���� ��ȯ 
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}
