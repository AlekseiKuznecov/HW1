package com.boots.controller.handlers;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Schema(description = "* Сообщение описывающее возникшую исключительную ситуацию.")
public class ExceptionMessage {
    @Schema(description = "Сообщение исключения")
    private String message;

    @Schema(description = "Наименование исключения")
    private String exceptionName;

}
