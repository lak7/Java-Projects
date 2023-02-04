package Tst;

public class Parent {
    int l;
    int m;

    void hlo(){
        System.out.println(l);
    }

    public Parent(int l, int m) {
        this.l = l;
        this.m = m;
    }

    public Parent() {
        l = -1;
        m = -1;
    }
}
