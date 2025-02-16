public class ExceptionHandlingExamples {

    public static void arithmeticExceptionExample() {
        try {
            int result = 10 / 0;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: Division by zero!");
        }
    }

    public static void arrayIndexOutOfBoundsExample() {
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: Index is out of bounds!");
        }
    }

    public static void nullPointerExceptionExample() {
        try {
            String str = null;
            System.out.println(str.length());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: Null reference accessed!");
        }
    }

    public static void multipleCatchExample() {
        try {
            int[] arr = {1, 2, 3};
            int result = arr[2] / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught!");
        }
    }

    public static void finallyBlockExample() {
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught!");
        } finally {
            System.out.println("Finally block executed!");
        }
    }

    public static void customExceptionExample() throws CustomException {
        throw new CustomException("This is a custom exception!");
    }

    public static void main(String[] args) {
        arithmeticExceptionExample();
        arrayIndexOutOfBoundsExample();
        nullPointerExceptionExample();
        multipleCatchExample();
        finallyBlockExample();
        
        try {
            customExceptionExample();
        } catch (CustomException e) {
            System.out.println(e.getMessage());
        }
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
