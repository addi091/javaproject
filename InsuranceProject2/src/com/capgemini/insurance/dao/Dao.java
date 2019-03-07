package com.capgemini.insurance.dao;

import java.util.ArrayList;
import java.util.List;

import com.capgemini.insurance.bean.BikesInfo;

public class Dao {
	
	List<BikesInfo> bikes = new ArrayList<BikesInfo>();
	
	public void addBike(BikesInfo b){
		
	 bikes.add(b);
	 for (BikesInfo bikesInfo : bikes) {
		System.out.println(bikesInfo.toString());
	}
		
		
	}

}
