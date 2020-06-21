package com.soap.xml;

import net.wbgeoip.GeoIPService;
import net.wbgeoip.GeoIPServiceSoap;

public class IPLocationFinderc {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Você precisa passar o endereço IP.");
		} else {
			String ipAdress = args[0];
			GeoIPService ipService = new GeoIPService();
			GeoIPServiceSoap geoIPServiceSoap = ipService.getGeoIPServiceSoap();
			String r = geoIPServiceSoap.getIpLocation(ipAdress);
			System.out.println(r);
		}		
	}
}
