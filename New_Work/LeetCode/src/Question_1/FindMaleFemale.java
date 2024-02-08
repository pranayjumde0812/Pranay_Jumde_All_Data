package Question_1;

import java.util.ArrayList;
import java.util.List;

public class FindMaleFemale {


    public static void main(String[] args) {

        FindMaleFemale findMaleFemale = new FindMaleFemale();

        String arr[][] = {

                {"Amit", "28", "male"},
                {"Divya", "24", "female"},
                {"GatiKrishna", "32", "male"},
                {"Rohini", "27", "female"}
        };

        findMaleFemale.sortAgeAndGender(arr);

    }

    public void sortAgeAndGender(String[][] arr) {

//        String newArr[][] = new String[][];

        List<String> maleList = new ArrayList<>();
        List<String> femaleList = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {

            String maleName = "";
            String femaleName = "";

            for (int j = 0; j < arr[i].length; j++) {
//                System.out.print(arr[i][j]);

                int age = Integer.parseInt(arr[i][1]);

                if (age >= 25) {

                    if (arr[i][2].equals("male")) {

                        maleName += arr[i][0];
                        maleList.add(maleName);

                    } else {

                        femaleName += arr[i][0];
                        femaleList.add(femaleName);

                    }
                    break;
                }
            }
        }

        System.out.println("Male = " + maleList);
        System.out.println("Female = " + femaleList);

    }


}
