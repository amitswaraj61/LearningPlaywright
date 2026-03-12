package playwrightLearning;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pw = Playwright.create();
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.onDialog(dia -> {
        	String m = dia.message();
        	System.out.println(m);
        	dia.accept("AmitSwaraj");
        	//dia.dismiss();
        });
        
        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
        
        page.locator("//*[text()='Click for JS Alert']").click();
        
        page.locator("//*[text()='Click for JS Prompt']").click();
	}

}
