public class Textbook {
    private String title;
    private String author;
    private String subject;
    private int year;
    private double price;

    // no-arg constructor
    public Textbook() {
        this.title = "Intro to Programming";
        this.author = "A. Author";
        this.subject = "Computer Science";
        this.year = 2025;
        this.price = 79.99;
    }

    // full-arg constructor
    public Textbook(String title, String author, String subject, int year, double price) {
        this.title = title;
        this.author = author;
        this.subject = subject;
        this.year = year;
        this.price = price;
    }

    // getters
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getSubject() {
        return subject;
    }
    public int getYear() {
        return year;
    }
    public double getPrice() {
        return price;
    }

    // setters
    public void setTitle(String title) {
        this.title = title;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void setSubject(String subject) {
        this.subject = subject;
    }
    public void setYear(int year) { 
    this.year = year; 
    }
    public void setPrice(double price) {
        this.price = price;
    }

    // instance method
    public void applyDiscount(double percent) {
        if (percent < 0) percent = 0;
        if (percent > 100) percent = 100;
        this.price = this.price * (1 - percent / 100.0);
    }

    @Override
    public String toString() {
        return "Textbook{title='" + title + "', author='" + author + "', subject='" + subject +
               "', year=" + year + ", price=$" + String.format("%.2f", price) + "}";
    }
}