import org.junit.Test;
import org.junit.Before;
//import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.Test;




public class Cadastro{

    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = new ChromeDriver();
        navegador.get("https://automationexercise.com/login");

    }



    @Test
    public void chromeTest(){
        //WebDriver navegador = new ChromeDriver();
        //navegador.get("https://automationexercise.com/login");

        //Criar formulrio 
        WebElement loginParaCriarUsuario = navegador.findElement(By.className("signup-form"));

        //Preencher o campo Name
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("nomeCurso");
        
        //Preencher o campo Email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("emailCursoTeste0202@teste.com");

        //Clicar no botão SingiUp
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

        WebElement cadastro = navegador.findElement((By.id("form")));

        cadastro.findElement(By.id("id_gender1")).click();

        cadastro.findElement((By.id("password"))).sendKeys("020202");

        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[03]")).click();

        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select/option[03]")).click();

        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select/option[29]")).click();

        cadastro.findElement(By.id("newsletter")).click();

        cadastro.findElement(By.id("first_name")).sendKeys("Cleany");

        cadastro.findElement(By.id("last_name")).sendKeys("Viana");

        cadastro.findElement(By.id("address1")).sendKeys("Casa");




    }

    //@After
    public void tearDown(){
        navegador.quit();
    }


}

