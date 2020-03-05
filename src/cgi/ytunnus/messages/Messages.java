package cgi.ytunnus.messages;

public enum Messages {
	YTUNNUS_ALOITUS ("-- YTunnus tarkistus --"),
	YTUNNUS_OK ("YTunnus oikein"),
	YTUNNUS_TARKISTUSMERKKI_VAARA ("YTunnus tarkistusmerkki v‰‰r‰"),
	YTUNNUS_MUOTO_VAARA ("YTunnus muoto ( 1234567-8 ) v‰‰rin"),
	YTUNNUS_VAARA ("YTunnus ei ole oikein");
	
	private String msg;
	
	Messages( String msg ) {
		this.msg = msg;
	}
	
	public String getMessage() { return msg; } 
	
    @Override
    public String toString(){
        return msg;
    }

}
