package generic;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class GenericUtils 
{
	public static void getScreenShot(WebDriver driver, String name)
	{
		try
		{
			TakesScreenshot t=(TakesScreenshot)driver;
			File src=t.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("./screenshots/"+name+".png"));
		}
		catch(IOException e)
		{
		}
	}
	//-----------Select Class Methods--------------//
		public static void selectByIndex(WebElement element, int index)
		{
			Select sel=new Select(element);
			sel.selectByIndex(index);
		}
		public static void selectByValue(WebElement element, String value)
		{
			Select sel=new Select(element);
			sel.selectByValue(value);
		}
		public static void selectByVisibleText(WebElement element, String text)
		{
			Select sel=new Select(element);
			sel.selectByVisibleText(text);
		}
		public static void deselectByIndex(WebElement element, int index)
		{
			Select sel=new Select(element);
			sel.deselectByIndex(index);
		}
		public static void deselectByValue(WebElement element, String value)
		{
			Select sel=new Select(element);
			sel.deselectByValue(value);
		}
		public static void deselectByVisibleText(WebElement element, String text)
		{
			Select sel=new Select(element);
			sel.deselectByVisibleText(text);
		}
		public static List<WebElement> getOptions(WebElement element)
		{
			Select sel=new Select(element);
			List<WebElement> allOptions = sel.getOptions();
			return allOptions;
		}
		public static List<WebElement> getAllSelectedOptions(WebElement element)
		{
			Select sel=new Select(element);
			List<WebElement> allOptions = sel.getAllSelectedOptions();
			return allOptions;
		}
		public static WebElement getFirstSelectedOptions(WebElement element)
		{
			Select sel=new Select(element);
			WebElement Option = sel.getFirstSelectedOption();
			return Option;
		}
		public static boolean isMultiple(WebElement element)
		{
			Select sel=new Select(element);
			boolean type = sel.isMultiple();
			return type;
		}
		
		//----------Actions Methods--------------//
		public static void dragAndDrop(WebDriver driver, WebElement source, WebElement target)
		{
			Actions act= new Actions(driver);
			act.dragAndDrop(source, target).perform();
		}
		public static void contextClick(WebDriver driver, WebElement target)
		{
			Actions act= new Actions(driver);
			act.contextClick(target).perform();;
		}
		public static void doubleClick(WebDriver driver, WebElement target)
		{
			Actions act= new Actions(driver);
			act.doubleClick(target).perform();
		}
		public static void moveToElement(WebDriver driver, WebElement target)
		{
			Actions act= new Actions(driver);
			act.moveToElement(target);
		}
}





