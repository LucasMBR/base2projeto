package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class EnviarLembretePage extends PageBase {

    By visualizarCasoEnviado = xpath("//a[contains(text(),'Visualizar Caso Enviado')]");//Contém texto parcial do link.
    By enviarLembrete = xpath("//a[.='Enviar um lembrete']");//Contém o texto exato do link.
    By destinatarioLembrete = xpath ("//*[@multiple='multiple']//*[.='"+GlobalParameters.USUARIO_GERAL+"']");
    By campoLembrete = xpath("//textarea[@name='body']");
    By enviarLembreteButton = By.xpath("//*[@class='button']");

    By mensagemSucessoEsperada = xpath("//div[@align='center']");

    public void visualizarCasoEnviadoLink(){
        click(visualizarCasoEnviado);
    }

    public void enviarLembreteLink(){
        click(enviarLembrete);
    }

    public void selecionarDestinatarioLembrete(){
        click(destinatarioLembrete);
    }

    public void descricaoLembrete(String lembrete){
        sendKeys(campoLembrete, lembrete);
    }
    public void enviarLembreteBtn(){
        click(enviarLembreteButton);
    }

    public String mensagemSucesso(){
        return getText(mensagemSucessoEsperada).substring(0,31);
    }

}
