public class Student {
	int roll;
	String name;
	String city;
	Stud(int roll, String name, String city){
		this.roll=roll;
		this.name=name;
		this.city=city;
	}
	public String toString(){
		return roll+name+city;
	}

	public static void main(String[] args) {
		Stud st=new Stud(101, "Sandeep", "Bangalore");
		Stud st1=new Stud(108, "Gowda", "Mangalore");
		System.out.println(st);
		System.out.println(st1);
		System.out.println(st.toString());
		System.out.println(st1.toString());
	}

}
