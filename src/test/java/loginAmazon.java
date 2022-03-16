import java.io.IOException;
import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginAmazon {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium with Java\\Software Installs_IMP\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3F%26ext_vrnc%3Dhi%26tag%3Dgooghydrabk1-21%26ref%3Dnav_signin%26adgrpid%3D58075519359%26hvpone%3D%26hvptwo%3D%26hvadid%3D486462777326%26hvpos%3D%26hvnetw%3Dg%26hvrand%3D17132457789264019894%26hvqmt%3De%26hvdev%3Dc%26hvdvcmdl%3D%26hvlocint%3D%26hvlocphy%3D9062111%26hvtargid%3Dkwd-64107830%26hydadcr%3D14452_2154371%26gclid%3DEAIaIQobChMI3Z6O3tax9gIVVyUrCh2ypgC3EAAYASAAEgIDqfD_BwE&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		driver.manage().window().maximize();
		
		dataLoginAmazon d = new dataLoginAmazon();
		ArrayList <String> data = d.getData("Login");
		
		driver.findElement(By.id("ap_email")).sendKeys(data.get(1));
		driver.findElement(By.id("continue")).click();
		driver.findElement(By.id("ap_password")).sendKeys(data.get(2));
		driver.findElement(By.id("signInSubmit")).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys(data.get(3));
		driver.findElement(By.id("nav-search-submit-button")).click();
		
	}

}
