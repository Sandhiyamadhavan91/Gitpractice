package com.testng;

import org.testng.annotations.Test;

public class Groups {
	
	@Test (groups= {"pvr"})
	public void skywalk() {
		System.out.println("PVR Skywalk");
	}
	
	@Test(groups= {"pvr"})
	public void wind() {
		System.out.println("PVR Wind");
	}
	
	@Test(groups= {"SPI"})
	public void sathyam() {
		System.out.println("SPI Sathyam");
	}
	
	@Test(groups= {"SPI"})
	public void Flow() {
		System.out.println("SPI Flow");
	}
	
	@Test(groups= {"SPI , PVR"})
	public void forum() {
		System.out.println("Both SPI and PVR");
	}
}
