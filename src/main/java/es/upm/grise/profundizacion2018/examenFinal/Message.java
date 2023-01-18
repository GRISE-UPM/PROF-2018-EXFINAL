package es.upm.grise.profundizacion2018.examenFinal;

public class Message {

	public Language getDefaultLanguage() {
		return Language.ENGLISH;
	}

	//public static String getMessage( TimeOfTheDay moment, Language language ) {
	public String getMessage( TimeOfTheDay moment, Language language ) {		
		String message = "";
		switch ( moment ) {
			case MORNING :		message = getMorningMessage( language );
								break;
			case AFTERNOON :	message = getAfternoonMessage( language );
								break;
			case EVENING :		message = getEveningMessage( language );
								break;
		}

		return message;
	}

	//private static String getMorningMessage( Language language ) {
	private String getMorningMessage( Language language ) {
		String message = "";
		switch ( language ) {
			case ENGLISH :	message = "Good morning";
							break;
			case SPANISH :	message = "Buenos días";
							break;
		}
	
		return message;
	}

	//private static String getAfternoonMessage( Language language ) {
	private String getAfternoonMessage( Language language ) {
		String message = "";
		switch ( language ) {
			case ENGLISH :	message = "Good afternoon";
							break;
			case SPANISH :	message = "Buenas tardes";
							break;
		}
	
		return message;
	}
	
	//private static String getEveningMessage( Language language ) {
	private String getEveningMessage( Language language ) {
		String message = "";
		switch ( language ) {
			case ENGLISH :	message = "Good evening";
							break;
			case SPANISH :	message = "Buenas noches";
							break;
		}
	
		return message;
	}

}
