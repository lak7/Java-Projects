public class Nums {

    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    double sum(double a, int b){
        return a+b + 69;
    }

    public static void main(String[] args) {
        Nums n = new Nums();
        System.out.println(n.sum(1.0, 2));
    }

}
