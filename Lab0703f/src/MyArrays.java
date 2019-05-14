public class MyArrays {

    public static void insert(int[] ar){
        for(int i =1; i<ar.length; i++){
            int k = ar[i];
            int t = i-1;

            while(t>-1 && ar[t]>k){
                ar[t+1] = ar[t];
                t--;
            }
            ar[t+1] = k;
        }
    }
    public static void insert(Object[] ar){
        for(int i =1; i<ar.length; i++){
            Object k = ar[i];
            int t = i-1;

            while(t>-1 && ((MyComparable)ar[t]).compareTo(k) > 0){
                ar[t+1] = ar[t];
                t--;
            }
            ar[t+1] = k;
        }
    }
    public static void insert(Object[] ar, MyComparator cmp){
        for(int i =1; i<ar.length; i++){
            Object k = ar[i];
            int t = i-1;

            while(t>-1 && ((cmp.compareTo(ar[t],k) > 0))){
                ar[t+1] = ar[t];
                t--;
            }
            ar[t+1] = k;
        }
    }
}
