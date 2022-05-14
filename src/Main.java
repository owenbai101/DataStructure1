import HashTable.CharFinder;
import HashTable.HashTable;

import java.util.*;

public class Main {
    private static int abc;
    public static void main(String[] args) {
        HashTable table = new HashTable();
        table.put(6,"A"); //1
        table.put(8,"B"); // 3
        table.put(11,"C"); // 1
        table.put(6,"A+");
        table.remove(6);
        System.out.println(table.get(10));
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