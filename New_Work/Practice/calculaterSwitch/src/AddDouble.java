import java.util.*;
public class AddDouble implements CalculateDouble {
    Scanner sc = new Scanner(System.in);


    @Override
    public void getCAlculatedValue(int operend1, int operend2) {
//        System.out.println("First number is");
//        operend1=sc.nextInt();
//        System.out.println("First number is");
//        operend2=sc.nextInt();



        int result=operend1+operend2;

        System.out.println("Adddition is "+ result);

    }
}
