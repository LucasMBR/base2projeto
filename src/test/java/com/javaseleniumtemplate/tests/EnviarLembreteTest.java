package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.CadastroOcorrenciasFlows;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.EnviarLembretePage;
import com.javaseleniumtemplate.utils.ExtentReportUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EnviarLembreteTest extends TestBase {

    CadastroOcorrenciasFlows cadastroOcorrenciasFlows;
    LoginFlows loginFlows;
    EnviarLembretePage enviarLembretePage;

    @Test
    public void enviarLembrete(){
        loginFlows = new LoginFlows();
        cadastroOcorrenciasFlows = new CadastroOcorrenciasFlows();
        enviarLembretePage = new EnviarLembretePage();

        loginFlows.efetuarLogin();
        cadastroOcorrenciasFlows.CadastrarOcorrenciaCompleta();

        enviarLembretePage.visualizarCasoEnviadoLink();

        enviarLembretePage.enviarLembreteLink();

        enviarLembretePage.selecionarDestinatarioLembrete();
        enviarLembretePage.descricaoLembrete(GlobalParameters.LEMBRETE_GERAL);
        enviarLembretePage.enviarLembreteBtn();

        assertEquals(enviarLembretePage.mensagemSucesso(), GlobalParameters.MENSAGEM_SUCESSO);

        ExtentReportUtils.addTest(getClass().getSimpleName(), "method.getDeclaringClass().getSimpleName()");
        ExtentReportUtils.addTestInfo(2, "Method.class.getMethod().getName()");
    }
}

