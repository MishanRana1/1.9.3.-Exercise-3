public class TextbookTester {
    public static void main(String[] args) {
        
        // make two textbooks
        Textbook t1 = new Textbook(); // uses defaults
        Textbook t2 = new Textbook("OOP and Data Structure", "Hyesung Park", "CS", 2025, 99.95);

        // use getters / setters
        System.out.println(t1);
        t1.setPrice(69.99);
        t1.setYear(2022);
        System.out.println("After updates: " + t1.getTitle() + " $" + t1.getPrice() + " (" + t1.getYear() + ")");

        // use instance method
        t2.applyDiscount(15); // 15% off
        System.out.println("After 15% discount: " + t2);

        // show other getters
        System.out.println("t2 subject: " + t2.getSubject());
        System.out.println("t2 author: " + t2.getAuthor());
    }
}