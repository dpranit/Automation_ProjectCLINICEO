package payments_tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import utils.BaseClass;

public class CreditNotes extends BaseClass{
		
	@Test
	public void Create_creditnote() throws InterruptedException {
		WebElement Paymentsbtn= driver.findElement(By.xpath("//div[text()='Payments']"));
		Paymentsbtn.click();
		WebElement CreditNotebtn= driver.findElement(By.xpath("//div[text()=' Credit Notes ']"));
		CreditNotebtn.click();
		WebElement NewCreditNote= driver.findElement(By.xpath("//button[text()=' Create Credit Note ']"));
		NewCreditNote.click();
		driver.findElement(By.xpath("//input[@placeholder='Type Patient Name']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()=' Pranit Dhole ']")).click();
		//driver.findElement(By.xpath("//input[@placeholder='Type Patient Name']")).sendKeys("Pranit Dhole");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='custom_cal']")).click();
		driver.findElement(By.xpath("//div[@class='mat-calendar-body-cell-content mat-focus-indicator mat-calendar-body-selected mat-calendar-body-today']")).click();
		driver.findElement(By.xpath("(//input[@class='form__input ng-untouched ng-pristine ng-valid'])[2]")).click();
		driver.findElement(By.xpath("//span[text()='New Credit Note']")).click();
		WebElement PaymentFor = driver.findElement(By.xpath("//option[text()='Select']"));
		PaymentFor.click();
		
		WebElement PaymentForr = driver.findElement(By.xpath("//option[text()='Select']"));  
		Select dropdown = new Select(PaymentFor);  
		dropdown.selectByValue("Product");
		
		driver.findElement(By.xpath("//input[@class='form__input_cell ng-pristine ng-valid ng-touched']")).click();
		driver.findElement(By.xpath("//input[@class='form__input_cell ng-pristine ng-valid ng-touched']")).sendKeys("Steus");
		
	}
}
