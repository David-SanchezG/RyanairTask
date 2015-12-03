package com.davidsanchez.serenity.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.bookryanair.com/SkySales/Booking.aspx?#Services")
public class CheckServices extends PageObject{
	
	
	@FindBy(id="title_0")
    private WebElementFacade titlePassenger;

	@FindBy(id="firstname_0")
    private WebElementFacade namePassenger;
	
	
	@FindBy(id="lastname_0")
    private WebElementFacade surnamePassenger;
	
	@FindBy(id="insCountry_0")
    private WebElementFacade insurance;
	
	@FindBy(id="GrpServices_ButtonSubmit")
    private WebElementFacade continueButton;
	
	public void enter_names(String title, String name, String surname) {
		titlePassenger.selectByValue(title);
		namePassenger.clear();
		namePassenger.type(name);
		surnamePassenger.clear();
		surnamePassenger.type(surname);
	}

	public void enter_insurance_service(String insurance2) {
		insurance.selectByValue(insurance2);
	}
	
	public void go_car_hire_page(){
		continueButton.click();
	}
	
}
