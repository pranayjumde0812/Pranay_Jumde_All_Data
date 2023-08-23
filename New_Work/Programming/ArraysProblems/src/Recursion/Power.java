package Recursion;

public class Power {
    public static void main(String[] args) {

        int pow = powerOfTwo(5);
        System.out.println(pow);

        int itr = powerOfTwo2(5);
        System.out.println(itr);

        int power = powerOfTwo3(5);
        System.out.println(power);
    }

    public static int powerOfTwo(int n){

        if(n==0){
            return 1;
        }else {
            int power = 2 * powerOfTwo(n-1);
            return power;
        }
    }

    public static int powerOfTwo2(int n){

        int i = 0;
        int power = 1 ;

        while (i<n){
            power = power * 2 ;
            i=i+1;
        }
        return power;
    }

    public static int powerOfTwo3(int n){

        int power = 0 ;
        int i = 1;
        if(n==i){
            power = n*n;
            return power;
        }else {
            i++;
            powerOfTwo3(i);
        }
        return power;
    }
}
