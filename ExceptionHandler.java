public class ExceptionHandler {
    public void handleException1() {
        try {
            int result = 10 / 0; // Генеруємо ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
    public void handleException2() {
        try {
            try {
                String str = null;
                System.out.println(str.length()); // Генеруємо NullPointerException
            } catch (NullPointerException e) {
                System.out.println("Помилка: " + e.getMessage());
            }
        } catch (Exception e) {
            System.out.println("Помилка: " + e.getMessage());
        }
    }
    public void handleException3() {
        try {
            int[] arr = new int[5];
            System.out.println(arr[10]); // Генеруємо ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Помилка: " + e.getMessage());
        } finally {
            System.out.println("Блок finally виконано.");
        }
    }

}
