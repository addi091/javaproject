package com.capgemini.insurance.service;

import com.capgemini.insurance.bean.BikesInfo;
import com.capgemini.insurance.dao.Dao;

public class Service {
	Dao dao = new Dao();
	String currentYear = "2019";
	
	public void addBike(BikesInfo b){
		dao.addBike(b);
	}
	
	
	public double calculatePremium3rdParty(BikesInfo b){
		double deppercent = 5;
		double deppercent2 = 10;
		double temp = b.getPrice();
		
		int noOfYears = Integer.parseInt(currentYear)-Integer.parseInt(b.getYear());
		if(noOfYears>3){
			double temp2,temp1 = 0;
		for(int i=0;i<3;i++){
			 temp1=((100-deppercent)*temp)/100;
			 
		}
		
		temp2=temp1;
		for(int i=0;i<=noOfYears-3;i++){
			temp2=((100-deppercent2)*temp2)/100;
		}
		return temp2*0.03;
		}
		
		else{
			double temp2 = 0,temp1;
			for(int i=0;i<=noOfYears;i++){
				 temp2=((100-deppercent)*temp)/100;
				 
			}
			return temp2*0.03;
		}
		
		
		
		
	}
	
	
	
	public double calculatePremiumComprehensive(BikesInfo b){
		double deppercent = 5;
		double deppercent2 = 10;
		double temp = b.getPrice();
		
		int noOfYears = Integer.parseInt(currentYear)-Integer.parseInt(b.getYear());
		if(noOfYears>3){
			double temp2 = 0,temp1 = 0;
		for(int i=0;i<3;i++){
			 temp1=((100-deppercent)*temp)/100;
			 
		}
		
		temp2=temp1;
		for(int i=0;i<=noOfYears-3;i++){
			temp2=((100-deppercent2)*temp2)/100;
		}
		return temp2*0.05;
		}
		
		else{
			double temp2 = 0,temp1 = 0;
			for(int i=0;i<=noOfYears;i++){
				 temp2=((100-deppercent)*temp2)/100;
				 
			}
			return temp2*0.05;
		}
		
//		double premium = temp2*0.05;
		
		
		
		//double depriciatedValue = b.getPrice().
		
	}
}
