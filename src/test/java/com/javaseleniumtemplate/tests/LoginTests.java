package com.javaseleniumtemplate.tests;

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

        //Parameteres
        String usuario = "lucas.leal";
        String senha = "21DEZ96lsl.";

        //Test
        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        Assert.assertTrue(loginPage.loginSucessMessage());
    }

}
