package testScripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtilities.BaseClass;
import genericUtilities.IconstantsPath;

public class AddCategoryTest extends BaseClass {
	@Test
	public void addCategoryTest()
	{
		SoftAssert soft=new SoftAssert();
		home.clickCoursesTab();
		home.clickCategoryLink();
		
		
		soft.assertEquals(category.getpageHeader(), "Category");
		category.clickNewButton();
		soft.assertEquals(addCategory.getPageHeader(), "Add New Category");
		
		Map<String,String>map=excel.readFromExcel("Add category");
		addCategory.setName(map.get("Name"));
		addCategory.clickSave();
		
		soft.assertEquals(category.getSuccessMessage(), "Category");
		category.deleteCourse(web, map.get("Name"));
		
		soft.assertEquals(category.getpageHeader(), "Success!");
		if(category.getSuccessMessage().equals("Success!"))
			excel.updateTestStatus("Add Category","Pass",IconstantsPath.EXCEL_PATH);
		else
			excel.updateTestStatus("Add Category", "Fail", IconstantsPath.EXCEL_PATH);
		soft.assertAll();
			
	}

}
