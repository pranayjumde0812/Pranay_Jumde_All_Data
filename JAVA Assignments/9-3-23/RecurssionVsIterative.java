class RecurssionVsIterative
{
   static int powerOfTwo(int n)
  {
     if (n==0)
    {
     return 1;
    }
    else
    {
     int power = 2*powerOfTwo(n-1);
     return power;
    }
  }

  static int powerOfTwoIT(int n)
  {
    int i = 0;
    int power = 1;
    while (i < n)
   {
    power = power * 2;
      i++;
   }
   return power;
  }



  public static void main(String [] args)
  {
    int res1=powerOfTwo(5);
    int res2=powerOfTwoIT(5);

    System.out.println("Recursive = "+res1);
    System.out.println("Iterative = "+res2);

  }
}