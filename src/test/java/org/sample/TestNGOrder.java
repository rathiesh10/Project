package org.sample;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.uttilities.BaseClass;
import org.uttilities.FBLoginpojo;

public class TestNGOrder extends BaseClass{

	@BeforeClass
	private void LaunchingChrome() {
	 launchChrome();
	 winmax();
     loadUrl("https://www.facebook.com/");
     printTitle();
	}
	
	@AfterClass
	 private void ClosingChrome() {
		CloseChrome();

	}
	@BeforeMethod
	private void StartTime() {
	System.out.println(new Date());
	loadUrl("https://www.facebook.com/");
	}
	
	
	 
	@AfterMethod
	private void EndTime() {
		System.out.println(new Date());

	}
//	
//	@Test(priority=12,enabled= false)
//	private void tc1() throws InterruptedException {
//	 FBLoginpojo f = new FBLoginpojo();
//	 fill(f.getTxtuser(),"greens" );	 
//     fill(f.getTxtpass(), "greens@123");
//     btnClick(f.getTxtbtn());
//     Thread.sleep(2000);
//	}
//	@Test(priority=-45, enabled= false)
//	private void tc2() throws InterruptedException {
//		 FBLoginpojo f = new FBLoginpojo();
//		 fill(f.getTxtuser(),"gre" );	 
//	     fill(f.getTxtpass(), "greens@1234");
//	     btnClick(f.getTxtbtn());
//	     Thread.sleep(2000);
//	}
	
	
	@Test(dataProvider="fblogin")
	private void tc3(String s1, String s2) throws InterruptedException {
		 FBLoginpojo f = new FBLoginpojo();
		 fill(f.getTxtuser(), s1);	 
	     fill(f.getTxtpass(), s2);
	     btnClick(f.getTxtbtn());
	     Thread.sleep(2000);
	}
	
	@DataProvider(name="fblogin")
	public Object[][] gettingdata() {
	   
		return new Object [] [] {
			{"sql","sql@123"},
			{"java","java@123"},
			{"phyton","phyton@123"},
			{"selenium","selenium@123"}
			
			
			
		};
	}
	
	
	
	
	
	
}
