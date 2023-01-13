package book;

public class ProgrammingBook extends Book{
    private String language;
    private double framework;

    public ProgrammingBook(String bookCode, String name, double price, String author, String language, double framework) {
        super(bookCode, name, price, author);
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook(String language, double framework) {
        this.language = language;
        this.framework = framework;
    }

    public ProgrammingBook() {
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public double getFramework() {
        return framework;
    }

    public void setFramework(double framework) {
        this.framework = framework;
    }

    @Override
    public String toString() {
        return "ProgrammingBook" + "Mã :" + getBookCode() +
                "; Tên: " + getName() +
                "; Giá: " + getPrice() +
                "; Tác giả: " + getAuthor() +
                "; Ngôn ngữ: " + getLanguage() +
                ", framework=" + framework;
    }
}
