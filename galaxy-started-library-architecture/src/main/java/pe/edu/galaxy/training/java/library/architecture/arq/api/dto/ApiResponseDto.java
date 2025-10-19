package pe.edu.galaxy.training.java.library.architecture.arq.api.dto;

public record ApiResponseDto(
        CodeResponseDto code,
        String message,
        String dateTime,
        Object data
) {
}
