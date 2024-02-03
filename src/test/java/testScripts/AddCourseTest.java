package testScripts;

import java.util.Map;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import genericUtilities.BaseClass;
import genericUtilities.IconstantsPath;

public class AddCourseTest extends BaseClass {
	@Test
	public void addCourseTest()
	{
		home.clickCoursesTab();
		home.clickCoursesListLink();
		SoftAssert soft=new SoftAssert();
		home.clickCoursesTab();
		home.clickCoursesListLink();
		soft.assertTrue(courseList.getpageHeader().contains("Course List"));
		courseList.clickNewButton();
		soft.assertEquals(addCourse.getPageHeader(), "Add Course");
		Map<String,String>map=excel.readFromExcel("Add Course");
		addCourse.setName(map.get("Name"));
	    addCourse.setCategory(web, map.get("Category"));
	    addCourse.setPrice(map.get("Price"));
	    addCourse.uploadPhoto(map.get("Photo"));
	    addCourse.setDescription(map.get("Description"), web);
	    addCourse.clickSave();
	    soft.assertEquals(category.getpageHeader(), "Success!");
	    courseList.deleteCourse(web, map.get("Name"));
	    soft.assertEquals(category.getpageHeader(), "Success!");
	    
		if(courseList.getSuccessMessage().equals("Success!"))
			excel.updateTestStatus("Add Course","Pass",IconstantsPath.EXCEL_PATH);
		else
			excel.updateTestStatus("Add Course", "Fail", IconstantsPath.EXCEL_PATH);
		soft.assertAll();
	    

			
	}
}
