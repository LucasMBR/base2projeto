package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CadastroOcorrenciasPage;
import com.javaseleniumtemplate.utils.ExtentReportUtils;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CadastroOcorrenciasTest extends TestBase {

    //Utilização do Flows de Login para repetir os passos de entrada no sistema ja pré-existentes em teste anterior.
    CadastroOcorrenciasPage cadastroOcorrenciasPage;
    LoginFlows loginFlows;

    @Test
    public void cadastrarOcorrencia(){

        loginFlows = new LoginFlows();
        cadastroOcorrenciasPage = new CadastroOcorrenciasPage();

        loginFlows.efetuarLogin();

        cadastroOcorrenciasPage.relatarCasoBtn();

        /*Na primeiraz vez que o caso de teste 'CadastroOcorrencias' é executado, é necessário selecionar um
        projeto padrão; O trecho a seguir foi criado para atuomatizar esse momento. Não sei exatamente como
        proceder quando existe uma situação exporadica assim, não pude pesquisar a tempo e aplicar essa solução.
        Sendo assim, considere habilitar o trecho no primeiro uso ou caso estiver usando guia anônima.
        (Necessário habilitar tambem o trecho correspondente no CadastroOcorrenciaPage)*/

        //Trecho para ser habilitado em caso de primeiro teste.

        /*cadastroOcorrenciasPage.escolherProjetoSeletor();
        cadastroOcorrenciasPage.tornarPadrao();
        cadastroOcorrenciasPage.selecionarProjetoBtn();*/

        cadastroOcorrenciasPage.categoriaComboboxSelect();
        cadastroOcorrenciasPage.frequenciaComboboxSelect();
        cadastroOcorrenciasPage.gravidadeComboboxSelect();

        cadastroOcorrenciasPage.campoResumo();
        cadastroOcorrenciasPage.campoDescricao();
        cadastroOcorrenciasPage.campoEtapas();

        cadastroOcorrenciasPage.enviarRelatorio();

        assertEquals(cadastroOcorrenciasPage.mensagemSucesso(), GlobalParameters.MENSAGEM_SUCESSO);

        //Ver explicação no caso de teste 'LoginTests'
        ExtentReportUtils.addTest(getClass().getSimpleName(), "method.getDeclaringClass().getSimpleName()");
        ExtentReportUtils.addTestInfo(2, "Method.class.getMethod().getName()");
    }

}
