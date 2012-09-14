package oracle.tutorial.chapter1;

import java.util.Currency;

public class EnumDemo {
	private COUNTRY country;

	public EnumDemo(COUNTRY country) {
		super();
		this.country = country;
	}
	public Currency getCurrency(){
		String Landwaerung;
		switch(country){
			case AUSTRIA : case GERMANY : Landwaerung = "EUR";//return Currency.getInstance("EUR")
				break;
			case ENGLAND : Landwaerung = "GBP";
				break;
			case SWEDEN :  Landwaerung = "SEK";
				break;
			case NORWAY : Landwaerung = "NOK";
				break;
			default: Landwaerung = "Unbekant";	
		}
		return Currency.getInstance(Landwaerung);
	}
}
