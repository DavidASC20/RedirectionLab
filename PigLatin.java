public class PigLatin {
    public static String pigLatinSimple(String s){
        String temp = "";
        if(s.charAt(0) == 'a' ||  s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
            temp = s + "hay";
        }else{
            char x = s.charAt(0);
            temp = s.substring(1, s.length()) + x + "ay";
        }

        return temp;
    }

    public static String pigLatin(String s){
        String temp = "";
        if(s.substring(0, 2) == "bl" || s.substring(0, 2) == "br" || s.substring(0, 2) == "ch" || s.substring(0, 2) == "ck" || s.substring(0, 2) == "cl" || s.substring(0, 2) == "cr"
        || s.substring(0, 2) == "dr" || s.substring(0, 2) == "fl" || s.substring(0, 2) == "fr" || s.substring(0, 2) == "gh" || s.substring(0, 2) == "gl" || s.substring(0, 2) == "gr" 
        || s.substring(0, 2) == "ng" || s.substring(0, 2) == "ph" || s.substring(0, 2) == "pl" || s.substring(0, 2) == "pr" || s.substring(0, 2) == "qu" || s.substring(0, 2) == "sc" 
        || s.substring(0, 2) == "sh" || s.substring(0, 2) == "sk" || s.substring(0, 2) == "sl" || s.substring(0, 2) == "sm" || s.substring(0, 2) == "sn" || s.substring(0, 2) == "sp" 
        || s.substring(0, 2) == "st" || s.substring(0, 2) == "sw" || s.substring(0, 2) == "th" || s.substring(0, 2) == "tr" || s.substring(0, 2) == "tw" || s.substring(0, 2) == "wh"
        || s.substring(0, 2) == "wr"){
            String firstTwo = s.substring(0, 2);
            temp += s.substring(2, s.length()) + firstTwo + "ay";
        }if(s.charAt(0) == 'a' ||  s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u'){
            temp = s + "hay";
        }else{
            char x = s.charAt(0);
            temp = s.substring(1, s.length()) + x + "ay";
        }
        return temp;
    }

    public static String pigLatinBest(String s){
        String temp = 0;
        
    }
}
