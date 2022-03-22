package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CadastroOcorrenciasPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CadastroOcorrenciasTest extends TestBase {

    //Objetos
    CadastroOcorrenciasPage cadastroOcorrenciasPage;
    LoginFlows loginFlows;

    @Test
    public void cadastrarOcorrencia(){
        //Instanciando Objetos
        loginFlows = new LoginFlows();
        cadastroOcorrenciasPage = new CadastroOcorrenciasPage();

        //Teste
        loginFlows.efetuarLogin();

        cadastroOcorrenciasPage.relatarCasoBtn();

        //ver uma forma de criar uma condição para execução do trecho por meio do 'utils'

        //Pagina que aparece na primeira vez em que se relata um caso, pedindo para escolher um projeto padrão;
        //Após a primeira vez o trecho pode ser inabilitado caso o mesmo teste seja realizado varias vezes;
        /*cadastroOcorrenciasPage.escolherProjetoSeletor();
        cadastroOcorrenciasPage.tornarPadrao();
        cadastroOcorrenciasPage.selecionarProjetoBtn();*/
        //Trecho deve estar habilitado apenas na primeira vez em que o caso for executado em um ambiente;
        //Ou caso o cache/dados da página, sejam limpos

        cadastroOcorrenciasPage.categoriaComboboxSelect();
        cadastroOcorrenciasPage.frequenciaComboboxSelect();
        cadastroOcorrenciasPage.gravidadeComboboxSelect();

        cadastroOcorrenciasPage.campoResumo();
        cadastroOcorrenciasPage.campoDescricao();
        cadastroOcorrenciasPage.campoEtapas();

        cadastroOcorrenciasPage.enviarRelatorio();

        assertEquals(cadastroOcorrenciasPage.mensagemSucesso(), GlobalParameters.MENSAGEM_SUCESSO);
    }

}
