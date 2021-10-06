import javax.crypto.CipherInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        Stack stack = new Stack();

        stack.push(13);
        System.out.println(stack.peek());
        stack.push(74);
        System.out.println(stack.peek());
        stack.push(53);
        System.out.println(stack.peek());

//        while(stack.size() > 0){
//            System.out.println(stack.pop());
//        }

        stack.forEach(System.out::println);
    }
}