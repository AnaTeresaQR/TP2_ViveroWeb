package objectModel;


public class ConsultModel {

    private String completeName;
    private String email;
    private String message;

    public ConsultModel() {
    }

    public String getCompleteName() {
        return completeName;
    }

    public void setCompleteName(String completeName) {
        this.completeName = completeName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "ConsultModel{" + "completeName=" + completeName + ", email=" + email + ", message=" + message + '}';
    }

}
