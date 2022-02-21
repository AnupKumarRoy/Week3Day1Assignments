package org.system;

public class Sport {

	public void acheiver(String name,int medalCount) { 
		 System.out.println("Name is "+name+" and "+"Medal count is "+medalCount);	 
	 }
	 public void acheiver(String country,String sportName,int rank) { 
		 System.out.println("Country is "+country+" and"+" Sport Name is "+sportName+" and Rank is "+rank);	 
	 }
	 public void acheiver(float weight,int height,long contactNo) { 
		 System.out.println("Weight is "+weight+" and"+" Height is "+height+" and"+" Contact No is "+contactNo);	 
	 }
     public void acheiver(String tournamentName,long prizeMoney) {
    	 System.out.println("Tournament Name is "+tournamentName+" and"+" Prize Money is "+prizeMoney);
     }
	public static void main(String[] args) {
		Sport sport = new Sport();
		sport.acheiver("ROY", 10);
		sport.acheiver("OLYMICS", 5431345512l);
		sport.acheiver(55.5f, 160,9876543210l);
		sport.acheiver("INDIA", "Football", 1);
 
 
	}

	}


