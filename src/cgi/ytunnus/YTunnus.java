package cgi.ytunnus;

import cgi.ytunnus.messages.Messages;
import cgi.ytunnus.service.impl.BusinessIdSpecification;

public class YTunnus {
	public static final String nokiaYT = "0112038-9";
	public static final String cgiYT = "0357502-9";
	public static final String vaaraTarkistusNro = "0112038-8";
	public static final String vaaraSisalto = "01A2038-9";			
	public static final String vaaraPituusLyhyt = "035750-9";
	public static final String vaaraPituuspitka = "03575023-9";
	public static final String vaaraValimerkki = "03575023_9";

	public static void main(String[] args) {
		System.out.println(Messages.YTUNNUS_ALOITUS);
		
		BusinessIdSpecification businessIdSpecification = new BusinessIdSpecification();
		
		System.out.println(nokiaYT);
		if ( !businessIdSpecification.IsSatisfiedBy(nokiaYT)) {
			System.out.println(businessIdSpecification.ReasonsForDissatisfaction());
		}
		
		System.out.println(vaaraTarkistusNro);
		if ( !businessIdSpecification.IsSatisfiedBy(vaaraTarkistusNro)) {
			System.out.println(" ! " + businessIdSpecification.ReasonsForDissatisfaction());
		}
		
		System.out.println(vaaraSisalto);
		if ( !businessIdSpecification.IsSatisfiedBy(vaaraSisalto)) {
			System.out.println(" ! " + businessIdSpecification.ReasonsForDissatisfaction());
		}

		System.out.println(vaaraPituusLyhyt);		
		if ( !businessIdSpecification.IsSatisfiedBy(vaaraPituusLyhyt)) {
			System.out.println(" ! " + businessIdSpecification.ReasonsForDissatisfaction());
		}

		System.out.println(vaaraPituuspitka);		
		if ( !businessIdSpecification.IsSatisfiedBy(vaaraPituuspitka)) {
			System.out.println(" ! " + businessIdSpecification.ReasonsForDissatisfaction());
		}

		System.out.println(vaaraValimerkki);		
		if ( !businessIdSpecification.IsSatisfiedBy(vaaraValimerkki)) {
			System.out.println(" ! " + businessIdSpecification.ReasonsForDissatisfaction());
		}
		
		System.out.println(cgiYT);
		if ( !businessIdSpecification.IsSatisfiedBy(cgiYT)) {
			System.out.println(" ! " + businessIdSpecification.ReasonsForDissatisfaction());
		}
	}
}
