package baseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectBaseClass {
public static WebDriver driver;
	
	public static WebDriver browserLaunch(String args) {
		WebDriverManager.chromedriver().setup();
		return driver=new ChromeDriver();
		
	}
	public static void urlLaunch(String url) {
		driver.get(url);
		driver.manage().window().maximize();
	}
	public static void implicitewait(long sec) {
		driver.manage().timeouts().implicitlyWait(sec,TimeUnit.SECONDS);
		
	}
public static String gettitle() {
	String title=driver.getTitle();
	return title;
	
}
public static String getCurrentUrl() {
	String Url=driver.getCurrentUrl();
	return Url;

}
public static void browserQuit() {
driver.quit();

}
public static void browserClose() {
driver.close();
}
public static String getText() {
String text=driver.getTitle();
return text;

}
public static String getAttributes(WebElement e) {
String attributes=e.getAttribute("value");
return attributes;

}
public static void sendkeys(WebElement e, String value) {
	e.sendKeys(value);
	
}
public static void buttonClick(WebElement e) {
	e.click();
}
public static void movetoElement(WebElement e) {
Actions a=new Actions(driver);
a.moveToElement(e).perform();
}
public static void dragAndDrop(WebElement src, WebElement des) {
	Actions a=new Actions(driver);
	a.dragAndDrop(src, des).perform();
	
}
public static void selectByIndex(WebElement e, int index) {
	Select s=new Select(e);
	s.selectByIndex(index);
}

public static void maselectByValue(WebElement e, String value) {
	Select s=new Select(e);
	s.selectByValue(value);
	
}
public static void deselectByValue(WebElement e, String value) {
	Select s=new Select(e);
	s.deselectByValue(value);
}
public static WebElement findElements(String locatorName, String value) {
	WebElement v=null;
	if(locatorName.equals("id")) {
		v=driver.findElement(By.id(value));}
	else if(locatorName.equals("name")) {
		v=driver.findElement(By.name(value));
	}else if(locatorName.equals("xpath")) {
		v=driver.findElement(By.xpath(value));
	}
	return v;
	
}
}
