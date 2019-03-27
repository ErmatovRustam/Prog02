public class Arraylist {
    private static int[] EMPTY = {};
    private static final int DEFAULT_CAPACITY = 10;

    private int size;
    private int[] data;

    public Arraylist() {
        data = EMPTY;
    }

    public void add(int e) {
        if (size == data.length) {
            int newCapacity = data.length == 0 ? DEFAULT_CAPACITY : data.length + data.length / 2;
            int[] tem = new int[newCapacity];

            for (int i = 0; i < size; i++) {
                tem[i] = data[i];
            }
            data = tem;
        }
        data[size] = e;
        size++;

    }

    @Override
    public String toString() {
        StringBuilder res = new StringBuilder("[ ");


        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            res.append(" ");
        }
        res.append("]");
        return res.toString();
    }

    public int get(int index) {
        return data[index];
    }

    public void set(int index, int value) {
        data[index] = value;
    }
    public int size(){
        return size;
    }
}
