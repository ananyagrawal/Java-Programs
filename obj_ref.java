class obj_ref
{
	int a=10;
	int b=20;
	void swap(obj_ref r)
	{
		int t; 
		t=r.a;
		r.a=r.b;
		r.b=t;
	}
	public static void main(String args[])
	{
		obj_ref o1=new obj_ref();
		o1.swap(o1);
		System.out.println("A="+o1.a);
		System.out.println("B="+o1.b);
	}
}