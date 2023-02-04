package sudoku.problemDomain;

import java.util.Objects;

public class Coordinates {
    private final int x;
    private final int y;

    public Coordinates(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        Coordinates other = (Coordinates) o;
        return ((this.x == other.x) && (this.x == other.x));
    }

    public int hashCode(){
        Objects.hash(this.x,this.y);
    }
}
