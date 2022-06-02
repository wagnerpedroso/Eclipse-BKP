package com.example.demo.configuration;

import com.example.demo.configuration.dto.ErroRequisicaoDto;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class BadRequestHandler {
    private final MessageSource messageSource;

    public BadRequestHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public List<ErroRequisicaoDto> handleMethod(MethodArgumentNotValidException exception){
        List<ErroRequisicaoDto> dto = new ArrayList<>();
        List<FieldError> listaErro = exception.getBindingResult().getFieldErrors();

        listaErro.forEach(e ->{
            String mensagem = messageSource.getMessage(e, LocaleContextHolder.getLocale());
            ErroRequisicaoDto erro = new ErroRequisicaoDto(e.getField(), mensagem);
            dto.add(erro);
        });

        return dto;
    }

//    @ExceptionHandler(IndexOutOfBoundsException.class)
//    @ResponseStatus(HttpStatus.BAD_REQUEST)
//    public ErroPosicaoDto handleMethod(IndexOutOfBoundsException exception){
//        String listaErro = exception.getMessage();
//
//        return dto;
//    }

}
