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
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages; 
        refNumber = "";
        borrowed = 0; 
        courseText = true; 
    }

    // 2.83
    /** 
     * This method gets the book author.
     */
    public String getbookAuthor()
    {
        return author;
    }
    
    /**
     * This method gets the book title.
     */
    public String getbookTitle()
    {
        return title; 
    }
    
    // 2.84 
    /** 
     * This method prints the author's name.
     */
    public void printAuthor()
    {
        System.out.println(author); 
    }
    
    /**
     * This method prints the book's title.
     */
    public void printTitle()
    {
        System.out.println(title); 
    }
    
    // 2.85
    /**
     * This method gets the amount of pages in the book.
     */
    public int getbookPages()
    {
        return pages; 
    }
    
    // 2.87
    /**
     * This method prints the details of the book including the 
     * amount of times it has been borrowed.
     */
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
    /**
     * This method sets a reference number for the book. If the 
     * length is less than 3 characters, an error message occurs. 
     */
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
    
    /**
     * This method returns the reference number. 
     */
    public String getRefNumber()
    {
        return refNumber; 
    }
    
    // 2.91 
    /**
     * This method determines how many times the book has been borrowed.
     */
    public void setBorrowed(int borrow)
    {
       borrowed = borrow; 
    }
    
    /**
     * This method returns how many times the book has been 
     * borrowed and increments the count by 1 each time it is 
     * called. 
     */
    public int getBorrowed()
    {
        return borrowed++;
    }
    
    // 2.92 
    /** 
     * This method determines if the book is being
     * used as a course textbook.
     */
    public boolean isCourseText()
    {
        return courseText; 
    }
}
