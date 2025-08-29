import java.util.*;

public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<Integer>();        
        while(true){
            int val = sc.nextInt();
            switch (val) {
                case 1:
                int num = sc.nextInt();
                stack.push(num);
                System.out.println(num + " is puhsed in the stack");
                break;

                case 2:
                if(stack.isEmpty()){
                    System.out.println("EMPTY STACK");
                }else{
                    int data = stack.pop();
                    System.out.println(data + " is poped from the stack");
                }
                break;

                case 3:
                if(stack.isEmpty()){
                    System.out.println("EMPTY STACK");
                }
                for(int res : stack){
                    System.out.println(res);
                }
                break;

                case 4:
                    System.out.println("Wrong choice");
                    break;
                default:
                    break;
            }

        }
    }
}
