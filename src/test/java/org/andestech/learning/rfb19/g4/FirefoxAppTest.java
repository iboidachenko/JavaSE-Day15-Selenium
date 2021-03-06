package org.andestech.learning.rfb19.g4;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class FirefoxAppTest
{

    private WebDriver webDriver;
    private FirefoxOptions firefoxOptions;


    @BeforeClass
    public void init()
    {
        System.setProperty("webdriver.gecko.driver",
                "E:\\selenium_drivers\\geckodriver.exe");


        firefoxOptions = new FirefoxOptions();
       // firefoxOptions.addArguments("--start-fullscreen");
       // firefoxOptions.addArguments("--start-fullscreen");



        FirefoxProfile prof = new FirefoxProfile();


        DesiredCapabilities caps = new DesiredCapabilities();
        //caps.setCapability(FirefoxDriver.);


        webDriver = new FirefoxDriver(firefoxOptions);
        webDriver.manage().window().maximize();


        System.out.println("+++ Driver: " + webDriver);
    }


    @Test
    public void site01Test() throws InterruptedException
    {
        Utils.searchTest(webDriver);

    }


    @AfterClass
    public void tearDown(){
        if(webDriver != null)
        {   webDriver.quit();
            //webDriver.close();
            System.out.println("--- Driver");
        }

    }

}
