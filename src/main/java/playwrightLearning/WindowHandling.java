package playwrightLearning;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class WindowHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		
		Playwright pw = Playwright.create();
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext bc1 =  browser.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
		Page page1 = bc1.newPage();
		page1.navigate("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Page popup = page1.waitForPopup(()->{
			page1.click("img[alt='OrangeHRM on twitter']");
		});
		System.out.println(popup.title());
		popup.close();
		System.out.println(page1.title());
		
		
		BrowserContext bc2 =  browser.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
		
		Page page2 = bc2.newPage();
	
		page2.navigate("https://www.amazon.com");

	}

}
