package pe.edu.galaxy.training.java.library.architecture.arq.api.dto;


public enum CodeResponseDto {
    ERROR(1, "Error"),
    INFO(2, "Info"),
    SUCCESS(3, "Success"),
    WARNING(4, "Warning");

    private final Integer id;
    private final String  description;

    CodeResponseDto(Integer id, String description) {
        this.id = id;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }
}
