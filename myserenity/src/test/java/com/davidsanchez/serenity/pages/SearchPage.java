package com.davidsanchez.serenity.pages;

import ch.lambdaj.function.convert.Converter;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import net.serenitybdd.core.pages.WebElementFacade;

import net.serenitybdd.core.annotations.findby.FindBy;

import net.thucydides.core.pages.PageObject;

import java.util.List;
import java.util.Random;

import static ch.lambdaj.Lambda.convert;

@DefaultUrl("https://www.bookryanair.com/SkySales/Booking.aspx?#Search")
public class SearchPage extends PageObject {

    /*@FindBy(name="search")
    private WebElementFacade searchTerms;

    @FindBy(name="go")
    private WebElementFacade lookupButton;
	*/
    @FindBy(name="SearchInput$Orig")
    private WebElementFacade origin;
    
    @FindBy(name="SearchInput$Dest")
    private WebElementFacade destination;
    
    @FindBy(name="SearchInput$DeptDate")
    private WebElementFacade departureDate;
    
    @FindBy(name="SearchInput$RetDate")
    private WebElementFacade returnDate;
    
    @FindBy(name="SearchInput$PaxTypeADT")
    private WebElementFacade adult;
    
    @FindBy(name="SearchInput$PaxTypeTEEN")
    private WebElementFacade teen;
    
    @FindBy(name="SearchInput$PaxTypeCHD")
    private WebElementFacade children;
    
    @FindBy(name="SearchInput$PaxTypeINFANT")
    private WebElementFacade infant;
    
    @FindBy(id="SearchInput_ButtonSubmit")
    private WebElementFacade searchButton;
    
    @FindBy(id="err")
    private WebElementFacade errorAlert;
    
    public void enter_flight_data(String origin2, String destination2, String dDate, String rDate, String nAdults, String nTeens, String nChildren, String nInfants){
    	enter_origin(origin2);
    	enter_destination(destination2);
    	enter_dDate(dDate);
    	enter_rDate(rDate);
    	enter_nAdults(nAdults);
    	enter_nTeens(nTeens);
    	enter_nChildren(nChildren);
    	enter_nInfants(nInfants);
    }
    
    public void enter_origin(String origin2) {
        origin.selectByValue(origin2);
    }
    
    public void enter_destination(String destination2) {
        destination.selectByValue(destination2);
    }
    //departure
    public void enter_dDate(String dDate) {
    	departureDate.clear();
        departureDate.type(dDate);
    }
    //return
    public void enter_rDate(String rDate) {
    	returnDate.clear();
        returnDate.type(rDate);
    }
    
    public void enter_nAdults(String nAdults) {
        adult.selectByValue(nAdults);
    }
    
    public void enter_nTeens(String nTeens) {
        teen.selectByValue(nTeens);
    }
    
    public void enter_nChildren(String nChildren) {
        children.selectByValue(nChildren);
    }
    
    public void enter_nInfants(String nInfants) {
        infant.selectByValue(nInfants);
    }

    public void search_flights() {
        searchButton.click();
    }
    

    
   /*     
    public void enter_keywords(String keyword) {
        searchTerms.type(keyword);
    }
    
    public void lookup_terms() {
        lookupButton.click();
    }

    public List<String> getDefinitions() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        List<WebElement> results = definitionList.findElements(By.tagName("li"));
        return convert(results, toStrings());
    }

    private Converter<WebElement, String> toStrings() {
        return new Converter<WebElement, String>() {
            public String convert(WebElement from) {
                return from.getText();
            }
        };
    }
    */
}