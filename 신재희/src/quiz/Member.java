package quiz;

public class Member implements Comparable<Member>{
	protected String id;
	protected String pw;
	protected String name;
	
	Member(String id, String pw, String name){
		this.id =id;
		this.pw =pw;
		this.name = name;
	}

	@Override
	public int compareTo(Member o) {
		return id.compareTo(o.id);
	}

	public String getName() {
		return name;
	}
	
	public String getId() {
		return id;
	}
	
}
