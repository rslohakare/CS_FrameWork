package ExtentReport;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

	public static void main(String[] args) {

		ExtentReports extent = new ExtentReports();
		ExtentSparkReporter sparkreporter= new ExtentSparkReporter("C:\\Users\\Rahul\\eclipse-workspace\\ExtentReport\\html\\rahul.html");
		
		extent.attachReporter(sparkreporter);
		
		extent.flush();
		
		
		
	}

}
