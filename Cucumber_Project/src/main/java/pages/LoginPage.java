package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {
	
	WebDriver driver;
	
	public void openLoginPage() {
		System.setProperty("webdriver.chrome.driver", "D:\\QA\\SeleniumJars\\chromedriver.exe");
		driver = new ChromeDriver(); 	
		driver.get("https://auth.scotiaonline.scotiabank.com/online?oauth_key=WNPtrT2BaBk&oauth_key_signature=eyJraWQiOiJrUFVqdlNhT25GWUVDakpjMmV1MXJvNGxnb2VFeXJJb2tCbU1oX3BiZXNVIiwidHlwIjoiSldUIiwiYWxnIjoiUlMyNTYifQ.eyJyZWZlcmVyIjoiaHR0cHM6XC9cL3d3dy5zY290aWFiYW5rLmNvbVwvIiwib2F1dGhfa2V5IjoiV05QdHJUMkJhQmsiLCJjb25zZW50X3JlcXVpcmVkIjpmYWxzZSwicmVkaXJlY3RfdXJpIjoiaHR0cHM6XC9cL3d3dy5zY290aWFvbmxpbmUuc2NvdGlhYmFuay5jb21cL29ubGluZVwvbGFuZGluZ1wvb2F1dGhsYW5kaW5nLmJucyIsImV4cCI6MTY2ODM3MzA0MSwiaWF0IjoxNjY4MzcxODQxLCJqdGkiOiIzZDYxMzM2ZC05YzBkLTRkNjItOWM1ZC1lMzczNTcyZjkwNTQiLCJjbGllbnRfaWQiOiI4ZWU5MGMzOS0xYzUyLTRmZjQtOGFlNi1hN2I1NGM1Mzk5MzMiLCJjbGllbnRfbWV0YWRhdGEiOnsiQ2hhbm5lbElEIjoiU09MIiwiQXBwbGljYXRpb25Db2RlIjoiSDcifSwiaXNzdWVyIjoiaHR0cHM6XC9cL3Bhc3Nwb3J0LnNjb3RpYWJhbmsuY29tIn0.qIptxm00KZshGgPZv7hnFwd6-t2k2IoKKTFvK6fz7weZsGzLQ5SRQhLr58l05DJBRcr7ue--5F4-T6D4DekBuiilhnA9LwZihmZl7xb7Xq7OWmDDMIGas45ZSMqx4SCBZSAD_YU4KnU-R-GT2azrvjtp7KXLGYcpuiJCgDOrr3devrK5OcoT1oODFB6n7XDd8_yU15WfIlF-SEpUmzrv6xw0YiZBMc5GcfYLINabq2t2gV4Bb2EoH5-s2cqxMgl6cC3grBMgtGQ8lE0Zj02RtUtU4ZbCf40BKb5f7tAfe2beU7QgNvWMi1SD4qkGjdjWql2-xwR_NGB26gpn7o2sDQ&preferred_environment=");	
	}
	
	public String getTitle() {
		String actualTitle = driver.getTitle();
	    System.out.println(actualTitle);
		return actualTitle;
	}
	
	public void enterEmailPassword(String email, String password) {
		driver.findElement(By.id("usernameInput-input")).sendKeys(email);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	public void clickOnLoginButton() {
		driver.findElement(By.id("signIn")).click();
	}
	
	public String readEmailErr() {
		String actualErr = driver.findElement(By.id("UsernameTextField__errors-usernameInput")).getText();
		System.out.println(actualErr);
		return actualErr;
	}
	
	public void closeBrowser() {
		driver.quit();
	}

}
