package Test_1.mcq;

import java.util.Arrays;

public class JavaPipe {
    /*
    You are given 2 separate pipe separated strings
(Let’s call them A & B) and each one contains numeric values separated by pipe | character.
Write a method to read all the values in A & B and merge them and then finally present the
sorted integer array as output. You may use StringTokenizer class or split API within String class
Input: (‘1|2|5’, ‘3|6’]), Output: [1, 2, 3, 5, 6]

Public int [] stringMergeToIntegerArray (String a, String b)
Example data
Input: (‘10|15|20’, ‘1|50’), Output: [1, 10, 15, 20, 50].-

     */
    public static int[] stringMergeToIntegerArray(String a, String b) {
        String[] a1 = a.split("\\|");
        String[] b1 = b.split("\\|");
        int totalLength = a1.length + b1.length;

        String[] merge = new String[totalLength];

        System.arraycopy(a1, 0, merge, 0, a1.length);
        System.arraycopy(b1, 0, merge, a1.length, b1.length);

        int[] result = new int[merge.length];

        for (int j = 0; j < result.length; j++) {
            result[j] = Integer.parseInt(merge[j]);
        }
        Arrays.sort(result);
        return result;
    }

    public static void main(String[] args) {
        String a = "10|15|20";
        String b = "1|50";

        int[] result = stringMergeToIntegerArray(a, b);

        for (int res : result) {
            System.out.print(res + " ");
        }
        System.out.println();

/////////////////////////////////////////////////////////////////////////////////////

        String[] doc = {"a1", "a2", "a1", "a2", "a3", "a1", "a3", "a4", "a3"};
        String ele = "a3";
        int res = countOccurrence(doc, ele);
        System.out.println(res);
    }

    public static int countOccurrence(String doc[], String wordToSearch) {
        int count = 0;

        for (int i = 0; i < doc.length; i++) {

            if (doc[i].equals(wordToSearch)) {
                count++;
            }
        }
        return count;
    }

    /*
    Write a program to find the frequency of occurrence of a word in an article.
    Here you will be provided with 2 inputs – an array of strings representing the
    doc and a word that needs to be searched for occurrences. You need to return number of times that word occurred in document

    Public int CountOccurrence(String doc [], String wordToSearch)

    Example data
    Input: ([abc, def, ghi, def, xyz], abc), Output: 1
    Input: ([a1, a2, a1, a2, a3, a1, a3, a4], a3), Output: 2

     */
}
