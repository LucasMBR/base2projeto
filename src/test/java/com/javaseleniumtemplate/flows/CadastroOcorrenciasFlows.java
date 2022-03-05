package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.CadastroOcorrenciasPage;

public class CadastroOcorrenciasFlows {

    CadastroOcorrenciasPage cadastroOcorrenciasPage;

    public CadastroOcorrenciasFlows(){
        cadastroOcorrenciasPage = new CadastroOcorrenciasPage();
    }

    //Flows
    public void CadastrarOcorrenciaCompleta(String categoriaComboBox,String frequenciaCombobox,
                                    String gravidadeComboBox,String resumo, String descricao,
                                    String etapas){
        cadastroOcorrenciasPage.relatarCasoBtn();
        cadastroOcorrenciasPage.categoriaComboboxSelect(categoriaComboBox);
        cadastroOcorrenciasPage.frequenciaComboboxSelect(frequenciaCombobox);
        cadastroOcorrenciasPage.gravidadeComboboxSelect(gravidadeComboBox);
        cadastroOcorrenciasPage.campoResumo(resumo);
        cadastroOcorrenciasPage.campoDescricao(descricao);
        cadastroOcorrenciasPage.campoEtapas(etapas);
        cadastroOcorrenciasPage.enviarRelatorio();
        cadastroOcorrenciasPage.mensagemSucesso();
    }
    //Sobrecarga
    public void CadastrarOcorrenciaSimples(String categoriaComboBox,String resumo, String descricao){
        cadastroOcorrenciasPage.relatarCasoBtn();
        cadastroOcorrenciasPage.categoriaComboboxSelect(categoriaComboBox);
        cadastroOcorrenciasPage.campoResumo(resumo);
        cadastroOcorrenciasPage.campoDescricao(descricao);
        cadastroOcorrenciasPage.enviarRelatorio();
        cadastroOcorrenciasPage.mensagemSucesso();
    }
}
