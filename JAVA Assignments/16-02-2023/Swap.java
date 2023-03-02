public class Swap extends One
{
    public static void main(String[] args) {
        int a=5;
        int b=9;
        swap (a,b);

    }
}

class One
{
   public static void swap(int x,int y)
    {
        int temp=x;

            x=y;

            y=temp;

        System.out.println("x="+x);
        System.out.println("y="+y);
    }
}