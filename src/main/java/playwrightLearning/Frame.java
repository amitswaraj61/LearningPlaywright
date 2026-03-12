package playwrightLearning;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class Frame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pw = Playwright.create();
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
//        page.navigate("https://www.londonfreelance.org/courses/frames/index.html");
//        String textContent = page.frameLocator("frame[name='main']").locator("h2").textContent();
//        System.out.println(textContent);
//        
//        page.frame("main").locator("h2").textContent();
        
        page.navigate("https://www.formsite.com/templates/registration-form-templates/vehicle-registration-form/");
        page.locator("//*[@title='Vehicle-Registration-Forms-and-Examples']").click();
        page.frameLocator("//iframe[contains(@id,'frame-one')]").locator("#RESULT_TextField-8").fill("amit");

	}

}
