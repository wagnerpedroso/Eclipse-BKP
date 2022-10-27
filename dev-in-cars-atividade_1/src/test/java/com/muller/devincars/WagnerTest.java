package com.muller.devincars;

import com.muller.devincars.model.Wagner;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WagnerTest {


    private final Wagner wagner = new Wagner("Wagner", 27, "São José", "Desenvolvedor Full-Stack");

    @Test
    public void deveRetornarUmWagnerComSucesso(){
        Wagner wagnerSucesso = new Wagner();
        wagnerSucesso.setNome("Wagner");
        wagnerSucesso.setIdade(27);
        wagnerSucesso.setCidade("São José");
        wagnerSucesso.setOcupacao("Desenvolvedor Full-Stack");

        Assertions.assertEquals(wagnerSucesso, wagner);
    }

}
