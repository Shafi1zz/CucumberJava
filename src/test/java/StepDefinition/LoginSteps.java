package StepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

@Given("user is o login page")
public void user_is_o_login_page() {
    System.out.println("We will make it inshallah.");
}

@And("user enters user1 and pass1")
public void user_enters_user1_and_pass1() {
    System.out.println("Yes we will");
}

@When("clicks on login button")
public void clicks_on_login_button() {
    System.out.println("Getting bettter.");
}

@Then("user is navigated to the home page")
public void user_is_navigated_to_the_home_page() {
    System.out.println("We'll get to be the  best.");
}

}
