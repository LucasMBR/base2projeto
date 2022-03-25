package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.VerificarVersaoPage;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class VerificarVersaoTest extends TestBase {
    VerificarVersaoPage verificarVersaoPage;
    LoginFlows loginFlows;

    @Test
    public void verificaVersao(){

    verificarVersaoPage = new VerificarVersaoPage();
    loginFlows = new LoginFlows();

    loginFlows.efetuarLogin();

    verificarVersaoPage.gerenciarMenu();

    assertTrue(verificarVersaoPage.informacoesSiteCamposDisplayed().equals(GlobalParameters.CAMPOS_VERSOES));

    assertEquals(verificarVersaoPage.versaoMantisCheck(), GlobalParameters.VERSAO_MANTIS_ATUAL);
    assertEquals(verificarVersaoPage.versaoSchemaCheck(), GlobalParameters.VERSAO_SCHEMA_ATUAL);

    };
}