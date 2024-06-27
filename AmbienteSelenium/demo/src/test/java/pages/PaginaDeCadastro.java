package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaginaDeCadastro extends BasePage{

    public PaginaDeCadastro(WebDriver navegador) {
        super(navegador);
    }

    public PaginaDeCadastro genero(){
        navegador.findElement(By.id("id_gender1")).click();
        return this;
    }
    
    public PaginaDeCadastro senha (String senha){
        navegador.findElement(By.id("password")).sendKeys(senha);
        return this;
    }

    public PaginaDeCadastro dia(){
        navegador.findElement(By.id("uniform-days")).click();;
        return this;
    }

    public PaginaDeCadastro mes(){
        navegador.findElement(By.id("uniform-months")).click();;
        return this;
    }

    public PaginaDeCadastro ano(){
        navegador.findElement(By.id("uniform-years")).click();;
        return this;
    }

    public PaginaDeCadastro noticia(){
        navegador.findElement(By.id("newsletter")).click();;
        return this;
    }

    public PaginaDeCadastro opcao(){
        navegador.findElement(By.id("optin")).click();;
        return this;
    }

    public PaginaDeCadastro primeiroNome(String nome){
        navegador.findElement(By.id("firts_name")).sendKeys(nome);
        return this;
    }

    public PaginaDeCadastro sobrenome(String sobrenome){
        navegador.findElement(By.id("last_name")).sendKeys(sobrenome);
        return this;
    }

    public PaginaDeCadastro  rua(String rua){
        navegador.findElement(By.id("address1")).sendKeys(rua);
        return this;
    }

    public PaginaDeCadastro pais(String pais){
        navegador.findElement(By.id("country")).sendKeys(pais);
        return this;
    }

    public PaginaDeCadastro estado(String estado){
        navegador.findElement(By.id("state")).sendKeys(estado);
        return this;
    }

    public PaginaDeCadastro cidade(String cidade){
        navegador.findElement(By.id("city")).sendKeys(cidade);
        return this;
    }

    public PaginaDeCadastro codigoPostal(String codigoPostal1){
        navegador.findElement(By.id("firts_name")).sendKeys(codigoPostal1);
        return this;
    }

    public PaginaDeCadastro telefone(String telefone){
        navegador.findElement(By.id("mobile_number")).sendKeys(telefone);
        return this;
    }

    public ContaCriada pagina(){
        navegador.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();;
        return new ContaCriada (navegador);
    }

    

}
