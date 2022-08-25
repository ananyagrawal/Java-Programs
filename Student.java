class Student
{
	int rno;
	String name;
	static String uname="DIT University";
	void input(int x, String s)
	{
		rno=x;
		name=s;
	}
	void display()
	{
		System.out.println("Roll no.: "+rno+" Name: "+name+" University: "+uname);
	}
	public static void main(String args[])
	{
		Student s1=new Student();
		s1.input(8,"Anany");
		s1.display();
	}
}