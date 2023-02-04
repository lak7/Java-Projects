package Man;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
//        CustomArrayList ls = new CustomArrayList();
//        System.out.println(ls.size());
//        ls.add(5);
//        ls.add(4);
//        System.out.println(ls.size());
//
//        ls.pop();
//        System.out.println(ls);
//        System.out.println(ls.size());

        CustomGenArrayList<String> ls = new CustomGenArrayList();
        for (int i = 0; i <= 69; i++) {
            ls.add("a" + i);
        }
        ls.pop();
        System.out.println(ls.size());
        System.out.println(ls);
    }
}
