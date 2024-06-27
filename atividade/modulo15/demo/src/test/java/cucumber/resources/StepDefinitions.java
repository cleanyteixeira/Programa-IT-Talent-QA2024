package cucumber.resources;

import java.util.Random;

import cucumber.pages.SingUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions {

    private SingUpPage singUpPage;
    private Random Rand;

    @Given("User in on Homepage")
    public void user_is_on_homepage_scenario_1(){
        this.singUpPage = new SingUpPage();
    }

    @Given("User clicks on the login button")
        public void user_enters_a_name_on_name_field_scenario_1 (){
            singUpPage.clicaeLogin("/html/body/div[1]/main/nav/div/section[2]/div/ul[1]/li/button");
    }

    
    @When("User enters an email on email field")
        public void user_enters_an_email_on_email_field (){
            rand = new Random();
                int randomNum = rand.nextInt(10000) + 1;
                singUpPage.preencherCampoXpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[1]/div[1]", "teste" + randomNum + "@email.comm");
                singUpPage.clicarXpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[1]/div[1]");
                System.out.println(randomNum);
    }

    @When("User enters a name on name field")
            public void user_clicks_on_the_login_scenario_1 (){
                singUpPage.preencherCampoXpath("/html/body/section/div/div/div[3]/div/form/input[1]", null);
            
    }

    @Then("User should be redirectioned to SingUp page")
        public void user_should_be_redirectioned_to_SingUp_page (){
            singUpPage.paginaCerto("https://homero.app.br/login");
                singUpPage.verificarTextoPorXpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[2]/button", "Entre");
        
    }

   /* SEGUNDO SEFARIO */

    @When("User enters an existing email on email field")
        public void user_enters_an_existing_email_on_email_field (){
            singUpPage.preencherCampoXpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[1]/div[1]", "teste@email.com");
                singUpPage.clicarXpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[1]/div[1]");    
    }

    @When("User enters an existing name on name field")
            public void User_enters_an_existing_name_on_name_field (){
                singUpPage.preencherCampoXpath("/html/body/section/div/div/div[3]/div/form/input[1]", null);
            
    }

    @Then("User should get an error message")
        public void user_should_get_an_error_message(){
            singUpPage.verificarTextoPorXpath("/html/body/div[1]/main/section/div/section[1]/div/form/div[2]/button", "Entre Account Information");
        }
    




    
}

