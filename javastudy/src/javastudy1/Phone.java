package javastudy1;

public class Phone {
	private String name;
	private String tel;
	//�ʵ� (��� ����)
	public Phone(String name, String tel) {
		super();
		this.name = name;
		this.tel = tel;
	}
	
	//getter /setter �޼���
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	
}
