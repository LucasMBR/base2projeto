package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {

    By usernameField = By.xpath("//*[@name='username']");
    By passwordField = By.xpath("//*[@name='password']");
    By loginButton = By.xpath("//*[@class='button']");
    By loginSucess = By.xpath("//td[@class='login-info-left']");

    public void preencherUsuario(){
        sendKeys(usernameField, GlobalParameters.USUARIO_GERAL );
    }

    public void preencherSenha(){
        sendKeys(passwordField, GlobalParameters.SENHA_GERAL);
    }

    public void clicarEmLogin(){
        click(loginButton);
    }
    public String loginSucessMessage(){
        return getText(loginSucess);
    }

}
