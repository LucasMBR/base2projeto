package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Test;
import static org.junit.Assert.assertTrue;

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

        assertTrue(loginPage.loginSucessMessage().equals(GlobalParameters.LOGIN_SUCESS));

    }

}
