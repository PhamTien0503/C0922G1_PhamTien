import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    boolean solution(String s) {
        String rg = "^([[{][}]|[[][]]|[(][)]|])*$";
        return s.matches(rg);
    }
}