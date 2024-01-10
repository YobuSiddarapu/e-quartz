package com.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
public class TestBase {

	//we are going to take data from the configuration properties file and open the browser 
	//and set the configuration

		public static Properties prop;
		FileInputStream file;
		public static WebDriver driver;
		protected ExtentReports extentreports;
		public static EventFiringWebDriver e_driver;
		public static WebDriverEventListener listenerss;
		 public TestBase() {
			// TODO Auto-generated constructor stub
		 

			try {
				file = new FileInputStream("C:\\Users\\ELCOT\\git\\Ecom_mayAutomation\\src\\main\\java\\configproperties\\Configprop");
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}

			prop = new Properties();

			try {
				prop.load(file);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
//		extentreports = new ExtentReports();
//		ExtentSparkReporter spark= new ExtentSparkReporter(".\\target\\report.html");
	//   extentreports.attachReporter(spark);
	    
		  

		}

		public void initialization() {

			String browsername = prop.getProperty("browser");
			if (browsername.equals("chrome")) {
				driver = new ChromeDriver();
			} else if (browsername.equals("Edge")) {
				driver = new EdgeDriver();
			} else if (browsername.equals("firefox")) {

				driver = new FirefoxDriver();
			}
			//e_driver = new EventFiringWebDriver(driver);
			// Now create object of EventListerHandler to register it with EventFiringWebDriver
			//listenerss = new EventListners();
			///e_driver.register(listenerss);
			///driver = e_driver;
			
			
			
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(45,TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			extentreports.flush();

		

	}

	
	
	
	
	
	
}
