package ahead.com;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Demo1 {
   @Test
	public void openchrome(){
	   System.setProperty("webdriver.chrome.driver", ".//tools//chromedriver.exe");
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.baidu.com");
		driver.getTitle();//��ȡ��ǰҳ��Title
		System.out.println(driver.getTitle());//��ӡ����
		driver.getCurrentUrl();//��ȡ��ǰҳ��URL
		System.out.println(driver.getCurrentUrl());//��ӡ��ַ
		driver.manage().window().maximize();//���
		 driver.get("https://www.sina.com");
		 driver.manage().window().maximize();//���
		 Dimension dimension = new Dimension(0, 0);
		 driver.manage().window().setSize(dimension);

   }
}
