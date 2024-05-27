//package com.boots.controller.handlers;
//
//import io.swagger.v3.oas.annotations.media.Schema;
//import org.hibernate.service.spi.ServiceException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.converter.HttpMessageNotReadableException;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
//@RestControllerAdvice
//@Schema(description = "Обработчик возникающих ошибок.")
//public class GlobalExceptionHandler {
//
//    @ExceptionHandler(ServiceException.class)
//    @Schema(description = "Перехватчик исключений, возникших в сервисах")
//    public final ResponseEntity<ExceptionMessage> handleServiceException(ServiceException exception) {
//        return ResponseEntity.status(exception.getHttpStatus())
//                .body(ExceptionMessage.builder()
//                        .exceptionName(exception.getClass().getSimpleName())
//                        .message(exception.getMessage())
//                        .build()
//                );
//    }
//
//    @ExceptionHandler(Exception.class)
//    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
//    @Schema(description = "Формирует ответ на основе всех исключений {@link Exception}")
//    public final ExceptionMessage onAllExceptions(Exception exception) {
//        return ExceptionMessage.builder()
//                .message(exception.getMessage())
//                .exceptionName(exception.getClass().getSimpleName())
//                .build();
//    }
//
//}
