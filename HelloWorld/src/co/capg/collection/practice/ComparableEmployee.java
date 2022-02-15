package co.capg.collection.practice;

public class ComparableEmployee implements Comparable<ComparableEmployee> {
	
	private int id;
	private String ename;
	private int sal;
	
	

	public ComparableEmployee(int id, String ename, int sal) {
		super();
		this.id = id;
		this.ename = ename;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public String getEname() {
		return ename;
	}


	public int getSal() {
		return sal;
	}

	@Override
	public int compareTo(ComparableEmployee o) {
		return 0;
	}
	
}
