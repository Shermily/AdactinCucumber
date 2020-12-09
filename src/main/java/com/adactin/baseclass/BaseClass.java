package com.adactin.baseclass;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver getBrowser(String browserName) {
		try {
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver",
						"E:\\Workspace\\employee\\Selinium\\Drivers\\chromedriver.exe");
				driver = new ChromeDriver();

			} else if (browserName.equals("ie")) {
				System.setProperty("webriver.ie.driver",
						"E:\\Workspace\\employee\\Selinium\\Drivers\\IEDriverServer.exe");
				driver = new InternetExplorerDriver();

			} else {
				System.out.println("Invalid BrowserName");

			}
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return driver;

	}
	
	

	public static void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static void getUrl(String url) {
		try {
			driver.get(url);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void inputValuetoElement(WebElement element, String value) {
		waitForElement(element);
		try {
			element.sendKeys(value);
		} catch (Exception e) {
		}

	}

	public static void clickOnElement(WebElement element) {
		// waitForElement(element);
		try {
			element.click();
		} catch (Exception e) {

		}
	}

	public static void moveToElement(WebElement element) {
		waitForElement(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element).perform();
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void selectDropDown(WebElement element, String value, String option) {
		// waitForElement(element);

		Select s = new Select(element);
		try {
			if (option.equalsIgnoreCase("value")) {

				s.selectByValue(value);

			} else if (option.equalsIgnoreCase("text")) {

				s.selectByVisibleText(value);

			} else if (option.equalsIgnoreCase("index")) {

				s.selectByIndex(Integer.parseInt(value));
			}
		} catch (Exception e) {
		}
	}

	public static void clickable(WebElement element) {
		waitForElement(element);
		try {
			Actions ac = new Actions(driver);
			ac.moveToElement(element);
			ac.click(element).perform();
		} catch (Exception e) {

		}
	}

	public static void getScreenshot(String fileName) throws IOException {
		TakesScreenshot ts= (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File disFile = new File(System.getProperty("user.dir")+"\\ScreenShot\\"+"filename"+".png");
		FileUtils.copyFile(src, disFile);
	}
}
