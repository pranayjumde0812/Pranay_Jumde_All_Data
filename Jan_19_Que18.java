class Jan_19_Que18
{

  public static void main(String [] args)
  {

	int arr[]={1,4,6,1,2,3,6};

    boolean check= array123(arr);
    System.out.println(check);
  }

  public static boolean array123(int ab[])
  {
	for (int i=0; i<=ab.length-1; i++)
	{
      if(ab[i]==1 && ab[i+1]==2 && ab[i+2]==3)

      return true;
	}
	return false;
  }
}