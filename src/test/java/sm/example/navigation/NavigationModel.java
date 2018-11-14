package sm.example.navigation;

import net.thucydides.core.pages.PageObject;

public class NavigationModel extends PageObject {

    public void goToPage() {
        getDriver().get(TestContext.getUrl());
    }

    public void goToPageOriginal() {
        getDriver().get("https://www.google.com");
    }
 }