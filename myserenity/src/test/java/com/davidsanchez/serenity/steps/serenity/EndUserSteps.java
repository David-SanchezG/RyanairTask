package com.davidsanchez.serenity.steps.serenity;

import com.davidsanchez.serenity.pages.CarHire;
import com.davidsanchez.serenity.pages.CheckFlights;
import com.davidsanchez.serenity.pages.CheckServices;
import com.davidsanchez.serenity.pages.SearchPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

import org.junit.Assert;

public class EndUserSteps extends ScenarioSteps {

    SearchPage searchPage;
    CheckFlights CheckFlightsPage; 
    CheckServices services;
    CarHire carHire;

    @Step
    public void is_the_search_page() {
    	searchPage.open();
    }
    
    @Step
    public void enters(String origin, String destination, String dDate, String rDate, String nAdults, String nTeens, String nChildren, String nInfants) {
    	searchPage.enter_flight_data(origin,destination,dDate,rDate,nAdults,nTeens,nChildren,nInfants);
    }
    
    @Step
    public void starts_search() {
    	searchPage.search_flights();
    }
    
    
    @Step
	public void check_flights_page() {
		Assert.assertTrue(CheckFlightsPage.check_flights_page().equals("Select - Ryanair.com"));
	}
    
	public void possible_trip() {
		Assert.assertTrue(CheckFlightsPage.isEnabledContinueButton());
	}

    @Step
	public void go_services_page() {
		CheckFlightsPage.continue_services_page();
	}

    @Step
	public void enter_services_data(String title,String name,String surname,String insurance) {
		services.enter_names(title,name,surname);
		services.enter_insurance_service(insurance);
		services.go_car_hire_page();
	}

    @Step
	public void check_car_hire_page() {
    	Assert.assertTrue(carHire.check_car_hire_page().equals("CarHire - Ryanair.com"));
	}

    @Step
	public void go_purchase_page() {
    	carHire.continue_services_page();
	}
   
    
}