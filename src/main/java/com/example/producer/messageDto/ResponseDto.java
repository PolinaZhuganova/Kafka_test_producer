package com.example.producer.messageDto;

import io.swagger.annotations.ApiModelProperty;
import lombok.*;

/**
 * Класс ResponseDto
 */
@AllArgsConstructor
@Data
public class ResponseDto {
	@ApiModelProperty(notes = "Результат выполнения операции по добавлению сообщения в топик")
	private String result;
}