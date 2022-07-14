package com.yagna.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.yagna.qa.base.TestBase;

public class DashboardPage extends TestBase{

	
	@FindBy (id="patnerSiteHeaderId")
	WebElement siteheader;
	
	@FindBy (xpath="//*[@class='fa analyticsSmartLeadTileIconCls-new']")
	WebElement renewal;
	
	@FindBy (xpath="//*[@class='fa journey-builderIconCls-new']")
	WebElement journey;
	
	@FindBy (xpath="//*[@class='fa analyticsAllProjectTileIconCls-new']")
	WebElement projects;
	
	public DashboardPage() throws IOException {
		PageFactory.initElements(driver, this);
	}
	
	public String validateDashboardPageTitle() {
		return driver.getTitle();	
	}
	
	public LeadListingPage renewalsPage() throws IOException {
		renewal.click();
		
		return new LeadListingPage();
	}
	
	public ProjectListing projectsPage() throws IOException {
		projects.click();
		
		return new ProjectListing();
	}
	
	


	

}
