package hery.itu.Daybyday.entity;

public class Absence {
    private int id;
    private int userId;
    private String startAt;
    private String endAt;
    private User user;
    
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getStartAt() {
        return startAt;
    }
    public void setStartAt(String startAt) {
        this.startAt = startAt;
    }
    public String getEndAt() {
        return endAt;
    }
    public void setEndAt(String endAt) {
        this.endAt = endAt;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    // Getters et setters
}