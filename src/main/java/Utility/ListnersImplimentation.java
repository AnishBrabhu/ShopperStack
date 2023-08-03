package Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListnersImplimentation<TakeScreenshot> extends BaseClass implements ITestListener {
	
	public void onTestFailure(ITestResult result) {
		
	}
	String failedMethod = result.getMethod().getMethod();
	System.out.println(failedMethod);
	TakeScreenshot ts = (TakeScreenshot)driver;
	Tempfile = ts.getScreenshotAs(OutputType.FILE);
	File permanentFile = new File("./"+failedMethod+"-Failed.png");
	private File TempFile;
	try {
		FileHandler.copy(TempFile,permanentFile);
	}
	catch(IOException e) {
		e.printStackTrace();
	}
}

	