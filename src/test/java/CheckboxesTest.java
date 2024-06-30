import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

public class CheckboxesTest extends BaseTest{

    @Test public void checkBoxesTest() {
        driver.get("https://the-internet.herokuapp.com/checkboxes");
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        assertFalse(checkbox1.isSelected(), "Checkbox 1 is checked");//Проверка, что первый чекбокс не отмечен
        checkbox1.click();
        assertTrue(checkbox1.isSelected(), "Checkbox 1 is not checked");// Проверка, что первый чекбокс отмечен
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));
        assertTrue(checkbox2.isSelected(), "Checkbox 2 is checked");// Проверка, что второй чекбокс отмечен
        checkbox2.click();
        assertFalse(checkbox2.isSelected(), "Checkbox 2 is not clicking");// Проверка, что второй чекбокс не отмечен
    }
    }



