package sm.example.navigation;

import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import org.junit.Assert;

public class NavigationSteps {
    private NavigationModel model;

    @When("the user navigates to the intranet home page")
    public void whenTheUserNavigatesToTheIntranetHomePage() {
        model.goToPage();
    }

    @Then("they the title is '$expected'")
    public void thenTheyTheTitleIs(String expected) {
        String actual = model.getTitle();

        Assert.assertEquals(expected, actual);
    }
}