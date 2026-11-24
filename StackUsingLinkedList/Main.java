public class Main {
    public static void main(String[] args) {
        System.out.println("===== Basic Operations =====");
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();                                   // 30 -> 20 -> 10
        System.out.println("Peek: " + stack.peek());       // 30
        stack.pop();                                       // 30 removed
        stack.display();                                   // 20 -> 10
        System.out.println("Size: " + stack.size());       // 2
        System.out.println("isEmpty: " + stack.isEmpty()); // false
        stack.pop();                                       // 20 removed
        stack.pop();                                       // 10 removed
        System.out.println("isEmpty: " + stack.isEmpty()); // true
        stack.pop();                                       // Stack Underflow

        System.out.println("\n===== Challenge 1: Reverse String =====");
        System.out.println(Challenges.reverseString("hello"));

        System.out.println("\n===== Challenge 2: Palindrome =====");
        System.out.println("madam -> " + Challenges.isPalindrome("madam"));
        System.out.println("hello -> " + Challenges.isPalindrome("hello"));

        System.out.println("\n===== Challenge 3: Reverse a Stack =====");
        Stack s = new Stack();
        s.push(1); s.push(2); s.push(3); s.push(4);
        System.out.print("Original: "); s.display();
        Stack rev = Challenges.reverseStack(s);
        System.out.print("Reversed: "); rev.display();

        System.out.println("\n===== Challenge 4: Middle Element =====");
        Stack m = new Stack();
        for (int i = 1; i <= 5; i++) m.push(i * 10);
        m.display();
        System.out.println("Middle: " + m.middle());
    }
}