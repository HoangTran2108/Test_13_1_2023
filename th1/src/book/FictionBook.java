package book;

public class FictionBook extends Book {
    private String category;

    public FictionBook(String bookCode, String name, double price, String author, String category) {
        super(bookCode, name, price, author);
        this.category = category;
    }

    public FictionBook() {
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "FictionBook: " + "Mã :" + getBookCode() +
                "; Tên: " + getName() +
                "; Giá: " + getPrice() +
                "; Tác giả: " + getAuthor() +
                "; Thể loại: " + getCategory();
    }
}
