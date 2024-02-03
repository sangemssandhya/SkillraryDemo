package testScripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtilities.BaseClass;
//this test is used to add user to the application
public class AddUserTest extends BaseClass {
	
	@Test
	public void addUserTest()
	{
		SoftAssert soft=new SoftAssert();
		home.clickUsersTab();
		soft.assertTrue(users.getPageHeader().contains("Users"));
		users.clickNewButton();
		soft.assertEquals(addUser.getpageHeader(), "Add New User");
		
		
		
		Map<String,String>map=excel.readFromExcel("AddUser");
		 addUser.setEmail(map.get("Email"));
		 addUser.setPassword(map.get("Password"));
		 addUser.setFirstname(map.get("Firstname"));
		 addUser.setLastname(map.get("Lastname"));
		 addUser.setAddress(map.get("Address"));
		 addUser.setContactInfo(map.get("Contact info"));
		 addUser.uploadPhoto(map.get("Photo"));
		 users.clicksave();
		 soft.assertEquals(users.getPageHeader(), "Success!");
		 soft.assertAll();
	}
	
	

}
