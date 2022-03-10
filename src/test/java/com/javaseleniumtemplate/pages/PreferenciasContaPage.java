package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.*;

public class PreferenciasContaPage extends PageBase {

    By minhaConta = linkText("Minha Conta");
    By preferenciasConta = linkText("Preferências");
    By redefinirPreferencia = xpath("//*[@value='Redefinir Preferências']");

    By projetoCombobox = name("default_project");
    By tempoRenovacaoMinutos = xpath("//*[@name='refresh_delay']");
    By tempoRedirecionamentoSegundos = xpath("redirect_delay");
    By radioButonAscDesc = xpath("//*[@value='DESC']");

    By checkBoxNovosCasos = xpath("//*[@name='email_on_new']");
    By comboboxNovosCasos = xpath("//*[@name='email_on_new_min_severity']");

    By checkBoxMudancaAtri = xpath("//*[@name='email_on_new']");
    By comboboxMudancaAtri = xpath("//*[@name='email_on_assigned_min_severity']");

    By checkBoxRetornos = xpath("//*[@name='email_on_new']");
    By comboboxRetornos = xpath("//*[@name='email_on_feedback_min_severity']");

    By checkBoxCasosReso = xpath("//*[@name='email_on_new']");
    By comboboxCasosReso = xpath("//*[@name='email_on_resolved_min_severity']");

    By checkBoxCasosFech = xpath("//*[@name='email_on_new']");
    By comboboxCasosFech = xpath("//*[@name='email_on_closed_min_severity']");

    By checkBoxCasosReab = xpath("//*[@name='email_on_new']");
    By comboboxCasosReab = xpath("//*[@name='email_on_reopened_min_severity']");

    By checkBoxAnotacoes = xpath("//*[@name='email_on_new']");
    By comboboxAnotacoes = xpath("//*[@name='email_on_bugnote_min_severity']");

    By checkBoxMudStatus = xpath("//*[@name='email_on_new']");
    By comboboxMudStatus = xpath("//*[@name='email_on_status_min_severity']");

    By checkBoxMudPriori = xpath("//*[@name='email_on_new']");
    By comboboxMudPriori = xpath("//*[@name='email_on_priority_min_severity']");

    By limiteAnotacoesEmail = xpath("//*[@name='email_bugnote_limit']");
    By fusoHorarioSelecao = xpath("//*[@value='America/Sao_Paulo']");
    By idiomaSelecao = xpath("//*[@value='portuguese_brazil']");

    By atualizaPreferenciasBtn = xpath("//*[@value='Atualizar Preferências']");

}
