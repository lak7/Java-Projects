package Man;

import java.util.ArrayList;

public class CustomArrayList {
    private final int DEFAULT_SIZE = 10;
    private int[] data = new int[DEFAULT_SIZE];
    private int size = 0;


    public void add(int n){
        if(isFull()){
            resize();
        }
        data[size++] = n;
    }

    public int pop(){
        int tmp = data[--size];
        return tmp;

    }

    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        int[] temp = new int[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = data[i];
        }
        data = temp;
    }

    public int size(){
        return size;
    }

    @Override
    public String toString() {
        String giv = "{";
        for (int i = 0; i < size; i++) {
            if(i == 0) giv += data[i];
            else {
                giv += ", ";
                giv += data[i];
            }
        }
        giv += "}";
        return giv;
    }
}
