package steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class procuraProdutoSteps {

    private static WebDriver driver;

    @Before
    public void iniciarTeste(){
        driver = new ChromeDriver();
    }

    @Dado("que estou na página inicial")
    public void queEstouNaPáginaInicial() {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://marcelodebittencourt.com/demoprestashop/");
    }

    @Quando("não estou logado")
    public void nãoEstouLogado() {
        //String textSignIn = driver.findElement(By.cssSelector("#_desktop_user_info > div > a > span")).getText();
        //assertThat(textSignIn).isEqualTo("Sing In");
        //TODO verificar como localizar ele, pois fica "escondido" na tela
    }

    @Então("visualizo pelo menos um produto com descrição e preço")
    public void visualizoPeloMenosUmProdutoComDescriçãoEPreço() {
        WebElement elementoDescricao = driver.findElement(By.cssSelector("#content > section > div > article:nth-child(1) > div > div.highlighted-informations.hidden-sm-down"));
        String descricaoEncontrada = elementoDescricao.getText();

        WebElement elementoPreco = driver.findElement(By.cssSelector("#content > section > div > article:nth-child(1) > div > div.product-description > div > span.price"));
        String precoEncontrado = elementoPreco.getText();

        assertThat(descricaoEncontrada).isNotEmpty();
        assertThat(precoEncontrado).isNotEmpty();
    }

    @After
    public static void finalizar(){
        driver.quit();
    }
}
