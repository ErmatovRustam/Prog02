import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            String word = scan.next();
            int check = 1;

            for (int j = 0; j < word.length(); j++) {

                if(word.charAt(j) == 'A' || word.charAt(j) == 'E' || word.charAt(j) == 'I' || word.charAt(j) == 'O' ||
                        word.charAt(j) == 'S' || word.charAt(j) == 'a' || word.charAt(j) == 'e' ||
                        word.charAt(j) == 'i' || word.charAt(j) == 'o' || word.charAt(j) == 's'){
                    check *= 3;
                }
                else{
                    check *=2;
                }
            }
            System.out.println(check);
        }
        //System.out.println();
    }
}
