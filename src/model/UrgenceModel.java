package model;

public class UrgenceModel {
    private String type;
    private String chambre;
    private String declarant;

    public UrgenceModel(String type, String chambre, String declarant) {
        this.type = type;
        this.chambre = chambre;
        this.declarant = declarant;
    }

    public String getType() { return type; }
    public String getChambre() { return chambre; }
    public String getDeclarant() { return declarant; }
}
