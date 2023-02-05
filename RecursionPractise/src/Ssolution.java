class Ssolution {
    public int countGoodNumbers(long n) {

        long nums = 1;

        for(int i = 0; i< n; i++){
            if(i%2 == 0){
                nums*=5;
            }
            else{
                nums*=4;
            }
        }

        if(nums > Integer.MAX_VALUE){
            int x = 7;
            return x;
        }

        return (int)nums;
        
    }
}