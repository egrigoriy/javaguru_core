package module_2;

import java.util.Random;

public class StringBuilderBufferDemo {
    public static void main(String[] args) {
        String[] s1 = {"a", "b", "c"};
        String[] s2 = {"x", "y", "z"};
        String[] s3 = {"1", "2", "3"};
        Random r = new Random();
        StringBuilder sb = new StringBuilder();
        sb.append("It is well to ");
        sb.append(s1[r.nextInt(3)]).append(s2[r.nextInt(3)]).append(s3[r.nextInt(3)]);
        System.out.println(sb);

    }

}
