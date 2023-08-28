package ui.pageobjects;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ui.driver.WebDriverSingleton;

@Slf4j
public class BasePage {

	private static final long EXPLICIT_WAIT_TIMEOUT = 10L;

	protected final WebDriver driver = WebDriverSingleton.getInstance();
	private final WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(EXPLICIT_WAIT_TIMEOUT));

	protected boolean isElementDisplayed(By selector) {
		return driver.findElement(selector).isDisplayed();
	}

	protected void clickOnElement(By selector) {
		driver.findElement(selector).click();
	}

	protected void waitForElementVisible(By selector) {
		try {
			webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(selector));
		} catch (TimeoutException ignored) {
			log.warn("Timeout for waitForElementVisible");
		}
	}

	protected void waitForElementClickable(By selector) {
		try {
			webDriverWait.until(ExpectedConditions.elementToBeClickable(selector));
		} catch (TimeoutException ignored) {
			log.warn("Timeout for waitForElementClickable");
		}
	}

	protected void enterText(By selector, String text) {
		driver.findElement(selector).clear();
		driver.findElement(selector).sendKeys(text);
	}

	public void takeScreenshot() throws IOException {
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		//Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		//Move image file to new destination

		File DestFile = new File("C:\\Users\\keseha\\Desktop\\screenshot.png");
		//Copy file at destination

		FileUtils.copyFile(SrcFile, DestFile);

	}

}
