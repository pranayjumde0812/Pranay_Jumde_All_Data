package TakingInput;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class TinyEditor {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//        String[] str = new String[100];

        System.out.println("Enter line of text ");
        System.out.println("Press 'stop' to end the reading");

//        for (int i = 0; i < str.length; i++) {
//
//            str[i] = br.readLine();
//
//            if (str[i].equals("stop"))
//                break;
//        }

//        System.out.println("\nHere is your file : ");
//
//        for (int i = 0; i < str.length; i++) {
//            if (str[i].equals("stop"))
//                break;
//            System.out.println(str[i]);
//        }

        /////////// ArrayList //////////

        String s;

        List<String> list = new ArrayList<>();

        do {
            s = br.readLine();
            list.add(s);
        } while (!s.equals("stop"));

        Iterator<String> itr = list.iterator();

        System.out.println("\nHere is your file : ");

        while (itr.hasNext()) {

            String temp = itr.next();

            if (temp.equals("stop"))
                break;
            System.out.println(temp);

        }
    }
}
