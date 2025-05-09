
public class Main {

    public static void main(String []arg){
        Stack stack=new StackArray();
        stack.push("this is a string");
        stack.push(5);
        stack.peek();
        System.out.println("is empty "+stack.isEmpty());
        System.out.println("pop= "+stack.pop());
        stack.peek();

    }
}
