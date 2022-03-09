package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Assert;
import org.junit.Test;

public class LoginTests extends TestBase {
    //Objects
    LoginPage loginPage;

    //Tests
    @Test
    public void efetuarLoginComSucesso(){

        //Objects instances
        loginPage = new LoginPage();

        //Test
        loginPage.preencherUsuario();
        loginPage.preencherSenha();
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.loginSucessMessage());
    }

}
