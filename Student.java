
public class Student {
	String name;
	int age;
	String place;
	Student(String n,int a,String p)
	{
		this.name=n;
		this.age=a;
		this.place=p;
	} 
	public String ToString()
	{
		return " "+this.name+" "+this.age+" "+this.place;
	}

	public static void main(String[] args) {
		Student s1= new Student("VIJAY",22,"SITAMARHI");
		Student s2= new Student("RATAN",23,"AGIRCO");
		Student s3= new Student("BIKASH",24,"ADITYAPUR");
		System.out.println(s1.ToString());
		System.out.println(s2.ToString());
		System.out.println(s3.ToString());

	}

}
