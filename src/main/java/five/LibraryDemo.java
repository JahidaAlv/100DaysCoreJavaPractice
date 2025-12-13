package five;

class Library{
    int availableBooks = 3;

    public void borrowBook(int booksRequested){

        try{
            int[] books = {101, 102, 103};
            System.out.println("Books Requested: " + books[booksRequested]);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Occurred, You requested a book that does not exist.");
        }
        catch (NullPointerException e){
            System.out.println("NullPointerException");
        }
        finally {
            System.out.println("Finally Block.");
        }
    }
}

public class LibraryDemo {
    public static void main(String[] args) {
        Library library = new Library();
        library.borrowBook(3);
    }
}
