import java.util.*;

public class tree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int j = 0; j < n; j++) {
            int r = 1;
            int a = sc.nextInt();
            for (int i = 1; i <= a; i++) {
                if (i % 2 != 0)
                    r = r * 2;
                else
                    r = r + 1;
            }
            System.out.print(r+" ");
        }
    }
}
