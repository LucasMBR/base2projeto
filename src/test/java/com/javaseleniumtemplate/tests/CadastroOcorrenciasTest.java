package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CadastroOcorrenciasPage;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Test;

import javax.xml.bind.annotation.XmlElementDecl;

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
