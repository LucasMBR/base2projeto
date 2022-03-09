package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.PageBase;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.CadastroOcorrenciasFlows;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.EnviarLembretePage;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertEquals;

public class EnviarLembreteTest extends TestBase {

    CadastroOcorrenciasFlows cadastroOcorrenciasFlows;
    LoginFlows loginFlows;
    EnviarLembretePage enviarLembretePage;
    //PageBase pageBase;

    @Test
    public void enviarLembrete(){
        loginFlows = new LoginFlows();
        cadastroOcorrenciasFlows = new CadastroOcorrenciasFlows();
        enviarLembretePage = new EnviarLembretePage();

        //REDUZIR USANDO GLOBAL PARAMETROS


        loginFlows.efetuarLogin();
        cadastroOcorrenciasFlows.CadastrarOcorrenciaCompleta();

        enviarLembretePage.visualizarCasoEnviadoLink();

        enviarLembretePage.enviarLembreteLink();

        enviarLembretePage.selecionarDestinatarioLembrete();
        enviarLembretePage.descricaoLembrete(GlobalParameters.LEMBRETE_GERAL);
        enviarLembretePage.enviarLembreteBtn();

        assertEquals(enviarLembretePage.mensagemSucesso(), GlobalParameters.MENSAGEM_SUCESSO);

    }
}
/*Trecho usado para pegar uma parte de html que é exibida rapidamente.*/
//pageBase = new PageBase();
