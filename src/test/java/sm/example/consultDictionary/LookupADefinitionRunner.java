package sm.example.consultDictionary;

import net.serenitybdd.jbehave.SerenityStories;

import java.util.Arrays;
import java.util.List;

public class LookupADefinitionRunner extends SerenityStories {

    @Override
    public List<String> storyPaths() {
        return Arrays.asList("stories/example/consultDictionary/LookupADefinition.story") ;
    }
}
