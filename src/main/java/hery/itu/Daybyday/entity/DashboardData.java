package hery.itu.Daybyday.entity;


import java.util.List;
import java.util.Map;

public class DashboardData {
    private List<User> users;
    private Map<String, Map<String, Map<String, Integer>>> datasheet;
    private int totalTasks;
    private int totalLeads;
    private int totalProjects;
    private int totalClients;
    private Settings settings;
    private List<Absence> absencesToday;

    // Getters et setters

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public Map<String, Map<String, Map<String, Integer>>> getDatasheet() {
        return datasheet;
    }

    public void setDatasheet(Map<String, Map<String, Map<String, Integer>>> datasheet) {
        this.datasheet = datasheet;
    }

    public int getTotalTasks() {
        return totalTasks;
    }

    public void setTotalTasks(int totalTasks) {
        this.totalTasks = totalTasks;
    }

    public int getTotalLeads() {
        return totalLeads;
    }

    public void setTotalLeads(int totalLeads) {
        this.totalLeads = totalLeads;
    }

    public int getTotalProjects() {
        return totalProjects;
    }

    public void setTotalProjects(int totalProjects) {
        this.totalProjects = totalProjects;
    }

    public int getTotalClients() {
        return totalClients;
    }

    public void setTotalClients(int totalClients) {
        this.totalClients = totalClients;
    }

    public Settings getSettings() {
        return settings;
    }

    public void setSettings(Settings settings) {
        this.settings = settings;
    }

    public List<Absence> getAbsencesToday() {
        return absencesToday;
    }

    public void setAbsencesToday(List<Absence> absencesToday) {
        this.absencesToday = absencesToday;
    }
}