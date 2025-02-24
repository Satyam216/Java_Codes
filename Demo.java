public class Demo {
    public static void main(String[] args) {
        try {
            int arr[] = new int[5]; 
            arr[10] = 50;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught");
        } catch (Exception e) {
            System.out.println("Exception caught");
        }
        
    }
    
}
