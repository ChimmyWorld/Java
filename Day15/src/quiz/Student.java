package quiz;

public class Student {
	private String name;
	private int kor;
	private int eng;
	private int mat;
	
	Student(String name, int kor, int eng, int mat){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	@Override
	public String toString() {
		String msg = "%s (국 %d, 영 %d, 수 %d)";
		return String.format(msg, name, kor, eng, mat);
	}

	public String getName() {
		return name;
	}
	
	public String getInfo() {
		String msg = "%s %d %d %d\n";
		msg = String.format(msg, name, kor, eng, mat);
		return msg;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
	
}
