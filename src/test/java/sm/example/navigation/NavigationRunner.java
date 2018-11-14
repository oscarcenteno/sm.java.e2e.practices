package sm.example.navigation;

import net.serenitybdd.jbehave.SerenityStories;
import org.jbehave.core.io.StoryFinder;
import org.jbehave.core.steps.InjectableStepsFactory;
import org.jbehave.core.steps.InstanceStepsFactory;

import java.util.Arrays;
import java.util.List;

import static org.jbehave.core.io.CodeLocations.codeLocationFromClass;

public class NavigationRunner extends SerenityStories {

    @Override
    public List<String> storyPaths() {
        return Arrays.asList("stories/example/navigation/PageLoad.story");
    }

}