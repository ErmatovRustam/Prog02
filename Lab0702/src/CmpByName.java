import java.util.Arrays;

public class CmpByName implements Comparable<String[]> {
    String[] name;

    public CmpByName(String[] name){
        this.name = name;
    }

    @Override
    public int compareTo(String[] o) {
Arrays.sort(o);
        return
    }
}
