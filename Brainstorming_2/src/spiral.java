import java.util.ArrayList;

public class spiral {
    public static void main(String[] args) {

        int[][] arr = {{1,2,3}, {4, 5, 6}, {7,8,9}};
        ArrayList<Integer> lst = func(arr);
        System.out.println(lst);

    }

    private static ArrayList<Integer> func(int[][] matrix){

        ArrayList<Integer> jalebi = new ArrayList<>();
        int b = matrix.length - 1, r = matrix[0].length - 1, l = 0,d = 0, t = 0;

        if(b == 0)return jalebi;

        while( l <= r || t <= b )
        {int i;
            if(d==0){

                for(  i = l; i <= r; i++)
                {
                    jalebi.add(matrix[t][i]);
                }
                t++;d=1;
            }


            else if(d == 1){
                for(i = t; i<= b; i++){
                    jalebi.add(matrix[i][r]);
                }
                d=2;r--;
            }

            else if(d == 2){
                for(i = r; i >= l; i--){
                    jalebi.add(matrix[b][i]);
                }
                d = 3; b--;
            }

            else if(d==3){
                for(i = b; i >= t; i--){
                    jalebi.add(matrix[i][l]);
                }
                d = 0; l++;
            }
        }

        return jalebi;
    }
}

