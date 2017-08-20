package ApplicationPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	WebDriver driver;
	
	public  HomePage(WebDriver Idriver){
	
	this.driver = Idriver;
	}

	@FindBy(xpath = "//span[text'Log In']")
	WebElement logInLink;
	
	@FindBy(xpath = "//span[text'My Account']")
	WebElement MyAccountLink;
	
	@FindBy(xpath = "//span[text'Wishlist']")
	WebElement WishlistLink;
	
	@FindBy(xpath = "//span[text'My Cart']")
	WebElement MyCartLink;
	
	@FindBy(xpath = "//span[hidden text][test'Home']")
	WebElement HomeLink;
	
	public void clickOnlogInLink(){
		logInLink.click();
	}
	
	public void clickOnMyAccountLink(){
		MyAccountLink.click();
	}
	
	public void clickOnHomeLink(){
		HomeLink.click();
	}
	
	public void clickOnWishListLink(){
		WishlistLink.click();
	}
	
	public void clickOnMyCartLink(){
		MyCartLink.click();
	}
	
	
	public String getApplicationTitle(){
		return (driver.getTitle());
		
	}
	
}
