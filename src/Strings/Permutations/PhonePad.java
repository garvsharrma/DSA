package Strings.Permutations;

import java.util.ArrayList;

public class PhonePad {
    public static void main(String[] args) {
       pad("", "23");
    }

    static void pad(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int digit = up.charAt(0) - '0'; // '1' - '0' = 1
        String[] value = new String[10];
        value[0] = "";
        value[1] = "";
        value[2] = "abc";
        value[3] = "def";
        value[4] = "ghi";
        value[5] = "jkl";
        value[6] = "mno";
        value[7] = "pqrs";
        value[8] = "tuv";
        value[9] = "wxyz";

        for (int i = 0; i < value[digit].length(); i++) {
            char ch = value[digit].charAt(i);
            pad(p+ch, up.substring(1));
        }
    }

    static ArrayList<String> padList(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        int digit = up.charAt(0) - '0'; // '1' - '0' = 1
        for (int i = (digit-1) * 3; i < digit * 3; i++) {
            char ch = (char)('a' + i);
            ans.addAll(padList(p+ch, up.substring(1)));
        }return ans;
    }
}
