package com.javaseleniumtemplate.tests;

import com.javaseleniumtemplate.bases.TestBase;
import com.javaseleniumtemplate.flows.LoginFlows;
import com.javaseleniumtemplate.pages.CadastroOcorrenciasPage;
import com.javaseleniumtemplate.pages.LoginPage;
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

        //Parametros
        String resumo = "Teste Lucas Souza - Desafio Base2";
        String descricao = "Essa é uma descrição inicial para verificar se a lógica do teste deu certo.\\n\" +\n" +
                "                \"A princípio a lógica inicial funcionou, porém, pode ser resumida durante\\n\" +\n" +
                "                \"a etapa de login. Será feita a melhoria ao final dos outros testes.";
        String etapas = "1ª Etapa: Criação de teste para login;\\n\" +\n" +
                "                \"2ª Etapa: Criação de teste para cadastro de ocorrência;\\n\" +\n" +
                "                \"3ª Etapa: Em andamento;\\n 4ª Etapa: Não Iniciada;\\n 5ª Etapa: Não Iniciada";

        String mensagemSucessoEsperada = "Operação realizada com sucesso.";
        String categoriaComboBox = "340";
        String frequenciaComboBox = "50";
        String gravidadeComboBox = "40";


        //Teste
        loginFlows.efetuarLogin("lucas.leal", "21DEZ96lsl.");

        cadastroOcorrenciasPage.relatarCasoBtn();
        cadastroOcorrenciasPage.categoriaComboboxSelect(categoriaComboBox);
        cadastroOcorrenciasPage.frequenciaComboboxSelect(frequenciaComboBox);
        cadastroOcorrenciasPage.gravidadeComboboxSelect(gravidadeComboBox);

        cadastroOcorrenciasPage.campoResumo(resumo);
        cadastroOcorrenciasPage.campoDescricao(descricao);
        cadastroOcorrenciasPage.campoEtapas(etapas);

        cadastroOcorrenciasPage.enviarRelatorio();

        assertEquals(cadastroOcorrenciasPage.mensagemSucesso(), mensagemSucessoEsperada);
    }

}
