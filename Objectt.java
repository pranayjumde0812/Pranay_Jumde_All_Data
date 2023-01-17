class Objectt
{
   public static void main (String [] args)
   {
     Add1 ad1=new Add1();
     Add1 ad2=new Add1();
     Add1 ad3=new Add1();
     Add1 ad4=new Add1();

     ad1.set(12,55);
     ad2.set(18,59);
     ad3.set(15,9);


     ad4=ad3.sum(ad1,ad2);

     //ob3.sum();

    ad4.display();
   }
}

class Add1
{
	int res,a,b;

	void set(int x, int y)
	{
      a=x;
      b=y;
	}

	Add1 sum(Add1 p, Add1 q)
	{
        Add1 tad= new Add1();
		tad.a=a+p.a+q.a;
		tad.b=a+p.b+q.b;
		return tad;
	}

	void display()
	 {
		System.out.println(a+" "+b);
     }
}