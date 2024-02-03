package genericUtilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
//when we get error on retryimplementation  mouseover on error and click on add unimplemented method

public class RetryImplementation implements IRetryAnalyzer {
	 int count=0;
	 int maxRetries=3;

	@Override
	public boolean retry(ITestResult result) {
		// TODO Auto-generated method stub
		if(count<maxRetries)
		{
			count++;
			
		return false;
	}
	 return false;
}

}
