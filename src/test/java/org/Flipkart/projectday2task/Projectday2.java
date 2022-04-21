package org.Flipkart.projectday2task;

import org.openqa.selenium.WebElement;

import baseClass.ProjectBaseClass;

public class Projectday2 extends ProjectBaseClass{
	public static void main(String[] args) {
		browserLaunch("chrome");
		urlLaunch("https://www.flipkart.com/mobile-phones-store?fm=neo%2Fmerchandising&iid=M_c2369f64-1766-4660-a44a-74ac28744a83_2_372UD5BXDFYS_MC.ZRQ4DKH28K8J&otracker=hp_rich_navigation_3_2.navigationCard.RICH_NAVIGATION_Mobiles_ZRQ4DKH28K8J&otracker1=hp_rich_navigation_PINNED_neo%2Fmerchandising_NA_NAV_EXPANDABLE_navigationCard_cc_3_L0_view-all&cid=ZRQ4DKH28K8J");
		implicitewait(10);
		driver.manage().window().maximize();
		
		
		
		
	}
	
}
