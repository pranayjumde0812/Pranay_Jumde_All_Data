public class MultiDouble implements CalculateDouble{
    @Override
    public void getCAlculatedValue(int operend1, int operend2) {
        int result=operend1*operend2;

        System.out.println("multiplication is "+ result);
    }
}
