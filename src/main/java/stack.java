import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        //Stack - LIFO data structure Last-in First-Out
        //        push() to add to the top
        //        pop() to remove from the bottom

        //with stacks we can run out of memory
        // stack.search("") will give the index value for 1st matching term from index 1
        // if the search item is not in stack it will return -1
        //peek() will help us to see the element at the top of the stack

        //declare a stack
//        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());
//        stack.push("Cricket");
//        stack.push("Football");
//        stack.push("Rugby");
//        stack.push("Volleyball");
//        stack.push("Basketball");

        //String myFavGame = stack.pop();
        //System.out.println(stack.search("Cricket1"));
        //System.out.println(stack);

        //uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (file directories)
        // 4. calling functions (call stack)

            String expr = "([{}])";

            // Function call
            if (areBracketsBalanced(expr))
                System.out.println("Balanced ");
            else
                System.out.println("Not Balanced ");
        }

        private static boolean areBracketsBalanced(String expr) {
            Stack<Character> expression = new Stack<>();
            for (int i = 0; i < expr.length(); i++) {
                char x = expr.charAt(i);
                if (x == '(' || x == '{' || x == '[') {
                    expression.push(x);
                    continue;
                }
                if (expression.empty()) {
                    return false;
                }
                char check;
                switch (x) {
                    case ')':
                        check = expression.pop();
                        if (check == '{' || check == '[')
                            return false;
                        break;

                    case '}':
                        check = expression.pop();
                        if (check == '(' || check == '[')
                            return false;
                        break;

                    case ']':
                        check = expression.pop();
                        if (check == '(' || check == '{')
                            return false;
                        break;
                }


            }


            return expression.empty();
        }


}

