public class Arraylist {
    private static int[] EMTY_DATA = {};

    private int[] data;

    public Arraylist() {
        data = EMTY_DATA;
    }

    public void add(int e) {
        int[] tem = new int[data.length +  1];
        for(int i = 0; i<data.length; i++){
            tem[i] = data[i];
        }
        tem[data.length] = e;
        data = tem;

    }

    @Override
    public String toString(){
        String res = "[ ";
        for(int i = 0; i<data.length; i++){
            res += data[i] + " ";
        }
        res += " ]";
        return res;
    }


}
