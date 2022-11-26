package src.main.java.com.domain.valueobject;

public class VeterinarioVO {

    private String registroNacional;
    private Boolean certificadoSanitario;

    public String getRegistroNacional() {
        return registroNacional;
    }

    public void setRegistroNacional(String registroNacional) {
        this.registroNacional = registroNacional;
    }

    public Boolean getCertificadoSanitario() {
        return certificadoSanitario;
    }

    public void setCertificadoSanitario(Boolean certificadoSanitario) {
        this.certificadoSanitario = certificadoSanitario;
    }
}
