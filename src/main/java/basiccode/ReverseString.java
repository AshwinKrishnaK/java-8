package basiccode;

import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseString {

    public static void main(String[] args) {
        System.out.println(reverseUsingLoop("Ashwin"));
        System.out.println(reverseStringBuilderFunc("Ashwin"));
        System.out.println(reverseStringUsingStack("Ashwin"));
        System.out.println(reverseStringUsingStreams("Ashwin"));
    }

    /** Used to create mutable string objects
     * Normal String class is immutable since it creates memory
     * so string builder is used.
     */
    private static String reverseUsingLoop(String value){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = value.length() -1 ; i >= 0 ; i--){
            stringBuilder.append(value.charAt(i));
        }
        return stringBuilder.toString();
    }

    private static String reverseStringBuilderFunc(String value){
        return new StringBuilder(value).reverse().toString();
    }

    private static String reverseStringUsingStack(String value){
        Stack<Character> stack = new Stack<>();
        for(char ch : value.toCharArray())
            stack.push(ch);
        StringBuilder stringBuilder = new StringBuilder();
        while (!stack.empty()){
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    private static String reverseStringUsingStreams(String value){
        return Stream.of(value)
                .map(s-> new StringBuilder(s).reverse().toString())
                .collect(Collectors.joining());
    }
}
