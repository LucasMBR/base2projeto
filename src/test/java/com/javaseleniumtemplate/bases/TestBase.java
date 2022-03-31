package com.javaseleniumtemplate.bases;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.utils.DriverUtils;
import com.javaseleniumtemplate.utils.ExtentReportUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;

public class TestBase {
    @BeforeClass
    public static void beforeSuite() {
        new GlobalParameters();
        ExtentReportUtils.createReport();
    }

    @Before
    public void beforeTest(){
        DriverUtils.createInstance();
        DriverUtils.INSTANCE.manage().window().maximize();
        DriverUtils.INSTANCE.navigate().to(GlobalParameters.URL_DEFAULT);
    }

    @After
    public void afterTest(){
        DriverUtils.quitInstace();
    }

    @AfterMethod
    public void afterMethod(ITestResult result){
        ExtentReportUtils.addTestResult(result);
    }

    @AfterClass
    public static void afterSuite(){
        ExtentReportUtils.generateReport();
    }
}