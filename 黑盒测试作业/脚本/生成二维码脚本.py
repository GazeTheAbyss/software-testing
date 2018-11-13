# -*- coding: utf-8 -*-
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.common.keys import Keys
from selenium.webdriver.support.ui import Select
from selenium.common.exceptions import NoSuchElementException
from selenium.common.exceptions import NoAlertPresentException
import unittest, time, re

class (unittest.TestCase):
    def setUp(self):
        self.driver = webdriver.Firefox()
        self.driver.implicitly_wait(30)
        self.base_url = "https://cli.im/"
        self.verificationErrors = []
        self.accept_next_alert = True
    
    def test_(self):
        driver = self.driver
        driver.get(self.base_url + "/text")
        driver.find_element_by_id("text-content").clear()
        driver.find_element_by_id("text-content").send_keys("pzj")
        driver.find_element_by_id("click-create").click()
        driver.find_element_by_link_text(u"网址").click()
        driver.find_element_by_id("url_content").click()
        driver.find_element_by_id("url_content").clear()
        driver.find_element_by_id("url_content").send_keys("https://www.baidu.com")
        driver.find_element_by_id("click-create").click()
        driver.find_element_by_id("filedatacode").click()
        driver.find_element_by_id("filedatacode").clear()
        driver.find_element_by_id("filedatacode").send_keys(u"C:\\Users\\zhongjie\\Pictures\\TIM图片20180813143159.jpg")
        driver.find_element_by_id("click-create").click()
        driver.find_element_by_link_text(u"图片").click()
        driver.find_element_by_id("filedatacode").click()
        driver.find_element_by_id("filedatacode").clear()
        driver.find_element_by_id("filedatacode").send_keys(u"C:\\Users\\zhongjie\\Pictures\\西游记图片.jpg")
        driver.find_element_by_id("click-create").click()
        driver.find_element_by_link_text(u"音视频").click()
        driver.find_element_by_id("filedatacode").click()
        driver.find_element_by_id("filedatacode").clear()
        driver.find_element_by_id("filedatacode").send_keys("C:\\Users\\zhongjie\\Pictures\\mass\\IMG_3579.MOV")
        driver.find_element_by_id("click-create").click()
        driver.find_element_by_link_text(u"名片").click()
        driver.find_element_by_name("name").click()
        driver.find_element_by_name("name").clear()
        driver.find_element_by_name("name").send_keys(u"潘忠杰")
        driver.find_element_by_name("mobile").clear()
        driver.find_element_by_name("mobile").send_keys("13102250301")
        driver.find_element_by_id("click-create").click()
    
    def is_element_present(self, how, what):
        try: self.driver.find_element(by=how, value=what)
        except NoSuchElementException as e: return False
        return True
    
    def is_alert_present(self):
        try: self.driver.switch_to_alert()
        except NoAlertPresentException as e: return False
        return True
    
    def close_alert_and_get_its_text(self):
        try:
            alert = self.driver.switch_to_alert()
            alert_text = alert.text
            if self.accept_next_alert:
                alert.accept()
            else:
                alert.dismiss()
            return alert_text
        finally: self.accept_next_alert = True
    
    def tearDown(self):
        self.driver.quit()
        self.assertEqual([], self.verificationErrors)

if __name__ == "__main__":
    unittest.main()
