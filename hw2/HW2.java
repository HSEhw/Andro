import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.lang.NullPointerException;
import java.util.Scanner;


public class HW2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> dictionary = new HashMap<>();

        //String str = "a bb a bbbb a bb bbbb a aa";
        String str = in.nextLine();
        String[] words = str.split(" ");
        System.out.println(Arrays.toString(words));
        Integer value;
        for (int i = 0; i < words.length; i++) {
            value = dictionary.get(words[i]);
            //if (dictionary.get(words[i]) != null) {
            if (value != null) {
                //value = dictionary.get(words[i]);
                dictionary.put(words[i], value + 1);
            } else {
                dictionary.put(words[i], 1);
            }
        }
        //System.out.println(dictionary.get("c"));
        System.out.println(dictionary);
        //for (dictionary)
    }
}
