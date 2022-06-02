package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.http.HttpStatus;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.ArrayList;
import java.util.List;

@RestControllerAdvice
public class ErrodeValidacaoHandler {

    private final MessageSource messageSource;

    public ErrodeValidacaoHandler(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public List<ErroDeFormulariooDto> handle(MethodArgumentNotValidException exception){
        List<ErroDeFormulariooDto> dto = new ArrayList<>();
        List<FieldError> fieldErros= exception.getBindingResult().getFieldErrors();

        fieldErros.forEach(e->{
            String mensagem = messageSource.getMessage(e, LocaleContextHolder.getLocale());
            ErroDeFormulariooDto erro = new ErroDeFormulariooDto(e.getField(), mensagem);
            dto.add(erro);
        });
        return dto;
    }

}
