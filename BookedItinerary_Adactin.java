package newone;

import pom.Pagerepo_bookeditinerary;

public class BookedItinerary_Adactin {

	public static void main(String[] args) {
		Pagerepo_bookeditinerary p=new Pagerepo_bookeditinerary();
		p.launchBrowser();
		p.openApp("https://adactinhotelapp.com/");
		p.enterUsername("motivity");
		p.enterPassword("9603107203");
		p.clickLogin();
		p.location("London");
		p.hotels("Hotel Sunshine");
		p.roomtype("Standard");
		p.noofrooms("1 - One");
		p.clear();
		p.checkindate("20/2/2021");
		p.checkoutdate("21/2/2021");
		p.adultperRoom("1 - One");
		p.ChildrenperRoom("2 - Two");
		p.search();
		p.select();
		p.continuebutton();
		p.firstname("Naresh");
		p.lastname("Ravula");
		p.address("hyderabad");
		p.creditcardno("5897561556789345");
		p.creditcardtype("VISA");
		p.Expirydate("January", "2021");
		p.cvvno("345");
		p.booknow();
		p.bookedItinerary();
		p.check();
		p.cancelledbutton();
		p.accept();
		p.logout();
		p.aglogin();
	}

}

