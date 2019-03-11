public class ArrayListInt {
    private static int[] EMPTY_DATA={};
    private int[] data;

    public ArrayListInt(){
        data = EMPTY_DATA;

    }
    public void add(int e){
        int[] temData = new int[data.length + 1];

        for(int i = 0; i<data.length; i++){
            temData[i] = data[i];
        }
        temData[data.length] = e;
        data = temData;
    }
    @Override

    public String toString(){
        String res = "[ ";

        for(int i = 0; i<data.length; i++){
            res +=data[i] + " ";
        }
        res = "]";
        return res;
    }

}
