package dev;

public class CalculatorTVA {
	public double calculerTVA(double montant,String pays,String service) {
		try {
			
		switch(pays){
		
			case "Maroc":
				double aplmaroc=marocTva(service,montant);
				return aplmaroc;
				
			case "France":
				double aplfrc=franceTva(service,montant);
				return aplfrc;
			
			case "Allemagne":
				double aplalmg=allemagneTva(service,montant);
				return aplalmg;
//			
//			case "Belgique":
//				double aplblg=belgiqueTva(service,montant);
//				return aplblg;
//				
//			case "Espagne":
//				double aplesp=espagneTva(service,montant);
//				return aplesp;
				
			default :
				return 0.0;
		}
		
		}catch (IllegalArgumentException e) {
			System.out.println("Pays non pris en charge");
		}
		return 0.0;
	}
	
	public double marocTva(String service,double montant) {
		switch(service) {
			case "repas" :
				double tva1=montant*0.1;
				return tva1;
				
			case "electronique" :
				double tva2=montant*0.2;
				return tva2;
				
			default :
				return  0.0;
		}
	}
	
	public double franceTva(String service,double montant) {
		switch(service) {
			case "repas" :
				double tva1=montant*0.055;
				return tva1;
				
			case "electronique" :
				double tva2=montant*0.2;
				return tva2;
				
			default :
				return  0.0;
		}
	}
	
	public double allemagneTva(String service,double montant) {
		switch(service) {
			case "repas" :
				double tva1=montant*0.07;
				return tva1;
				
			case "electronique" :
				double tva2=montant*0.19;
				return tva2;
				
			default :
				return  0.0;
		}
	}
	

}
