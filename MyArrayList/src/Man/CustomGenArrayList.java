package Man;

public class CustomGenArrayList<T> {
    private final int DEFAULT_SIZE = 10;
    private Object[] data = new Object[DEFAULT_SIZE];
    private int size = 0;


    public void add(T n){
        if(isFull()){
            resize();
        }
        data[size++] = n;
    }

    public T pop(){
        T tmp = (T)data[--size];
        return tmp;

    }

    private boolean isFull(){
        return size == data.length;
    }
    private void resize(){
        Object[] temp = new Object[data.length*2];
        for (int i = 0; i < data.length; i++) {
            temp[i] = (T)data[i];
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
