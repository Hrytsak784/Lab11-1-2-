public class SecondClass {
    public void method1() throws CustomException {
        throw new CustomException("Помилка в методі 1");
    }

    public void method2() throws CustomException {
        throw new CustomException("Помилка в методі 2");
    }

    public void method3() {
        try {
            // Викликаємо метод який може згенерувати виняток
            method1();
        } catch (CustomException e) {
            // Опрацювання власного винятку
            System.out.println("Перехоплено виняток: " + e.getMessage());
        }
    }

}
