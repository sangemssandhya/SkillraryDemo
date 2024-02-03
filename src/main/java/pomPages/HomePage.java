package pomPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	//declaration

	@FindBy(xpath="//a[text()=' Home']")
	private WebElement pageHeader;
	@FindBy(xpath="//span[text()='Users']")
	private WebElement usersTab;
	@FindBy(xpath="//span[text()='Courses']")
	private WebElement coursesTab;
	@FindBy(xpath="//a[text()=' Course List']")
	private WebElement coursesListLink;
	@FindBy(xpath="//a[text()=' Category']")
	private WebElement categoryLink;
	@FindBy(xpath="//span[text()='SkillRary Admin']")
	private WebElement SkillraryAdminIcon;
	@FindBy(xpath="//a[text()='Sign out']")
	private WebElement signoutLink;
	
	//intilization
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	 public String getPageHeader()
	 {
		 return pageHeader.getText();
	 }
	 public void clickUsersTab()
	 {
		 usersTab.click();
	 }
	 public void clickCoursesTab()
	 {
		 coursesTab.click();
		 
	 }
	 public void clickCoursesListLink()
	 {
		 coursesListLink.click();
		 
	 }
	 public void clickCategoryLink()
	 {
		 categoryLink.click();
		 
	 }
	 public void signOutofApp()
	 
	 {
		 SkillraryAdminIcon.click();
		 signoutLink.click();
		 
	 }
	





}
