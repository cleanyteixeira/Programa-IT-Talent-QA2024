//import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.devtools.v123.v123CdpInfo;

import com.example.Test;

import pages.PreCadastro;
import suporte.Web;

public class CadastroPageObject {

    private WebDriver navegador;

    @Before
    public void setUp(){
        navegador = Web.createChrome();
    }

    @Test
    public void cadastro(){
        new PreCadastro(navegador)
        .login("testePaginaPreCadastro")
        .email("testeemail@precadastro")
        .pagina()
        .genero()
        .senha("123456")
        .dia()
        .mes()
        .ano()
        .noticia()
        .opcao()
        .primeiroNome("Maria")
        .sobrenome("Teste")
        .rua("Rua Teste")
        .pagina()
        .estado("Ceara")
        .cidade("Fortaleza")
        .codigoPostal()
        .telefone("859888888")
        .pagina();


    }

   // @After
    public void tearDown(){
        navegador.quit();
    }
}
