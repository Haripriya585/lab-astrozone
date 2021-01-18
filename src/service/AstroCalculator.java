package service;



import model.User;

// Type your code
public class AstroCalculator{
//	User us=new user();
	public String findSign(User us) {
		String[] details=us.getDob().split("-",3);
		int day=Integer.parseInt(details[0]);
		int month=Integer.parseInt(details[1]);
		if (month == 12){ 
	          
	        if (day < 22) 
	        	return "Sagittarius"; 
	        else
	        	return "Capricorn"; 
	    } 
	          
	    else if (month == 1){ 
	        if (day < 20) 
	        	return "Capricorn"; 
	        else
	        	return "Aquarius"; 
	    } 
	          
	    else if (month == 2){ 
	        if (day < 19) 
	        	return "Aquarius"; 
	        else
	        	return "Pisces"; 
	    } 
	          
	    else if(month == 3){ 
	        if (day < 21)  
	        	return "Pisces"; 
	        else
	        	return "Aries"; 
	    } 
	    else if (month == 4){ 
	        if (day < 20) 
	        	return "Aries"; 
	        else
	        	return "Taurus"; 
	    } 
	          
	    else if (month ==5){ 
	        if (day < 21) 
	        	return "Taurus"; 
	        else
	        	return "gemini"; 
	    } 
	          
	    else if( month == 6){ 
	        if (day < 21) 
	        	return "Gemini"; 
	        else
	        	return "Cancer"; 
	    } 
	          
	    else if (month == 7){ 
	        if (day < 23) 
	        	return  "Cancer"; 
	        else
	        	return  "Leo"; 
	    } 
	          
	    else if( month == 8){ 
	        if (day < 23)  
	        	return  "Leo"; 
	        else
	        	return  "Virgo"; 
	    } 
	          
	    else if (month == 9){ 
	        if (day < 23) 
	        	return "Virgo"; 
	        else
	        	return "Libra"; 
	    } 
	          
	    else if (month == 10){ 
	        if (day < 23) 
	        	return  "Libra"; 
	        else
	        	return  "Scorpio"; 
	    } 
	          
	    else { 
	        if (day < 22) 
	        	return  "Scorpio"; 
	        else
	         return  "Sagittarius"; 
	    } 
	
}
}