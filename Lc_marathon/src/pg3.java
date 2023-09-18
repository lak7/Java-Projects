public class pg3 {
    public static void main(String[] args) {
        String ss = "0P";
        System.out.println(isPalindrome(ss));

        System.out.println(Character.getNumericValue('0'));

    }


    public static boolean isPalindrome(String s) {

        StringBuilder str = new StringBuilder();
        for(Character c : s.toCharArray()){
            if(Character.getNumericValue(Character.toLowerCase(c)) >= 0 && Character.getNumericValue(Character.toLowerCase(c)) <= 35){
                str.append(c);
            }
        }

        for(int i = 0; i< str.length()/2; i++){
            if(Character.toLowerCase(str.charAt(i)) != Character.toLowerCase(str.charAt(str.length() - i - 1)) ) return false;
        }
        return true;

    }
}
