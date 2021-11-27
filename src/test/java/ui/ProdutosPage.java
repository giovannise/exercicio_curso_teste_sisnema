package ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProdutosPage {
    private WebDriver driver;

    private By descricaoProduto =By.cssSelector("#content > section > div > article:nth-child(1) > div > div.highlighted-informations.hidden-sm-down");
    private By precoProduto =By.cssSelector("#content > section > div > article:nth-child(1) > div > div.product-description > div > span.price");

    public ProdutosPage(WebDriver driver) {
        this.driver = driver;
    }

    public String obterDescricaoProduto() {
        return driver.findElement(descricaoProduto).getText();
    }

    public String obterPrecoProduto() {
        return driver.findElement(precoProduto).getText();
    }
}
