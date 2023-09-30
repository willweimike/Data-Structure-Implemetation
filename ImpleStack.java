import java.util.Stack;

public class ImpleStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Hello");
        stack.push("cool");
        stack.push("wow");

        System.out.println(stack.search("?"));

    }
}
