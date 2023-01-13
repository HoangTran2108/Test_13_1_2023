package run;

import book.Book;
import book.FictionBook;
import book.ProgrammingBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook("Pr1", "Lập trình 1", 10, "Hoàng", "Java", 20);
        books[1] = new ProgrammingBook("Pr2", "Lập trình 2", 15, "Hoàng", "Java", 20);
        books[2] = new ProgrammingBook("Pr3", "Lập trình 3", 20, "Hoàng", "C++", 20);
        books[3] = new ProgrammingBook("Pr4", "Lập trình 4", 200, "Hoàng", "Java", 20);
        books[4] = new ProgrammingBook("Pr5", "Lập trình 5", 150, "Hoàng", "C++", 20);
        books[5] = new FictionBook("Fr1", "Trịnh Văn Nam - nhà tư tưởng vĩ đại", 10, "Nam", "Viễn tưởng 1" );
        books[6] = new FictionBook("Fr1", "Trịnh Văn Nam - nhà bác học thiên tài", 100, "Nam", "Viễn tưởng 3" );
        books[7] = new FictionBook("Fr1", "Trịnh Văn Nam - vận động viên huyền thoại", 10, "Nam", "Viễn tưởng 2" );
        books[8] = new FictionBook("Fr1", "Trịnh Văn Nam - 1 người họa sĩ tài ba", 10, "Nam", "Viễn tưởng 1" );
        books[9] = new FictionBook("Fr1", "Trịnh Văn Nam - 1 nhân cách lớn", 10, "Nam", "Viễn tưởng 1" );
        Scanner scanner = new Scanner(System.in);
        String language;
        String category;
        double price;
        for ( Book a: books) {
            System.out.println(a);
        }
        System.out.println("Tổng 10 giá tiền cuốn sách là:" + sum(books));
        System.out.println("Mời bạn nhập ngôn ngữ cần đếm ");
        language = scanner.nextLine();
        System.out.println("Số sách ProgrammingBook có language " + language + " là: " + totalJava(books,language) );
        System.out.println("Mời bạn nhập thể loaị cần đếm ");
        category = scanner.nextLine();
        System.out.println("Số sách Fiction có thể loại " + category + " là: " + totalCategory(books,category));
        System.out.println("Mời bạn nhập giá cần kiểm tra ");
        price = scanner.nextDouble();
        System.out.println("Số sách Fiction có giá nhỏ hơn " + price + ", là: " + checkPrice(books,price));
    }

    public static int totalJava (Book[] arr , String language) {
        int count = 0;
        for (Book j: arr) {
            if (j instanceof ProgrammingBook && ((ProgrammingBook)j).getLanguage().equals(language)){
                    count ++;
            }
        }return count;
    }
    public static int totalCategory (Book[] arr , String category) {
        int count = 0;
        for (Book j: arr) {
            if (j instanceof FictionBook && ((FictionBook)j).getCategory().equals(category)){
                count ++;
            }
        }return count;
    }
    public static int checkPrice (Book[] arr, double price) {
        int count = 0;
        for (Book j: arr) {
            if (j instanceof FictionBook && j.getPrice() < price){
                count ++;
            }
        }return count;
    }
    public static double sum(Book[] arr) {
        double sum = 0;
        for (Book i: arr) {
            sum += i.getPrice();
        }
        return sum;
    }
}