package hery.itu.Daybyday.entity;

import java.util.List;

public class User {
    private String external_id;
    private String name;
    private String email;
    private String address;
    private String primary_number;
    private String secondary_number;
    private String language;
    private String deleted_at;
    private String created_at;
    private String updated_at;
    private String avatar;
    private List<Department> department;
    
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPrimary_number() {
        return primary_number;
    }
    public void setPrimary_number(String primary_number) {
        this.primary_number = primary_number;
    }
    public String getSecondary_number() {
        return secondary_number;
    }
    public void setSecondary_number(String secondary_number) {
        this.secondary_number = secondary_number;
    }
    public String getLanguage() {
        return language;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public String getDeleted_at() {
        return deleted_at;
    }
    public void setDeleted_at(String deleted_at) {
        this.deleted_at = deleted_at;
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
    public String getAvatar() {
        return avatar;
    }
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public List<Department> getDepartment() {
        return department;
    }
    public void setDepartment(List<Department> department) {
        this.department = department;
    }

    // Getters et setters
}



