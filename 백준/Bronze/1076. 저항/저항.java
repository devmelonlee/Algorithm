import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String one = br.readLine();
        String two = br.readLine();
        String three = br.readLine();

        ArrayList<String> color = new ArrayList<>();
        color.add("black");
        color.add("brown");
        color.add("red");
        color.add("orange");
        color.add("yellow");
        color.add("green");
        color.add("blue");
        color.add("violet");
        color.add("grey");
        color.add("white");

        long ans = 0L;
        ans += color.indexOf(one)*10;
        ans += color.indexOf(two);
        ans *= Math.pow(10, color.indexOf(three));

        System.out.println(ans);
    }
}