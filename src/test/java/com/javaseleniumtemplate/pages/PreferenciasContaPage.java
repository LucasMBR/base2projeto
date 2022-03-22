package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.GlobalParameters;
import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class PreferenciasContaPage extends PageBase {

    By minhaConta = linkText("Minha Conta");
    By preferenciasConta = linkText("Preferências");
    By redefinirPreferencia = xpath("//*[@value='Redefinir Preferências']");

    By projetoCombobox = name("default_project");
    By tempoRenovacaoMinutos = xpath("//*[@name='refresh_delay']");
    By tempoRedirecionamentoSegundos = xpath("//*[@name='redirect_delay']");
    By radioButtonAsc = xpath("//*[@value='ASC']");
    By radioButtonDesc = xpath("//*[@value='DESC']");

    By checkBoxNovosCasos = xpath("//*[@name='email_on_new']");
    By comboboxNovosCasos = xpath("//*[@name='email_on_new_min_severity']");

    By checkBoxMudancaAtri = xpath("//*[@name='email_on_assigned']");
    By comboboxMudancaAtri = xpath("//*[@name='email_on_assigned_min_severity']");

    By checkBoxRetornos = xpath("//*[@name='email_on_feedback']");
    By comboboxRetornos = xpath("//*[@name='email_on_feedback_min_severity']");

    By checkBoxCasosReso = xpath("//*[@name='email_on_resolved']");
    By comboboxCasosReso = xpath("//*[@name='email_on_resolved_min_severity']");

    By checkBoxCasosFech = xpath("//*[@name='email_on_closed']");
    By comboboxCasosFech = xpath("//*[@name='email_on_closed_min_severity']");

    By checkBoxCasosReab = xpath("//*[@name='email_on_reopened']");
    By comboboxCasosReab = xpath("//*[@name='email_on_reopened_min_severity']");

    By checkBoxAnotacoes = xpath("//*[@name='email_on_bugnote']");
    By comboboxAnotacoes = xpath("//*[@name='email_on_bugnote_min_severity']");

    By checkBoxMudStatus = xpath("//*[@name='email_on_status']");
    By comboboxMudStatus = xpath("//*[@name='email_on_status_min_severity']");

    By checkBoxMudPriori = xpath("//*[@name='email_on_priority']");
    By comboboxMudPriori = xpath("//*[@name='email_on_priority_min_severity']");

    By limiteAnotacoesEmail = xpath("//*[@name='email_bugnote_limit']");
    By fusoHorarioSelecao = xpath("//*[@name='timezone']"); ////*[@label='America']/option[@value='America/Sao_Paulo']
    By idiomaSelecao = xpath("//*[@name='language']");////*[@value='portuguese_brazil']

    By atualizaPreferenciasBtn = xpath("//*[@value='Atualizar Preferências']");

    By alteracoesRealizadasSucesso = xpath("//div[@align='center']");

    public void minhaContaBtn(){
        click(minhaConta);
    }

    public void preferenciaContaBtn(){
        click(preferenciasConta);
    }

    public void redefinirPreferenciasBtn(){
        click(redefinirPreferencia);
    }

    public void projetoComboboxSelect(){
        comboBoxSelectByValue(projetoCombobox, GlobalParameters.PROJETO_PADRAO);
    }
    public void quantTempoRenov(){
        clear(tempoRenovacaoMinutos);
        sendKeys(tempoRenovacaoMinutos, GlobalParameters.TEMPO_RENOVACAO_PADRAO);
    }
    public void quantTempoRedire(){
        clear(tempoRedirecionamentoSegundos);
        sendKeys(tempoRedirecionamentoSegundos, GlobalParameters.TEMPO_REDIRECIONAMENTO_PADRAO);
    }
    public void clicarRadioBtnAsc(){
        click(radioButtonAsc);
    }
    public void clicarRadioDesc(){
        click(radioButtonDesc);
    }
    public void checkBoxNovosCasos(){
        click(checkBoxNovosCasos);
    }
    public void checkBoxMudancaAtri(){
        click(checkBoxMudancaAtri);
    }
    public void checkBoxRetornos(){
        click(checkBoxRetornos);
    }
    public void checkBoxCasosReso(){
        click(checkBoxCasosReso);
    }
    public void checkBoxCasosFech(){
        click(checkBoxCasosFech);
    }
    public void checkBoxCasosReab(){
        click(checkBoxCasosReab);
    }
    public void checkBoxAnotacoes(){
        click(checkBoxAnotacoes);
    }
    public void checkBoxMudStatus(){
        click(checkBoxMudStatus);
    }
    public void checkBoxMudPriori(){
        click(checkBoxMudPriori);
    }
    public void comboBoxNovosCasos(){
        comboBoxSelectByValue(comboboxNovosCasos,GlobalParameters.NOVOS_CASOS);
    }
    public void comboboxMudancaAtri(){
        comboBoxSelectByValue(comboboxMudancaAtri,GlobalParameters.MUDANCAS_ATRI);
    }
    public void comboboxRetornos(){
        comboBoxSelectByValue(comboboxRetornos,GlobalParameters.RETORNOS);
    }
    public void comboboxCasosReso(){
        comboBoxSelectByValue(comboboxCasosReso,GlobalParameters.CASOS_RESO);
    }
    public void comboboxCasosFech(){
        comboBoxSelectByValue(comboboxCasosFech,GlobalParameters.CASOS_FECH);
    }
    public void comboboxCasosReab(){
        comboBoxSelectByValue(comboboxCasosReab,GlobalParameters.CASOS_REAB);
    }
    public void comboboxAnotacoes(){
        comboBoxSelectByValue(comboboxAnotacoes,GlobalParameters.ANOTACOES);
    }
    public void comboboxMudStatus(){
        comboBoxSelectByValue(comboboxMudStatus,GlobalParameters.MUD_STATUS);
    }
    public void comboboxMudPriori(){
        comboBoxSelectByValue(comboboxMudPriori,GlobalParameters.MUD_PRIORI);
    }
    public void limiteAnotEmail(){
        clear(limiteAnotacoesEmail);
        sendKeys(limiteAnotacoesEmail, GlobalParameters.LIMITE_ANOT_EMAIL);
    }
    public void fusoHoraSelecao(){
        comboBoxSelectByValue(fusoHorarioSelecao,GlobalParameters.FUSO_HORARIO);
    }
    public void idiomaSelecao(){
        comboBoxSelectByValue(idiomaSelecao,GlobalParameters.IDIOMA_SELECIONADO);
    }
    public void atualizarPreferencias(){
        click(atualizaPreferenciasBtn);
    }
    public String confirmacaoSucesso(){
        return getText(alteracoesRealizadasSucesso).substring(0,31);
    }

}
