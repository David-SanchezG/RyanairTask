package com.davidsanchez.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CheckFlights extends PageObject{

	
	@FindBy(id="SelectInput_ButtonSubmit")
    private WebElementFacade continueButton;
	
	public String check_flights_page() {
		return getTitle();
	}
	
	public void continue_services_page() {
		continueButton.click();
	}

	public boolean isEnabledContinueButton() {
		return continueButton.isEnabled();
	}
	
}
