package ss21_design_pattern.thuc_hanh.trien_khai_singleton;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;
    public void borrowBook(){
        borrowedBook = BookSingleton.borrowBook();

        if(borrowedBook == null){
            haveBook = false;
        }else {
            haveBook = true;
        }
    }
    public String getAuthorAndTitle(){
        if(haveBook){
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }
    public void returnBook(){
        borrowedBook.returnBook(borrowedBook);
    }
}
