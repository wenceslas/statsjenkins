package fr.gouv.finances.icestats.cucumber.stepdefs;

import fr.gouv.finances.icestats.StatsjenkinsApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = StatsjenkinsApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
