public class Box {
    double l, w, h;

    Box(){
        l = -69;
        w = -69;
        h = -69;
    }

    Box(double l){
        this.l = l;
        this.h = l;
        this.w = l;
    }

    Box(double l, double w, double h){
        this.l = l;
        this.w = w;
        this.h = h;
    }

    @Override
    public String toString() {
        return l + "-" + w + "-" + h;
    }
}


