package ui.pageobjects.alten;

import org.openqa.selenium.By;
import ui.pageobjects.BasePage;

public class AboutPage extends BasePage {

    private final By videoPlayer = By.className("youtube_player");

    public boolean isDisplayed() {
        return isElementDisplayed(videoPlayer);
    }

}
