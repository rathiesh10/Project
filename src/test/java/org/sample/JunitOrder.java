package org.sample;

import java.io.IOException;
import java.util.Date;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.uttilities.BaseClass;
import org.uttilities.FBLoginpojo;

public class JunitOrder extends BaseClass {
         
	@BeforeClass 
	public static void launchBrowser() {
		launchChrome();
		loadUrl("https://www.facebook.com/");
		winmax();
	}
	@AfterClass
	public static void closingBrowser() {
				CloseChrome();

	}
	@Before
	public void startTime() {
		Date d = new Date();
		System.out.println(d);

	}
	@After
	public void endTime() {
	System.out.println(new Date());	

	}
	@Test
	public void tc1() throws IOException {
		FBLoginpojo f = new FBLoginpojo();
		fill(f.getTxtuser(), getData(1, 2));
		fill(f.getTxtpass(), "greens@");
	}
	@Test
	public void tc2() {
		FBLoginpojo f = new FBLoginpojo();
		fill(f.getTxtpass(), "greens@");

	}
	@Test
	public void tc13() {
		FBLoginpojo f = new FBLoginpojo();
        btnClick(f.getTxtbtn());
	}
}
