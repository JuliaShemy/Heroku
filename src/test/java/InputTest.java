import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class InputTest extends BaseTest {

    @Test
    public void inputTest(){
        driver.get("https://the-internet.herokuapp.com/inputs");
        WebElement numberInput = driver.findElement(By.cssSelector("input[type='number']"));
        numberInput.clear();
        numberInput.sendKeys("123");
        assertEquals(numberInput.getAttribute("value"), "123", "Not correct");
        numberInput.clear();
        numberInput.sendKeys("abc");
        assertEquals(numberInput.getAttribute("value"), "", "Not correct");
        numberInput.clear();
        numberInput.sendKeys("1");
        numberInput.sendKeys(Keys.ARROW_UP);
        assertEquals(numberInput.getAttribute("value"), "2", "Not correct");
        numberInput.sendKeys(Keys.ARROW_DOWN);
        assertEquals(numberInput.getAttribute("value"), "1", "Not correct");
    }
}