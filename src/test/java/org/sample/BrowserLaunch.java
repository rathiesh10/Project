package org.sample;

import java.io.IOException;

import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.uttilities.BaseClass;
import org.uttilities.FBLoginpojo;



public class BrowserLaunch extends BaseClass {
    public static void main(String[] args) throws IOException {
	launchChrome();
    loadUrl("https://www.facebook.com/");
    winmax();
    printTitle();
    printCurrentUrl();
  
    
    FBLoginpojo f = new FBLoginpojo();
    
    
    fill(f.getTxtuser(), getData(3, 0));
    	
    fill(f.getTxtpass(),getData(4, 2) );	
    RightClick(f.getTxtpass());
    	
    	
    	
    	
  	
	}
}
