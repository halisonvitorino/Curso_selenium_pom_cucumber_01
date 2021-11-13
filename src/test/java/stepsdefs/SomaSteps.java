package stepsdefs;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;

public class SomaSteps {
    int a;
    int b;
    int c;

    @Dado("o numero {int}")
    public void o_numero(Integer int1) {
        a = int1;
    }

    @Quando("somo {int}")
    public void somo(Integer int1) {
        b = int1;
        c = a + b;
    }

    @Entao("tenho {int}")
    public void tenho(Integer int1) {
        Assertions.assertEquals(c, 10);
    }

}
