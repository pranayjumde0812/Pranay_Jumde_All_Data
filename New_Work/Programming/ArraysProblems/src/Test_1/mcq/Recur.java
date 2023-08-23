package Test_1.mcq;

public class Recur {

    int func (int n){
        int result;
        if(n==1)
            return 1;
        result  = func(n-1);

        return result;
    }

    public static void main(String[] args) {
        Recur recur = new Recur();

        System.out.println(recur.func(5));

    }
}
