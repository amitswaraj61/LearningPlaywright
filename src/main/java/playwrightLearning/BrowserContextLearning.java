package playwrightLearning;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.BrowserContext;

public class BrowserContextLearning {

	public static void main(String[] args) {
		//Maximize the windows.
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		
		Playwright pw = Playwright.create();
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext bc1 =  browser.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
		Page page1 = bc1.newPage();
		page1.navigate("https://orangehrm.com/en/30-day-free-trial");
		page1.fill("#Form_getForm_Name", "Amit");
		System.out.println(page1.title());
		
		BrowserContext bc2 =  browser.newContext();
		Page page2 = bc2.newPage();
		page2.navigate("https://orangehrm.com/en/30-day-free-trial");
		page2.fill("#Form_getForm_Name", "Amit");
		System.out.println(page2.title());
		
		page1.close();
		bc1.close();
		

		page2.close();
		bc2.close();
		
		
		

	}

}
