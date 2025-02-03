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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle)
    {
        author = bookAuthor;
        title = bookTitle;
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
    
        
}
