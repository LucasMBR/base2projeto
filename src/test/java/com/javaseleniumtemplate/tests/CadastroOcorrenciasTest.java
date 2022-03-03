package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CadastroOcorrenciasPage;
import com.javaseleniumtemplate.pages.LoginPage;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CadastroOcorrenciasTest extends TestBase {

    //Objetos
    LoginPage loginPage;
    CadastroOcorrenciasPage cadOcorrenciaPage;

    @Test
    public void cadastrarOcorrencia(){
        //Instanciando Objetos
        loginPage = new LoginPage();
        cadOcorrenciaPage = new CadastroOcorrenciasPage();

        loginPage = new LoginPage();

        //Parameteres
        String usuario = "lucas.leal";
        String senha = "21DEZ96lsl.";
        String resumo = "Teste Lucas Souza - Desafio Base2";
        String descricao = "Essa é uma descrição inicial para verificar se a lógica do teste deu certo.\\n\" +\n" +
                "                \"A princípio a lógica inicial funcionou, porém, pode ser resumida durante\\n\" +\n" +
                "                \"a etapa de login. Será feita a melhoria ao final dos outros testes.";
        String etapas = "1ª Etapa: Criação de teste para login;\\n\" +\n" +
                "                \"2ª Etapa: Criação de teste para cadastro de ocorrência;\\n\" +\n" +
                "                \"3ª Etapa: Em andamento;\\n 4ª Etapa: Não Iniciada;\\n 5ª Etapa: Não Iniciada";

        String mensagemSucessoEsperada = "Operação realizada com sucesso.";

        //Test
        loginPage.preencherUsuario(usuario);
        loginPage.preencherSenha(senha);
        loginPage.clicarEmLogin();

        cadOcorrenciaPage.relatarCasoBtn();
        cadOcorrenciaPage.categoriaComboboxSelect("65");
        cadOcorrenciaPage.frequenciaComboboxSelect("30");
        cadOcorrenciaPage.gravidadeComboboxSelect("20");

        cadOcorrenciaPage.campoResumo(resumo);
        cadOcorrenciaPage.campoDescricao(descricao);
        cadOcorrenciaPage.campoEtapas(etapas);

        cadOcorrenciaPage.enviarRelatorio();

        assertEquals(cadOcorrenciaPage.mensagemSucesso(), mensagemSucessoEsperada);
    }
}
