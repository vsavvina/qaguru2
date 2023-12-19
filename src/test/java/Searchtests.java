import org.bouncycastle.operator.bc.BcSignerOutputStream;
import org.junit.jupiter.api.*;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

public class Searchtests {
  @BeforeAll
  static void speedOnPage() {
    Configuration.pageLoadStrategy = "eager";  
  }
  @Test
  void selenideSearchTest() {
            open("https://www.google.ru");
            $("[name=q]").setValue("Selenide").pressEnter();
            $("[id=search]").shouldHave(text("https://ru.selenide.org"));
  }
  @AfterAll
  static void successfulStatus () {
    System.out.println("\nTest pass happy\n");
  }
}
