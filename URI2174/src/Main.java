import java.util.*;

public class Main
        {
            public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                int n = scan.nextInt();
                scan.nextLine();
                ArrayList<String> list = new ArrayList<>();
                for (int i = 0; i < n; i++)
                {
                    String s = scan.nextLine();
                    list.add(s);
                    for (int j = 0; j < list.size() - 1; j++)
                    {
                        if (list.get(j).equals(s))
                        {
                            list.remove(list.size() - 1);
                            break;
                        }
                    }
                }
                System.out.println("Falta(m) " + (151 - list.size()) + " pomekon(s).");

            }
        }