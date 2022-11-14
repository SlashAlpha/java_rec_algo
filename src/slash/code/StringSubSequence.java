package slash.code;

import java.util.Arrays;

public class StringSubSequence {

    public String getSubSequence(String word){
        if (word.isEmpty()) return "";

        char first= word.charAt(0);
        String rest= getSubSequence(word.substring(1));
        String result="";
        System.out.println(rest);
        for (String subseq:rest.split(",",-1)
             ) {
            result+=","+first+subseq;
            result+=","+subseq;
        }
        System.out.println(Arrays.toString(result.split(",")));
        return result.substring(1);
    }
}
