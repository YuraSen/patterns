package interpretator;

public class Main {
    public static void main(String[] args) {

        //"1-2+3"
        Context context = new Context();
        Expression expression = context.evaluate("1+2+20");
        System.out.println(expression.interpret());
    }
}
