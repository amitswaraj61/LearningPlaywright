package playwrightLearning;

import java.awt.Dimension;
import java.awt.Toolkit;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class SelectOption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		int width = (int) screenSize.getWidth();
		int height = (int) screenSize.getHeight();
		
		Playwright pw = Playwright.create();
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
		
		BrowserContext bc1 =  browser.newContext(new Browser.NewContextOptions().setViewportSize(width, height));
		Page page1 = bc1.newPage();
		page1.navigate("https://demo.automationtesting.in/Register.html");
		page1.selectOption("#Skills", "Java");
		page1.locator("//select[@placeholder='Month']").selectOption("March");
		page1.close();
		bc1.close();
		pw.close();

	}

}
