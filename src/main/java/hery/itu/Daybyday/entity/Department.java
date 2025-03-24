package hery.itu.Daybyday.entity;


public class Department {
    private int id;
    private String external_id;
    private String name;
    private String description;
    private String created_at;
    private String updated_at;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getExternal_id() {
        return external_id;
    }
    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
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