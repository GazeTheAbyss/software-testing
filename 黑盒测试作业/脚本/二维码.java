package com.example.tests;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class  {
  private WebDriver driver;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();

  @Before
  public void setUp() throws Exception {
    driver = new FirefoxDriver();
    baseUrl = "https://cli.im/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
  }

  @Test
  public void test() throws Exception {
    driver.get(baseUrl + "/text");
    driver.findElement(By.linkText("文本")).click();
    driver.findElement(By.id("text-content")).click();
    driver.findElement(By.id("text-content")).clear();
    driver.findElement(By.id("text-content")).sendKeys("潘忠杰");
    driver.findElement(By.id("click-create")).click();
    driver.findElement(By.xpath("//ul[@id='tools-tits']/li")).click();
    driver.findElement(By.id("size-btn")).click();
    driver.findElement(By.xpath("//div[@id='size-range']/span")).click();
    driver.findElement(By.xpath("//div[@id='level']/button")).click();
    driver.findElement(By.linkText("15%")).click();
    driver.findElement(By.id("colorselect")).click();
    driver.findElement(By.id("icp_fgcolor")).click();
    driver.findElement(By.xpath("//thead[@id='hexSection0']/tr/td[6]")).click();
    driver.findElement(By.id("icp_bggcolor")).click();
    driver.findElement(By.xpath("//thead[@id='hexSection0']/tr/td[13]")).click();
    driver.findElement(By.xpath("//ul[@id='tools-tits']/li[3]")).click();
    driver.findElement(By.id("filedatacodeicon")).click();
    driver.findElement(By.id("filedatacodeicon")).clear();
    driver.findElement(By.id("filedatacodeicon")).sendKeys("C:\\Users\\zhongjie\\Pictures\\mass\\IMG_3009.JPG");
    driver.findElement(By.xpath("//ul[@id='tools-tits']/li[4]")).click();
    driver.findElement(By.id("qrfun-ksmh")).click();
    driver.findElement(By.id("pub_beauty_template")).click();
    driver.findElement(By.xpath("//div[19]/div[2]/div/div")).click();
    driver.findElement(By.linkText("2图标与文字")).click();
    driver.findElement(By.linkText("3局部微调")).click();
    driver.findElement(By.id("beauty_complete")).click();
    driver.findElement(By.id("dialog_close")).click();
    driver.findElement(By.xpath("//div[19]/div[2]/div/div")).click();
    driver.findElement(By.linkText("网址")).click();
    driver.findElement(By.id("url_content")).click();
    driver.findElement(By.id("url_content")).clear();
    driver.findElement(By.id("url_content")).sendKeys("https://www.baidu.com");
    driver.findElement(By.id("click-create")).click();
    driver.findElement(By.xpath("//ul[@id='tools-tits']/li[4]")).click();
    driver.findElement(By.id("qrfun-ksmh")).click();
    driver.findElement(By.xpath("//ul[@id='black_beauty_ul']/li[8]/img")).click();
    driver.findElement(By.id("pub_beauty_template")).click();
    driver.findElement(By.xpath("//div[16]/div[2]/div/div")).click();
    driver.findElement(By.linkText("2图标与文字")).click();
    driver.findElement(By.xpath("//div[2]/ul/li[7]/img")).click();
    driver.findElement(By.linkText("下一步")).click();
    driver.findElement(By.cssSelector("i.eye_sfleavesr")).click();
    driver.findElement(By.id("beauty_complete")).click();
    driver.findElement(By.id("dialog_close")).click();
    driver.findElement(By.xpath("//div[16]/div[2]/div/div")).click();
    driver.findElement(By.linkText("文件")).click();
    driver.findElement(By.id("filedatacode")).click();
    driver.findElement(By.id("filedatacode")).clear();
    driver.findElement(By.id("filedatacode")).sendKeys("C:\\Users\\zhongjie\\Desktop\\实验.txt");
    driver.findElement(By.id("click-create")).click();
    driver.findElement(By.linkText("图片")).click();
    driver.findElement(By.id("filedatacode")).click();
    driver.findElement(By.id("filedatacode")).clear();
    driver.findElement(By.id("filedatacode")).sendKeys("C:\\Users\\zhongjie\\Pictures\\TIM图片20180813143159.jpg");
    driver.findElement(By.id("click-create")).click();
    driver.findElement(By.linkText("名片")).click();
    driver.findElement(By.name("name")).click();
    driver.findElement(By.name("name")).clear();
    driver.findElement(By.name("name")).sendKeys("潘忠杰");
    driver.findElement(By.name("mobile")).clear();
    driver.findElement(By.name("mobile")).sendKeys("13102250301");
    driver.findElement(By.name("email")).clear();
    driver.findElement(By.name("email")).sendKeys("1275389939@qq.com");
    driver.findElement(By.id("company")).clear();
    driver.findElement(By.id("company")).sendKeys("南开大学");
    driver.findElement(By.name("dep")).clear();
    driver.findElement(By.name("dep")).sendKeys("软件学院");
    driver.findElement(By.name("job")).clear();
    driver.findElement(By.name("job")).sendKeys("本科生");
    driver.findElement(By.name("address")).clear();
    driver.findElement(By.name("address")).sendKeys("南开大学泰达学院宏达街23号");
    driver.findElement(By.id("click-create")).click();
    driver.findElement(By.linkText("微信")).click();
    driver.findElement(By.id("weixinurl")).click();
    driver.findElement(By.id("weixinurl")).clear();
    driver.findElement(By.id("weixinurl")).sendKeys("xgyly_wechat");
    driver.findElement(By.id("click-create")).click();
    assertEquals("请输入正确的公众微信号", closeAlertAndGetItsText());
    driver.findElement(By.id("weixinurl")).clear();
    driver.findElement(By.id("weixinurl")).sendKeys("xpyly_wechat");
    driver.findElement(By.id("click-create")).click();
  }

  @After
  public void tearDown() throws Exception {
    driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }

  private boolean isElementPresent(By by) {
    try {
      driver.findElement(by);
      return true;
    } catch (NoSuchElementException e) {
      return false;
    }
  }

  private boolean isAlertPresent() {
    try {
      driver.switchTo().alert();
      return true;
    } catch (NoAlertPresentException e) {
      return false;
    }
  }

  private String closeAlertAndGetItsText() {
    try {
      Alert alert = driver.switchTo().alert();
      String alertText = alert.getText();
      if (acceptNextAlert) {
        alert.accept();
      } else {
        alert.dismiss();
      }
      return alertText;
    } finally {
      acceptNextAlert = true;
    }
  }
}
