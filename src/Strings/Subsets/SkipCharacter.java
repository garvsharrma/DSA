package Strings;

public class SkipCharacter {
    public static void main(String[] args) {
        skip("", "garvsharma");
        System.out.println(skip2( "garvsharma"));
        System.out.println(skipApple("garvapplesharma"));
        System.out.println(doNotSkipAppleSkipApp("gaapprvapplesharma"));
    }

    static void skip(String p, String up){// p = processed string, up = unprocessed string
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if(ch == 'a' || ch=='r'){
            skip(p, up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }

    static String skip2(String up){// p = processed string, up = unprocessed string
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(ch == 'a'){
            return skip2(up.substring(1));
        }else{
            return ch + skip2(up.substring(1));
        }
    }

    static String skipApple(String up){// p = processed string, up = unprocessed string
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return ch + skipApple(up.substring(1));
        }
    }

    static String doNotSkipAppleSkipApp(String up){// p = processed string, up = unprocessed string
        if(up.isEmpty()){
            return "";
        }
        char ch = up.charAt(0);
        if(up.startsWith("apple")){
            return ch + doNotSkipAppleSkipApp(up.substring(1));
        }else{
            if(up.startsWith("app"))
                return doNotSkipAppleSkipApp(up.substring(3));
            else
                return ch + doNotSkipAppleSkipApp(up.substring(1));
        }
    }

}
