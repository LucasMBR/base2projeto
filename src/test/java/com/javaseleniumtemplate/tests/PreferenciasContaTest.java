package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.PreferenciasContaPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PreferenciasContaTest extends TestBase {

    PreferenciasContaPage preferenciasContaPage;
    LoginFlows loginFlows;

    @Test
    public void alterandoPreferencias(){
        loginFlows = new LoginFlows();
        preferenciasContaPage = new PreferenciasContaPage();

        loginFlows.efetuarLogin();

        preferenciasContaPage.minhaContaBtn();
        preferenciasContaPage.preferenciaContaBtn();

        preferenciasContaPage.projetoComboboxSelect();
        preferenciasContaPage.quantTempoRenov();
        preferenciasContaPage.quantTempoRedire();

        preferenciasContaPage.clicarRadioDesc();

        preferenciasContaPage.checkBoxNovosCasos();
        preferenciasContaPage.comboBoxNovosCasos();

        preferenciasContaPage.checkBoxMudancaAtri();
        preferenciasContaPage.comboboxMudancaAtri();

        preferenciasContaPage.checkBoxRetornos();
        preferenciasContaPage.comboboxRetornos();

        preferenciasContaPage.checkBoxCasosReso();
        preferenciasContaPage.comboboxCasosReso();

        preferenciasContaPage.checkBoxCasosFech();
        preferenciasContaPage.comboboxCasosFech();

        preferenciasContaPage.checkBoxCasosReab();
        preferenciasContaPage.comboboxCasosReab();

        preferenciasContaPage.checkBoxAnotacoes();
        preferenciasContaPage.comboboxAnotacoes();

        preferenciasContaPage.checkBoxMudStatus();
        preferenciasContaPage.comboboxMudStatus();

        preferenciasContaPage.checkBoxMudPriori();
        preferenciasContaPage.comboboxMudPriori();

        preferenciasContaPage.limiteAnotEmail();
        preferenciasContaPage.fusoHoraSelecao();
        preferenciasContaPage.idiomaSelecao();

        preferenciasContaPage.atualizarPreferencias();

        assertEquals(preferenciasContaPage.confirmacaoSucesso(), GlobalParameters.MENSAGEM_SUCESSO);

    }

}
