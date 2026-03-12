package playwrightLearning;

import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Download;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FileDownload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playwright pw = Playwright.create();
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
        
       Download download = page.waitForDownload(()->{
        	page.click("");
        });
       System.out.println(download.url());
       System.out.println(download.page().title());
       
       String string = download.path().toString();
       
       download.saveAs(Paths.get(""));

	}

}
