package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.VerificarVersaoPage;
import com.javaseleniumtemplate.utils.ExtentReportUtils;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VerificarVersaoTest extends TestBase {

    //Flows foram utilizados devido à repetição de trechos parecidos nos casos de teste.
    VerificarVersaoPage verificarVersaoPage;
    LoginFlows loginFlows;

    @Test
    public void verificaVersao(){

        verificarVersaoPage = new VerificarVersaoPage();
        loginFlows = new LoginFlows();

        loginFlows.efetuarLogin();

        verificarVersaoPage.gerenciarMenu();

        //Mais asserções foram aplicadas para garantir que as versões e os dados da tela estão como esperado.
        //Assert True foi usado mesmo podendo ser substituido por assertEquals, apenas para fins de aprendizado.
        assertTrue(verificarVersaoPage.informacoesSiteCamposDisplayed().equals(GlobalParameters.CAMPOS_VERSOES));

        assertEquals(verificarVersaoPage.versaoMantisCheck(), GlobalParameters.VERSAO_MANTIS_ATUAL);
        assertEquals(verificarVersaoPage.versaoSchemaCheck(), GlobalParameters.VERSAO_SCHEMA_ATUAL);

        //Ver explicação no caso de teste 'LoginTests'
        ExtentReportUtils.addTest(getClass().getSimpleName(), "method.getDeclaringClass().getSimpleName()");
        ExtentReportUtils.addTestInfo(2, "Method.class.getMethod().getName()");
    };
}