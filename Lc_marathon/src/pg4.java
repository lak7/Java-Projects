import java.util.HashMap;
import java.util.HashSet;
import java.util.*;

public class pg4 {
    public static void main(String[] args) {
        String[] arr = {""};
        List<List<String>> printList = new ArrayList<>();

        printList = groupAnagrams(arr);
        System.out.println(printList);

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> finalList = new ArrayList<>();

        for(int i = 0; i< strs.length; i++){

            if(strs[i] != null){
                List<String> temp = new ArrayList<>();
                temp.add(strs[i]);
                for(int j = i+1; j< strs.length; j++){
                    if(strs[j] != null){
                        if(IsAnagram(strs[i], strs[j])){
                            temp.add(strs[j]);
                            strs[j] = null;
                        }
                    }
                }
                strs[i] = null;
                finalList.add(temp);
            }


        }

        return finalList;


    }

    public static boolean IsAnagram(String a, String b){

        if(a.length() != b.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(Character c : a.toCharArray()){
            if(map1.containsKey(c)) map1.put(c, map1.get(c) + 1);
            else map1.put(c, 1);
        }

        for(Character c : b.toCharArray()){
            if(map2.containsKey(c)) map2.put(c, map2.get(c) + 1);
            else map2.put(c, 1);
        }

        return map1.equals(map2);

    }
}
