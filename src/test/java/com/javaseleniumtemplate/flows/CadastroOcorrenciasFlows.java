package com.javaseleniumtemplate.flows;

import com.javaseleniumtemplate.pages.CadastroOcorrenciasPage;

public class CadastroOcorrenciasFlows {

    CadastroOcorrenciasPage cadastroOcorrenciasPage;

    public CadastroOcorrenciasFlows(){
        cadastroOcorrenciasPage = new CadastroOcorrenciasPage();
    }

    //Flows
    public void CadastrarOcorrenciaCompleta(){
        cadastroOcorrenciasPage.relatarCasoBtn();
        cadastroOcorrenciasPage.categoriaComboboxSelect();
        cadastroOcorrenciasPage.frequenciaComboboxSelect();
        cadastroOcorrenciasPage.gravidadeComboboxSelect();
        cadastroOcorrenciasPage.campoResumo();
        cadastroOcorrenciasPage.campoDescricao();
        cadastroOcorrenciasPage.campoEtapas();
        cadastroOcorrenciasPage.enviarRelatorio();
        cadastroOcorrenciasPage.mensagemSucesso();
    }
}
