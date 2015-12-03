package com.davidsanchez.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CarHire extends PageObject{

	@FindBy(id="CarHireControl_ButtonSubmit")
    private WebElementFacade continueButton;
	
	public String check_car_hire_page() {
		return getTitle();
	}
	
	public void continue_services_page() {
		continueButton.click();
	}
}
