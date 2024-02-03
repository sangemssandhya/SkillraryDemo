package genericUtilities;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListernerImplementation  implements ITestListener{

	//listener implementation select then right click then source then override methods then select methods  
	//deselect failed with success percentage and failed with timeouts then click on ok
	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"Execution starts");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"Success");
		}

	
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"Fail");
		System.out.println("Failed due to:"+result.getThrowable());
		WebDriverUtility web=new WebDriverUtility();
		web.captureScreenshot(BaseClass.sdriver, BaseClass.sjutil, result.getMethod().getMethodName());
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println(result.getMethod().getMethodName()+"skipped");
		System.out.println("Skipped due to:"+result.getThrowable());
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("suite execution starts");
	}

	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		System.out.println("Suite Execution Terminates");
	}
	

}
