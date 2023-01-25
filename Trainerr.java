class Trainerr
{
  public static void main(String [] args)
  {
   Train t=new Train();
   System.out.println(t.spd());
  }
}

class Train
{

  double spd()
  {
	double dis=130, t=30, sp;
	sp=dis/t;
	return sp;
  }

}