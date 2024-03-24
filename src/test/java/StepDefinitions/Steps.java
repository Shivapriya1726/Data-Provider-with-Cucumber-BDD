package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import java.io.FileInputStream;
import java.io.IOException;

public class Steps {
    WebDriver webDriver;
    String excelPath = "D://Intellij//Worldline-Task4//src//test//datafiles//LoginData.xlsx";
    @Given("User is on the login page")
    public void user_is_on_the_login_page() {
        System.setProperty("webdriver.chrome.driver", "D://chromedriver-win64//chromedriver-win64//chromedriver.exe");
        webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");
    }

    @When("User enters valid username and password from Excel")
    public void user_enters_valid_username_and_password_from_Excel() throws IOException {
        FileInputStream fis = new FileInputStream(excelPath);
        Workbook workbook = new XSSFWorkbook(fis);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(1);
        String username = row.getCell(0).getStringCellValue();
        String password = row.getCell(1).getStringCellValue();

        webDriver.findElement(By.id("user-name")).sendKeys(username);
        webDriver.findElement(By.id("password")).sendKeys(password);

        workbook.close();
        fis.close();
    }
    @When("Clicks on login button")
    public void clicks_on_login_button() {
        webDriver.findElement(By.id("login-button")).click();
    }
    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        assert webDriver.getCurrentUrl().equals("https://www.saucedemo.com/inventory.html");
        webDriver.quit();
    }
}

