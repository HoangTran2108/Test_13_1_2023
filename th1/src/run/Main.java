package run;

import book.Book;
import book.FictionBook;
import book.ProgrammingBook;

public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[10];
        books[0] = new ProgrammingBook("Pr1", "Lập trình 1", 10, "Hoàng", "Java", 20);
        books[1] = new ProgrammingBook("Pr2", "Lập trình 2", 15, "Hoàng", "Java", 20);
        books[2] = new ProgrammingBook("Pr3", "Lập trình 3", 20, "Hoàng", "C++", 20);
        books[3] = new ProgrammingBook("Pr4", "Lập trình 4", 200, "Hoàng", "Java", 20);
        books[4] = new ProgrammingBook("Pr5", "Lập trình 5", 150, "Hoàng", "C++", 20);
        books[5] = new FictionBook("Fr1", "Trịnh Văn nam - nhà tư tưởng vĩ đại", 10, "Nam", "Viễn tưởng 1" );
        books[6] = new FictionBook("Fr1", "Trịnh Văn nam - nhà bác học thiên tài", 100, "Nam", "Viễn tưởng 3" );
        books[7] = new FictionBook("Fr1", "Trịnh Văn nam - vận động viên huyền thoại", 10, "Nam", "Viễn tưởng 2" );
        books[8] = new FictionBook("Fr1", "Trịnh Văn nam - 1 người họa sĩ tài ba", 10, "Nam", "Viễn tưởng 1" );
        books[9] = new FictionBook("Fr1", "Trịnh Văn nam - 1 nhân cách lớn", 10, "Nam", "Viễn tưởng 1" );
        for ( Book a: books) {
            System.out.println(a);
        }
        System.out.println("Tổng 10 giá tiền cuốn sách là:" + sum(books));
        System.out.println("Số sách ProgrammingBook có language Java là: " + totalJava(books) );
        System.out.println("Số sách Fiction có category là “Viễn tưởng 1” là: " + totalCategory(books));
        System.out.println("Số sách Fiction có giá nhỏ hơn 100 là: " + checkPrice(books));
    }

    public static int totalJava (Book[] arr) {
        int count = 0;
        for (Book j: arr) {
            if (j instanceof ProgrammingBook && ((ProgrammingBook)j).getLanguage().equals("Java")){
                    count ++;
            }
        }return count;
    }
    public static int totalCategory (Book[] arr) {
        int count = 0;
        for (Book j: arr) {
            if (j instanceof FictionBook && ((FictionBook)j).getCategory().equals("Viễn tưởng 1")){
                count ++;
            }
        }return count;
    }
    public static int checkPrice (Book[] arr) {
        int count = 0;
        for (Book j: arr) {
            if (j instanceof FictionBook && j.getPrice() < 100){
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