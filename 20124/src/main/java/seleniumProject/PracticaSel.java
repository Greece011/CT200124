package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticaSel {

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
		
		
		//Métodos de explorador
        //obtener el título de la pg
        
        String title = driver.getTitle();
        System.out.println("El título de la página es: " + title);
        
        //Obtener la Url
        String url = driver.getCurrentUrl();
        System.out.println("La url actual es: " + url);
        
        //Métodos de navegación:
      //  driver.navigate().back();
      //  Thread.sleep(2000);
       // driver.navigate().forward();
      //  Thread.sleep(2000);
      //  driver.navigate().refresh();
        
        
        //verifica el elemento desplegado en la pg:
          boolean product = driver.findElement(By.className("inventory_item_name")).isDisplayed();
          if (product) {
        	  System.out.println("El articulo es desplegado/mostrado"); //desplegado es mostrado en este caso.
          }
      
        //Obtener el texto de un web element
          String prodText = driver.findElement(By.className("inventory_item_name")).getText();
          
          boolean textCorrect = prodText.contains("Sauce Labs Backpack"); //Contains es un método de Java(no de selenium) que evalua 2 string
          
          if (textCorrect) {
        	  System.out.println("El nombre del producto es correcto");
        	  
          }else {
        	  System.out.println("Error: El producto no es correcto");
          }
          Thread.sleep(2000);
          
          //Dropdown
          Select dropdwn = new Select(driver.findElement(By.className("product_sort_container")));
          dropdwn.selectByValue("lohi");
          
          Thread.sleep(2000);
          
         // driver.close();// cierra la ventana actual con la que se está interactuando
         driver.quit();// cierra toodas las ventanas o pestañas que se abrieron
	}
        
		
		
		
		
		
		
		// otro ejemplo
		//driver.get("https://www.google.com");

	

}
