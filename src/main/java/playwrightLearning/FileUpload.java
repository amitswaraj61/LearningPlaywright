package playwrightLearning;

import java.nio.file.Path;
import java.nio.file.Paths;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class FileUpload {

	public static void main(String[] args) {
		Playwright pw = Playwright.create();
		Browser browser = pw.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
        Page page = browser.newPage();
        page.navigate("https://the-internet.herokuapp.com/javascript_alerts");
        
        //single file
        page.setInputFiles("input#filesToUpload", Paths.get("")); //select file
        page.setInputFiles("input#filesToUpload", new Path[0]); //deselect file
        
        //multiple path
        page.setInputFiles("input#filesToUpload", new Path[] {
        		Paths.get(""), Paths.get("")
        }); //select file

	}

}
