package playwrightLearning;

import java.util.List;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class LocatorConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pw = Playwright.create();
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

//		BrowserContext bc1 =  browser.newContext();
//		Page page1 = bc1.newPage();
//		page1.navigate("https://orangehrm.com/en/30-day-free-trial");
//		
//		Locator locator1 = page1.locator("//*[text()=\"Contact Sales\"]");
//		locator1.hover();
//		locator1.click();

//		BrowserContext bc1 = browser.newContext();
//		Page page1 = bc1.newPage();
//		page1.navigate("https://academy.naveenautomationlabs.com/");
//
//		Locator locator1 = page1.locator("text=Login");
//		int count = locator1.count();
//		System.out.println(count);
//		locator1.first().click();
		
		BrowserContext bc1 =  browser.newContext();
		Page page1 = bc1.newPage();
		page1.navigate("https://orangehrm.com/en/30-day-free-trial");
		
		Locator locator1 = page1.locator("select#Form_getForm_Country option");
//		int count = locator1.count();
//        System.out.println(count);
//        for(int i=0;i<locator1.count();i++) {
//        	System.out.println(locator1.nth(i).textContent());
//        }
		
		List<String> allTextContents = locator1.allTextContents();
//		for(String e : allTextContents) {
//			System.out.println(e);
//		}
		
		allTextContents.forEach(ele -> System.out.println(ele));
	}

}
