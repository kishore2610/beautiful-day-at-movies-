import java.util.*;;

public class cat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = Math.abs(c - a);
            int e = Math.abs(c - b);
            if (d < e)
                System.out.println("cat A");
            else if (d == e)
                System.out.println("Mouse C");
            else
                System.out.println("cat B");
        }

    }
}