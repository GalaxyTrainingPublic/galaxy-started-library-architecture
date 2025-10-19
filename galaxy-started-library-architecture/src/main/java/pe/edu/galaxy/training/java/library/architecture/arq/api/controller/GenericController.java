package pe.edu.galaxy.training.java.library.architecture.arq.api.controller;

import org.springframework.http.ResponseEntity;
import pe.edu.galaxy.training.java.library.architecture.arq.api.dto.ApiResponseDto;
import pe.edu.galaxy.training.java.library.architecture.arq.api.dto.CodeResponseDto;
import pe.edu.galaxy.training.java.library.architecture.arq.util.FactoryUtil;
import pe.edu.galaxy.training.java.library.utils.date.DateUtilWrapper;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public abstract class GenericController {

    private final FactoryUtil factoryUtil;

    protected GenericController(FactoryUtil factoryUtil) {
        this.factoryUtil = factoryUtil;
    }


    protected  <T> ResponseEntity<ApiResponseDto> getResponse(T data){
        return Optional.ofNullable(data).map(o -> ResponseEntity.ok(getData(o))).orElseGet(() -> ResponseEntity.noContent().build());
    }

    protected ResponseEntity<ApiResponseDto> getResponse(List<?> optData){
        return optData.isEmpty()?
            ResponseEntity.noContent().build():
            ResponseEntity.ok(getData(optData));

    }

    private ApiResponseDto getData(Object data){
        String MSG_SUCCESS = "Successful response";
        return new ApiResponseDto(
                CodeResponseDto.SUCCESS,
                MSG_SUCCESS,
                factoryUtil.dateUtilWrapper().format(LocalDateTime.now()),
                data
        );
    }
}
