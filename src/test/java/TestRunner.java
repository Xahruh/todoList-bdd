import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;


@CucumberOptions(
        features = {"src/test/resources/features"},
        glue = {"com/todoList"},
        tags = "@testing",
        dryRun = false
)

public class TestRunner extends AbstractTestNGCucumberTests {

}

