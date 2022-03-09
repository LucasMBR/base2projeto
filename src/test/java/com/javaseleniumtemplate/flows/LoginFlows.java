package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.pages.LoginPage;

public class LoginFlows {
    //Objetos e contrutor
    LoginPage loginPage;

    public LoginFlows(){
        //Page and Steps Objects
        loginPage = new LoginPage();
    }

    //Flows
    public void efetuarLogin(){
        loginPage.preencherUsuario();
        loginPage.preencherSenha();
        loginPage.clicarEmLogin();
        loginPage.loginSucessMessage();
    }


}
