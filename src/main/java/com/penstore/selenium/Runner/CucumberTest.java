package com.penstore.selenium.Runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java/com/penstore/selenium/testing/Features/CrudOperation.feature"}) 
public class CucumberTest {

}
