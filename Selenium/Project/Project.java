package Activities;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Project {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        //Open the browser
        //WebDriver driver = new FirefoxDriver();         
        WebDriverWait wait=new WebDriverWait(driver,5);         
        Actions action=new Actions(driver);
        
        // Page title is OrangeHRM
        
        driver.get("http://alchemy.hguy.co/orangehrm");
        
       
        String str1 = driver.getTitle();
        
        String str2 = "OrangeHRM";
        
        System.out.println("Verify that the page title is OrangeHRM : " +str1);
      
        assertTrue(str1.equals(str2));
        
        //System.out.println(assertTrue(str1.equals(str2)));
        //assert.assertEquals(str1, str2);
        
        //wait.until(ExpectedConditions.elementToBeClickable(By.id(str1)));
        
        // Login Page is launched
        
        WebElement userName=driver.findElement(By.id("txtUsername"));         
        WebElement password=driver.findElement(By.id("txtPassword"));         
        userName.sendKeys("orange");         
        password.sendKeys("orangepassword123");         
        driver.findElement(By.id("btnLogin")).click();   
        
        // Home page is launched
        
        //WebElement sales=driver.findElement(By.id("grouptab_0"));         
        //wait.until(ExpectedConditions.visibilityOf(sales));         
        //action.moveToElement(sales).pause(1).build().perform();         
        //wait.until(ExpectedConditions.elementToBeClickable(By.id("moduleTab_9_Leads")));         
        //driver.findElement(By.id("moduleTab_9_Leads")).click();         
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@id='adspan_1e367a61-8a0f-33f3-4e6f-5db0c113de32']/child::*")));
        //WebElement AdditionalInfo=driver.findElement(By.xpath("//span[@id='adspan_1e367a61-8a0f-33f3-4e6f-5db0c113de32']/child::*"));
    }
    
}