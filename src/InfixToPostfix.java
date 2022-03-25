class InfixToPostfix {
    Stack stack = new Stack();

    int getLevel(char x){
        switch (x){
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
        }
        return -1;
    }
    String postfix (String str){
        String post = new String("");

        for (int i = 0; i < str.length(); ++i){
            char x = str.charAt(i);

            if (Character.isLetterOrDigit(x)){
                post+=x;
            } else if (x == '('){
                stack.push(x);
            } else if (x == ')'){
                while (!stack.isEmpty() && stack.peek() != '('){
                    post+=stack.peek();
                    stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && getLevel(x) <= getLevel(stack.peek())){
                    post+=stack.peek();
                    stack.pop();
                }
                stack.push(x);
            }
        }

        while (!stack.isEmpty()){
            if(stack.peek() == '(')
                return "Invalid Expression";
            post += stack.peek();
            stack.pop();
        }

        return post;
    }
}
