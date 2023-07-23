public class playground2 {
    public static void main(String[] args) {
        System.out.println(reachNumber(47));

    }

    public static int reachNumber(int target) {

        int currentPos = 0;
        int steps = 0;

        while(currentPos != target){
            steps++;
            if(currentPos + steps > target){
                currentPos -= steps;
            }
            else if(currentPos + steps < target){
                currentPos += steps;
            }
            else if(currentPos + steps == target){
                break;
            }
            else if(currentPos - steps == target) break;
            // else if(currentPos - steps == target) return steps;
        }

        return steps;

    }
}
