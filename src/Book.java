

//import lab1_cpit251.*;


public class Book {
    
    private int ISBN;
    private String title;
    private String author;
    private String classfication;
    private int copies;

    public void setCopies(int copies) {
        this.copies = copies;
    }

    public Book(int ISBN, String title, String author, String classfication, int copies) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
        this.classfication = classfication;
        this.copies = copies;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getClassfication() {
        return classfication;
    }

    public int getCopies() {
        return copies;
    }

    public String showDetail() {
        return "Book{" + "ISBN=" + ISBN + ", title=" + title + ", author=" + author + ", classfication=" + classfication + '}';
    }
    
    public boolean isAvailable(){
        
        if (copies > 0)
            return true;
        
        else
            return false;
    }
}
