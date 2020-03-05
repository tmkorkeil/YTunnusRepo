package cgi.ytunnus.tests;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.Test;

import cgi.ytunnus.service.impl.BusinessIdSpecification;

class YTunnusTestiCaset {
	public static final String nokiaYT = "0112038-9";
	public static final String cgiYT = "0357502-9";
	public static final String vaaraTarkistusNro = "0112038-8";
	public static final String vaaraSisalto = "01A2038-9";			
	public static final String vaaraPituusLyhyt = "035750-9";
	public static final String vaaraPituusPitka = "03575023-9";
	public static final String vaaraValimerkki = "03575023_9";
	
	BusinessIdSpecification businessIdSpecification = new BusinessIdSpecification();
	
	@Test
	void ytunnusOikein() {
		assertTrue("Y-tunnus 0112038-9, tarkistus ei toiminut oikein",
				(businessIdSpecification.IsSatisfiedBy(nokiaYT)));
	}

	@Test
	void ytunnusVaaraArvo() {
		assertFalse("Y-tunnus 0112038-8, tarkistusNumeron väärä arvo tunnistamatta",
				(businessIdSpecification.IsSatisfiedBy(vaaraTarkistusNro)));
	}
	
	@Test
	void ytunnusVaaraSisalto() {
		assertFalse("Y-tunnus 01A2038-9, Y-tunnuksen väärä sisältö tunnistamatta",
				(businessIdSpecification.IsSatisfiedBy(vaaraSisalto)));
	}
	
	@Test
	void ytunnusVaaraPituusLyhyt() {
		assertFalse("Y-tunnus 035750-9, Y-tunnuksen väärä sisältö tunnistamatta",
				(businessIdSpecification.IsSatisfiedBy(vaaraPituusLyhyt)));
	}
	
	@Test
	void ytunnusVaaraPituusPitka() {
		assertFalse("Y-tunnus 03575023-9, Y-tunnuksen väärä sisältö tunnistamatta",
				(businessIdSpecification.IsSatisfiedBy(vaaraPituusPitka)));
	}

	@Test
	void ytunnusVaaraValimerkki() {
		assertFalse("Y-tunnus 03575023_9, Y-tunnuksen väärä sisältö tunnistamatta",
				(businessIdSpecification.IsSatisfiedBy(vaaraValimerkki)));
	}
}
