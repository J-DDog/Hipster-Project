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
		
	}
	
	public Hipster(String name)
	{
		
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String[] getHipsterPhrases()
	{
		return hipsterPhrases;
	}

	public void setHipsterPhrases(String[] hipsterPhrases)
	{
		this.hipsterPhrases = hipsterPhrases;
	}

//	public Book[] getHipsterBooks()
//	{
//		return hipsterBooks;
//	}

//	public void setHipsterBooks(Book[] hipsterBooks)
//	{
//		this.hipsterBooks = hipsterBooks;
//	}
			
}
