
import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.devtools.v123.v123CdpInfo;
import org.openqa.selenium.By;;

public class CriarPreCadastro {
    
    @Test

    public void chromeTest(){
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/login");

        //Criar formulrio 
        WebElement loginParaCriarUsuario = navegador.findElement(By.className("signup-form"));

        //Preencher o campo Name
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("nomeCurso");
        
        //Preencher o campo Email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("emailCursoTeste@teste.com");

        //Clicar no botão SingiUp
        navegador.findElement(By.xpath("html/body/section/div/div/div[3]/div/form/button")).click();

        //navegador.quit();


    }
    
}