package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticaWEMe {

	public static void main(String[] args) throws InterruptedException {
   
WebDriver driver = new ChromeDriver();
		
		driver.get ("https://www.saucedemo.com/");
		
		//obtener objetos/WebElements de la pg web
		
		WebElement userName = driver.findElement(By.id("user-name"));
		WebElement passwordTxt = driver.findElement(By.name("password"));
		WebElement loginBtn = driver.findElement(By.id("login-button"));
		
		
		//Hacer Login     
		
		userName.sendKeys("standard_user");
		Thread.sleep(2000);
		passwordTxt.sendKeys("secret_sauce"); 	
		Thread.sleep(2000);
        loginBtn.click();
        
        // 2.Agregar BackPack al carrito     //Maximizar la pantalla please!!
        
        WebElement addCard = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));   //el web element addCard yo lo coloqué, puede ser cualquier nombre right?
        addCard.click();
        
        // 3.Click en carrito de compras
        WebElement car = driver.findElement(By.className("shopping_cart_link"));
        car.click();
        
        
        // 4..Click Checkout
        WebElement checkOut = driver.findElement(By.id("checkout"));
        checkOut.click();
        
        
        //5.Llenar formulario
        
                              //5.1 Nombre 
                             // 5.1.1 Find and clear 
        WebElement firstName = driver.findElement(By.id("first-name"));
        firstName.clear();
                              //5.1.2 Enter Text - Nombre
        String name = "Grecia";
        firstName.sendKeys(name);
        Thread.sleep(2000);
        
                              //5.2 Apellido
                              //5.2.1 Find and clear
        WebElement lastName = driver.findElement(By.id("last-name"));
        lastName.clear();
                               //5.2.2 Enter Text - Apellido
        
        String ape = "Snow";
        lastName.sendKeys(ape);
        Thread.sleep(2000);
        
                               // 5.3 Código Postal
                               // 5.3.1 Find and clear
        WebElement codPostal = driver.findElement(By.name("postalCode"));
        codPostal.clear();
        
                               // 5.3.2 Enter Text - Cod Postal
        String zip = "28022";
        codPostal.sendKeys(zip);
        Thread.sleep(2000);
        
        
        //6.Click Continue
        
        WebElement continuar = driver.findElement(By.id("continue"));
        continuar.click();       
                              
       
        //7.Click en Finish
        
        WebElement fin = driver.findElement(By.name("finish"));
        fin.click();
        
        //8.Validacion de Texto
                                  //8.1 find element, declarando la variable con string, luego declarar una variable booleana que valide el texto con el contains de java
        
        String validText = driver.findElement(By.className("complete-header")).getText();
        boolean textCorrect = validText.contains("Thank you for your order!");
        
                                 //8.2 hacer un if-else
        
        if(textCorrect) {
        	System.out.print("El texto mostrado es correcto");
        
        }else {
        	System.out.print("Error, el texto mostrado es incorrecto");
        }
        
        Thread.sleep(2000);
        
        
        // Quiero hacer click en back home
        WebElement backHome = driver.findElement(By.id("back-to-products"));
        backHome.click();
        
        
      	}

}
