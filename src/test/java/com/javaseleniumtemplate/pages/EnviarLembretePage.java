package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.xpath;

public class EnviarLembretePage extends PageBase {

    By nomeDestinatario = By.xpath("//option[@value='342']");
    By visualizarCasoEnviado = xpath("//div[@align='center']");

    /*Estratégia de encotrar parte do texto para depois clicar não deu certo.

    public String visualizarCasoEnviadoLink(){

        String text = getText(visualizarCasoEnviado).substring(34,56);
        return text;
    }*/

}
