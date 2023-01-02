package dataDrivenFramework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;


public class DDFDemo {

	public static void main(String[] args) throws IOException, InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(2000);

		//--------------FileRead----------------------------
		FileInputStream fis=new FileInputStream("D:\\LoginCredentials.xlsx");
		XSSFWorkbook wb=new XSSFWorkbook(fis);
		XSSFSheet sheet=wb.getSheet("Data");

		int rows=sheet.getLastRowNum();
		System.out.println("Total No. of Rows :"+rows);

		for(int r=1; r<=rows; r++)
		{
			XSSFRow row=sheet.getRow(r);
			XSSFCell userName=row.getCell(0);
			XSSFCell passWord=row.getCell(1);
			XSSFCell result=row.createCell(2);

			System.out.println("UserName-->"+userName+ "Password-->"+passWord);


		//--------------FileRead----------------------------

		//---------------OrangeHRM Login Code-------------------
		driver.findElement(By.name("username")).sendKeys(userName.toString());
		driver.findElement(By.name("password")).sendKeys(passWord.toString());
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		try {
		driver.findElement(By.xpath("//p[@class='oxd-userdropdown-name']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Logout")).click();
		System.out.println("VALID");
		result.setCellValue("VALID");


		}
		catch(Exception e)
		{
			System.out.println("INVALID");
			result.setCellValue("INVALID");
		}
		}
		fis.close();
		FileOutputStream fos=new FileOutputStream("D:\\LoginCredentials.xlsx");
		wb.write(fos);


	}

}
