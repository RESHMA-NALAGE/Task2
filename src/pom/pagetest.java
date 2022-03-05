package pom;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class pagetest 
{
 public WebDriver driver;
	
  @BeforeClass
  public void in() 
  {
		//System set proprty
			System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe");
			//launch browser
					driver=new ChromeDriver();
					
					//Maximize window
					driver.manage().window().maximize();
					
					//adding implicitly waits 
					driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
					
					//open session
					String url="https://jt-dev.azurewebsites.net/#/SignUp";
					driver.get(url);
			}
	  @Test
	  public void login() throws IOException
	  {
		  String path=System.getProperty("user.dir")+"\\config1.properties";
		  Properties p=new Properties();
		  FileInputStream fs=new FileInputStream(path);
		  p.load(fs);
		  
		  System.out.println(p.getProperty("drop"));
		  System.out.println(p.getProperty("name"));
		  System.out.println(p.getProperty("orgName"));
		  System.out.println(p.getProperty("Email"));
		  System.out.println(p.getProperty("chekbox"));
		  System.out.println(p.getProperty("submit"));
		  
		  loginmodel lo= new loginmodel(driver);
		  lo.page(p.getProperty("name"), p.getProperty("orgName"),p.getProperty("Email"));
		  
	  }
  }




/*
another way
public void login()
{"user.dir)"+"\\config1.properties";
	  loginmodel lo= new loginmodel(driver);
	  lo.page("reshma", "reshmakakade@.com");
	  
}*/








