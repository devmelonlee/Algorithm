import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int ans = 0;
        int ret = 0;
        ans = sc.nextInt();
        ret = ans - 543;
        System.out.println(ret);

        sc.close();
    }
}
