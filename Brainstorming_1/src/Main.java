import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] gv = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> toRtn = groupAnagrams(gv);
        System.out.println(toRtn);

        int
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> toRtn = new ArrayList<>();
        int len = strs.length;
        int[] tmpArr = new int[len];
        int crnt = 0;

        for(int i = 0; i< len; i++){
            for(int j = i+1; j< len; j++){
                if(strs[i].length != strs[j].length()) continue;
                else {
                    if(isAnagram(strs[i], strs[j])){
                        tmpArr[i] = crnt;
                        tmpArr[j] = crnt;
                    }
                }
            }
            crnt++;
        }

        for(int i = 0; i< len; i++){
            for(int j = i+1; j< len; j++){
                if(tmpArr[i] == tmpArr[j]){
                    toRtn.get(i).set(j, strs[j]);
                }
            }
        }

        return toRtn;
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        int len = s.length();
        char[] charArray = t.toCharArray();
        boolean tmp = false;

        for(int i = 0; i< len; i++){
            tmp = false;
            for(int j = 0; j< len; j++){
                if(s.charAt(i) == charArray[j]){
                    charArray[j] = '*';
                    tmp = true;
                    break;
                }
            }
            if(!tmp) return false;
        }

        return true;
    }
}