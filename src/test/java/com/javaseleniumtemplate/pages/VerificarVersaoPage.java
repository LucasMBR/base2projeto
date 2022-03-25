package com.javaseleniumtemplate.pages;

import com.javaseleniumtemplate.bases.PageBase;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.xpath;

public class VerificarVersaoPage extends PageBase {

        By gerenciarBtn = linkText("Gerenciar");

        By informacoesSiteCampos = xpath("//*[@class='width75']/tbody/tr[1]//td[1]");
        By versaoMantis = xpath("//*[@class='width75']/tbody/tr[2]//td[2]");
        By versaoSchema = xpath("//*[@class='width75']/tbody/tr[3]//td[2]");

        public void gerenciarMenu(){
                click(gerenciarBtn);
        }

        public String informacoesSiteCamposDisplayed(){
                return getText(informacoesSiteCampos);
        }

        public String versaoMantisCheck(){
                return getText(versaoMantis);
        }
        public String versaoSchemaCheck(){
                return getText(versaoSchema);
        }
}
