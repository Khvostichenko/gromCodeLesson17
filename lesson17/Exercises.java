package lesson17;

import java.util.Arrays;

public class Exercises {
    public static void main(String[] args) {
        String s = "test str here was here two times or not no test";
        String[] mas = {"test","here","not"};
        System.out.println(Arrays.toString(countDuplicates(s,mas)));
    }

    static String deleteDuplicates(String input){
        String[] words = input.split(" ");

        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){
                if(words[i].equals(words[j]))
                    words[j] = "";
            }
        }

        String res = "";

        for(String word : words){
            res += word;

            if(!word.isEmpty())
                res += " ";
        }

        return res;
    }

    static int[] countDuplicates(String input, String[] words){
        String[] strings = input.split(" ");

        int[] res = new int[words.length];

        for(String string : strings){
            for(int i = 0; i < words.length; i++){
                if(string.equals(words[i]))
                    res[i]++;
            }
        }

        return res;
    }
}
