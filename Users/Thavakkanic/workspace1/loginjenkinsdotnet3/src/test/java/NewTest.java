import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class NewTest {
	private InternetExplorerDriver driver;
	
@Test
  public void f() {

	  DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
	  //capabilities.setCapability(CapabilityType.BROWSER_NAME, "IE");
	  capabilities.setCapability(InternetExplorerDriver.
	    INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS,true);
	  System.setProperty("webdriver.ie.driver", ".\\IEDriverServer_Win32_3.9.0\\IEDriverServer.exe");
	  capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
	  capabilities.setCapability("ignoreZoomSetting", true);
	   driver = new InternetExplorerDriver(capabilities); 
      

      // And now use this to visit Google
      driver.navigate().to("http://localhost:64086/Home/About");
      // Alternatively the same thing can be done like this
      // driver.navigate().to("http://www.google.com");

      // Find the text input element by its name
      WebElement element = driver.findElement(By.id("Loginclick"));

      // Click the login button
      element.click();
  }
  
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}
