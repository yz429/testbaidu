package ahead.com;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class hanjiasan01 {
	WebDriver driver;
	
	@Before
	public void login(){
		System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("http://flight.qunar.com");
	}
	@Test
     public void buy() {
		WebElement dan=driver.findElement(By.id("js_lab_sng"));//��λ��ѡ��
		 System.out.println("�Ƿ�ѡ��"+dan.isSelected());//��ѡ��ť�Ƿ�ѡ�񣬷���false��true
		 dan.click();
		 WebElement chu=driver.findElement(By.name("fromCity"));//��λ�������������
	     chu.clear();//��������
	     chu.sendKeys("����(KOW)");//��������
	    // driver.findElement(By.className("btn_search")).click();//��λ��ť���
		 WebElement mu=driver.findElement(By.name("toCity"));//��λ������������
         mu.sendKeys("�ϲ�(KOW)");
         /*
         driver.findElement(By.className("btn_search")).click();//��λ��ť���
       
		 JavascriptExecutor removeAttribute = (JavascriptExecutor)driver;  
         //remove readonly attribute
         removeAttribute.executeScript("var setDate=document.getElementById(\"fromDate\");setDate.removeAttribute('readonly');") ;
         WebElement  from_date=driver.findElement(By.name("fromDate"));//��λ������������
         from_date.click();
	 from_date.clear();*/
	 WebElement  ss=driver.findElement(By.xpath("//*[@id=\"dfsForm\"]/div[4]/button"));//��λ������������
	 ss.click();
	}
	

	}
	
  
