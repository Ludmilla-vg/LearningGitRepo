package nz.co.Projects.StepDefs;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import nz.co.Projects.TestDriver;

public class Hooks {

    public static TestDriver testDriver;
    public static Scenario scenario;

    @Before
    public void Before(Scenario scenario){
        Hooks.scenario =scenario;
        testDriver = new TestDriver();
    }

    @After
    public void After(Scenario scenario){
        Hooks.scenario=scenario;
        TestDriver.automator.quit();
    }
}
