package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

public class LoginPage extends PageBase {

    //Mapping
    By usernameField = By.xpath("//*[@name='username']");
    By passwordField = By.xpath("//*[@name='password']");
    By loginButton = By.xpath("//*[@class='button']");
    By loginSucess = By.xpath("//td[@class='login-info-left']");

    //Actions

    public void preencherUsuario(){
        sendKeys(usernameField, GlobalParameters.USUARIO_GERAL );
    }

    public void preencherSenha(){
        sendKeys(passwordField, GlobalParameters.SENHA_GERAL);
    }

    public void clicarEmLogin(){
        click(loginButton);
    }
    public boolean loginSucessMessage(){
        isDisplayed(loginSucess);
        return true;
    }

    private void isDisplayed(By loginSucess) {
    }

}
