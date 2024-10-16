package assignments;

public class Library {
	public String addBook(String bookTitle) //method 1
	{System.out.println("Book added Successfully");
	return bookTitle;
	}
	
	public void issueBook()  //method2
	{
		System.out.println("Book issued Successfully");
	}
	
	public static void main(String[] args) {
		Library lib=new Library(); // creating object for Library class 
		lib.addBook("Thirukkural");//calling both methods using object
		lib.issueBook();
	}

}
