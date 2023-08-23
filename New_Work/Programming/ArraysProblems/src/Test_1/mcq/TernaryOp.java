package Test_1.mcq;

public class TernaryOp {
    public static void main(String[] args) {
        int x = 3;
        int y = ~x;
        int z;
        z = x > y ? x : y;
        System.out.println(z);
        System.out.println(y);
    }
}
/*
public static String[] splitUsingTokenizer(String Subject, String Delimiters)
{
     StringTokenizer StrTkn = new StringTokenizer(Subject, Delimiters);
     ArrayList<String> ArrLis = new ArrayList<String>(Subject.length());
     while(StrTkn.hasMoreTokens())
     {
       ArrLis.add(StrTkn.nextToken());
     }
     return ArrLis.toArray(new String[0]);
}
 */