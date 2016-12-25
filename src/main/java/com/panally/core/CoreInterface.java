package com.panally.core;

import com.panally.modules.tours.ToursInterface;

/**
 * @author nirlendu.saha
 */
public class CoreInterface{

	private tourInterface = new ToursInterface();

	public static String getListings(String userID){
		return this.tourInterface.getListings(userID);
	}
}