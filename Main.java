public class Main {
    public static void main(String[] args) {
        System.out.println("Task1");
        ExceptionHandler handler = new ExceptionHandler();

        handler.handleException1();
        handler.handleException2();
        handler.handleException3();

        System.out.println("Task2");

        SecondClass secondClass = new SecondClass();
        secondClass.method3(); // Виняток буде перехоплено та опрацьовано
            try {
                secondClass.method2(); // Виняток буде сгенеровано але не опрацьовано
            } catch (CustomException e) {
                System.out.println("Перехоплено виняток: " + e.getMessage());
            }
        }

    }
