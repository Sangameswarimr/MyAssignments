package assignments;

public class LibraryManagement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library manage=new Library(); //creating object for the library class in the library management class
		manage.addBook("Thirukkural"); //calling both methods of library class from library management class
		manage.issueBook();
	}

}
