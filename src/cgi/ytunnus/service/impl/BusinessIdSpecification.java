package cgi.ytunnus.service.impl;

import cgi.ytunnus.messages.Messages;
import cgi.ytunnus.service.ISpecification;

public class BusinessIdSpecification implements ISpecification {
	final int[] kertoimet = {7, 9, 10, 5, 8, 4, 2};
	final int tarkistusNroIndex  = 8;
	final int jakajaArvo =  11;
	final int jaannosArvo0 = 0;
	final int jaannosArvo1 = 1;
	final int indexAlaraja = 2;
	final int indexYlaraja = 10;
	final String tarkistaYTunnuksenMuotoRegexp = "^\\d{7}-\\d$";
	
	public boolean IsSatisfiedBy( String YTunnus ) {
		int summa = 0;
		int jakojaannos = 0;
		int tarkistusTulos  = 0;
		int tarkistusNumero = 0;

		if ( !(YTunnus.matches(tarkistaYTunnuksenMuotoRegexp))) {
			return false;
		}

		for (int index=0 ; index < kertoimet.length ; index++) {
			summa += (Character.getNumericValue(YTunnus.charAt(index)) * kertoimet[index]);
		}
		
		tarkistusNumero = Character.getNumericValue(YTunnus.charAt(tarkistusNroIndex));
		jakojaannos = summa % jakajaArvo;

		if ( jakojaannos == jaannosArvo1 ) {
			return false;
		}
		
		if ( jakojaannos == jaannosArvo0 ) {
			tarkistusTulos = jaannosArvo0;
		}
		else if (jakojaannos >= indexAlaraja && jakojaannos <= indexYlaraja) {
			tarkistusTulos = jakajaArvo - jakojaannos;
		}
		else {
			tarkistusTulos = jakojaannos;
		}
		if ( tarkistusNumero == tarkistusTulos ) {
			return true;
		}
		return false;
	}
	
	public String ReasonsForDissatisfaction() {
		// Koska tarkistus palauttaa pelkän boolean-arvon?, vain 1 reason ( false ) on kaytossa.
		return (Messages.YTUNNUS_VAARA).toString();
	}
}

