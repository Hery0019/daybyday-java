package hery.itu.Daybyday.entity;

public class Settings {
    private int id;
    private int client_number;
    private int invoice_number;
    private String country;
    private String company;
    private String currency;
    private int vat;
    private int max_users;
    private String language;
    private String created_at;
    private String updated_at;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getClient_number() {
        return client_number;
    }
    public void setClient_number(int client_number) {
        this.client_number = client_number;
    }
    public int getInvoice_number() {
        return invoice_number;
    }
    public void setInvoice_number(int invoice_number) {
        this.invoice_number = invoice_number;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getCurrency() {
        return currency;
    }
    public void setCurrency(String currency) {
        this.currency = currency;
    }
    public int getVat() {
        return vat;
    }
    public void setVat(int vat) {
        this.vat = vat;
    }
    public int getMax_users() {
        return max_users;
    }
    public void setMax_users(int max_users) {
        this.max_users = max_users;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getCreated_at() {
        return created_at;
    }
    public void setCreated_at(String created_at) {
        this.created_at = created_at;
    }
    public String getUpdated_at() {
        return updated_at;
    }
    public void setUpdated_at(String updated_at) {
        this.updated_at = updated_at;
    }

    // Getters et setters
}