public class Main {
    public static void main(String[] args) {
        InfixToPostfix post = new InfixToPostfix();

        String infix = "a+b*(c^d-e)^(f+g*h)-i";

        System.out.println("Expression : " + infix);

        String postfix  = post.postfix(infix);
        System.out.println("Postfix : " + postfix);
    }
}
