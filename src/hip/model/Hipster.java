package hip.model;

public class Hipster
{
	private String name;
	private String[] hipsterPhrases;


	

	private Book[] hipsterBooks;
	
	public Hipster()
	{
		this.name = "";
		this.hipsterPhrases = new String[4];
		this.hipsterBooks = new Book[3];
		
		setupArray();
		setupBooks();
	}
	
	private void setupArray()
	{
		hipsterPhrases[0] = "Using the main thread is too Mainstream.";
		hipsterPhrases[1] = "If I look like a hipster, Its because I am one.";
		hipsterPhrases[2] = "Null...   Hah gocha";
		hipsterPhrases[3] = "Spooky scary skeleton.";
	}
	
	private void setupBooks()
	{
		Book firstBook, secoundBook, thirdBook;
		firstBook = new Book();
		firstBook.setAuthor("Jared Kerr");
		firstBook.setTitle("FortyFive Reasons \"Code Age\" is the worst book ever");
		firstBook.setSubject("FACT");
		firstBook.setPageCount(45);
		firstBook.setPrice(13.458774);
		
		secoundBook = new Book();
		secoundBook.setAuthor("Jared Kerr");
		secoundBook.setTitle("Reasons why I will never Round Money");
		secoundBook.setSubject("FACT");
		secoundBook.setPageCount(2);
		secoundBook.setPrice(1.458774);
		
		thirdBook = new Book(300, "Rick Riordan", "The Titan's Curse", "Science Fiction", 25.99);
		
		hipsterBooks[0] = firstBook;
		hipsterBooks[1] = secoundBook;
		hipsterBooks[2] = thirdBook;
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	
	public void setHipsterBooks(Book[] hipsterBooks)
	{
		this.hipsterBooks = hipsterBooks;
	}
	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}

	public Book[] getHipsterBooks()
	{
		return hipsterBooks;
	}

//	public void setHipsterBooks(Book[] hipsterBooks)
//	{
//		this.hipsterBooks = hipsterBooks;
//	}
			
}
