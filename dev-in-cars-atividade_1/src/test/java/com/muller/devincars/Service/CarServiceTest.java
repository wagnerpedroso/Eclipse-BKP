package com.muller.devincars.Service;

import com.muller.devincars.Util.CriarCarro;
import com.muller.devincars.model.Car;
import com.muller.devincars.repository.CarRepository;
import com.muller.devincars.service.CarService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;

import java.util.Optional;

public class CarServiceTest {
    @Mock
    private CarRepository carRepositorymock;

    @InjectMocks
    private CarService carService;

    private final Car carroParaComparacao = CriarCarro.carroValido();

    @Test
    @DisplayName("Teste Valida Carro Pelo Id")
    public void deveBuscarUmcarroPeloId() {
        //Preparando
        Mockito.when(carRepositorymock.findById(Mockito.anyLong())).thenReturn(Optional.of(carroParaComparacao));
        //Chamada método teste
        var carroRetornar = carService.findById(3L).get();
        //3 Comprar
        Assertions.assertEquals(carroParaComparacao, carroRetornar);


    }

}
