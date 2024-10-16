package assignments;

public class Browser {
public void  launchBrowser(String browserName) {
	System.out.println("Browser "+browserName+" launched successfully");
}
	public void  loadUrl() {
		System.out.println("Application Url loaded successfully");	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Browser a = new Browser();
a.launchBrowser("Chrome");
a.loadUrl();

	}

}
