package com.panally.core;

import com.panally.modules.tours.ToursInterface;

/**
 * @author nirlendu.saha
 */
public class CoreInterface{

	private ToursInterface tourInterface = new ToursInterface();

	public String getListings(String userID){
		return this.tourInterface.getListings(userID);
	}
}