package autostep_def;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\eclipseworkspace\\FirstCucumberProjectJune2019\\src\\main\\java\\Feature\\autopractice.feature",
                 glue={"autostep_def"},
                 plugin={"pretty","html:C:\\eclipseworkspace\\FirstCucumberProjectJune2019\\target","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
                 dryRun=false,  //mapping between feature file and stepdefinition is proper or not
                 strict=true,  //it will check if any step is not defined in stepdefinition file
                 monochrome=true  //display the console output in a proper readable format
)

public class AutoPracticeTestRunner {

}
