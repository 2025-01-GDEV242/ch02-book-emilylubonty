/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author Emily Lubonty
 * @version 2/3/2025
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber; 
    private int borrowed;
    private boolean courseText; 

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages; 
        refNumber = "";
        borrowed = 0; 
    }

    // 2.83
    public String getbookAuthor()
    {
        return author;
    }
    
    public String getbookTitle()
    {
        return title; 
    }
    
    // 2.84 
    
    public void printAuthor()
    {
        System.out.println(author); 
    }
    
    public void printTitle()
    {
        System.out.println(title); 
    }
    
    // 2.85
    public int getbookPages()
    {
        return pages; 
    }
    
    // 2.87
    public void printDetails()
    {
        System.out.println("Author: " + author); 
        System.out.println("Title: " + title); 
        System.out.println("Pages: " + pages);
        
        // 2.89
        int stringNumber = refNumber.length(); 
        if (stringNumber > 1){
            System.out.println("Reference Number: " + refNumber);
            }
        else {
            System.out.println("ZZZ");
        }
        
        if (borrowed < 1){
            System.out.println("This book has not been borrowed yet.");
            }
        else {
            System.out.println("This book has been borrowed " + borrowed + " times");
        }
    }
    
    // 2.88
    public void setRefNumber(String ref)
    {
         // 2.90
        if (ref.length() >= 3){
             refNumber = ref; 
            }
        else {
            System.out.println("That is not a valid reference number.");
            System.out.println("Enter a 3 character reference number."); 
        }
            
             
    }
    
    public String getRefNumber()
    {
        return refNumber; 
    }
    
    // 2.91 
    public void setBorrowed(int borrow)
    {
       borrowed = borrow; 
    }
        
    
    public int getBorrowed()
    {
        return borrowed++;
    }
    
    // 2.92 
    public boolean isCourseText()
    {
        return courseText; 
    }
}
