import HashTable.CharFinder;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
    private static int abc;
    public static void main(String[] args) {
        CharFinder finder = new CharFinder();
        var ch=finder.findFirstNonRepeatingChar("a green apple");
        System.out.println(ch);
    }
    public static void reverse(Queue<Integer>queue)
    {
        Stack<Integer> stack = new Stack<>();
        while (!queue.isEmpty())
        {
            stack.push(queue.remove());
        }
        while (!stack.isEmpty())
            queue.add(stack.pop());
    }
}