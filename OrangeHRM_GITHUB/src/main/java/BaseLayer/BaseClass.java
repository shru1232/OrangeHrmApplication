package BaseLayer;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

import UtilityLayer.PropertyReader;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	private static ThreadLocal<WebDriver> td=new ThreadLocal<WebDriver>();
	
	public static WebDriver getDriver() {
		
		return td.get();
		
	}
	
	public static void initialization(String browserName) {
		
		
		if(browserName.equals("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver localDriver=new ChromeDriver();
			
			td.set(localDriver);
			
		}else if(browserName.equals("edge")) {
			
			WebDriverManager.edgedriver().setup();
			
			WebDriver localDriver=new EdgeDriver();
			
			td.set(localDriver);
			
		}else if(browserName.equals("incognito")) {
			
			ChromeOptions opt=new ChromeOptions();
			
			opt.addArguments("--incognito");
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver localDriver=new ChromeDriver(opt);
			
			td.set(localDriver);
			
		}
		else if(browserName.equals("headless")) {
			
			ChromeOptions opt=new ChromeOptions();
			
			opt.addArguments("--headless");
			
			WebDriverManager.chromedriver().setup();
			
			WebDriver localDriver=new ChromeDriver(opt);
			
			td.set(localDriver);
			
		}else {
			
			System.out.println("invalid browser name");
		}
		
		getDriver().manage().window().maximize();
		
		getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		getDriver().manage().timeouts().pageLoadTimeout(20,  TimeUnit.SECONDS);
		
		getDriver().get(PropertyReader.getProperty("BASE_URI"));
		
		
		
	}

}
