package com.davidsanchez.serenity.steps;

import net.thucydides.core.annotations.Steps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import javax.validation.constraints.AssertTrue;

import org.junit.Assert;
import org.mockito.internal.matchers.Contains;

import com.davidsanchez.serenity.steps.serenity.EndUserSteps;

public class DefinitionSteps {

    @Steps
    EndUserSteps eus;

    @Given("^the user is on the search page$")
    public void givenTheUserIsOnTheWikionaryHomePage() {
        eus.is_the_search_page();
    }

    @When("^the user enter origin: \"([^\"]*)\" ,destination: \"([^\"]*)\", departure date: \"([^\"]*)\", return date: \"([^\"]*)\",number of adults: \"([^\"]*)\",number of teens: \"([^\"]*)\",number of children: \"([^\"]*)\",number of infants: \"([^\"]*)\"$")
    public void whenTheUserLooksUpTheDefinitionOf(String origin,String destination,String dDate,String rDate,String nAdults,String nTeens,String nChildren,String nInfants) throws InterruptedException {
        eus.enters(origin,destination,dDate,rDate,nAdults,nTeens,nChildren,nInfants);
        eus.starts_search();
        Thread.sleep(3000);
    }

    @Then("^they should see the check flights page$")
    public void thenTheyShouldSeeCheckFlightsPage() throws InterruptedException {
        eus.check_flights_page();
        eus.possible_trip();
        eus.go_services_page();
        Thread.sleep(3000);
    }
    
    @Then("^the user enters passengers names with title \"([^\"]*)\", \"([^\"]*)\" and \"([^\"]*)\", travel insurance \"([^\"]*)\"$")
    public void thenTheUserEnterServicesData(String title,String name,String surname,String insurance) throws InterruptedException {
        eus.enter_services_data(title,name,surname,insurance);
        eus.go_CarHire_page();
        Thread.sleep(3000);
    } 
    
    @Then("^they should see the car hire page$")
    public void thenTheyShouldSeeCarHirePage() {
        eus.check_car_hire_page();
        eus.go_purchase_page();
    }
    

}
