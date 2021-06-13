package com.javabill0cypher.patterns.responsibilitieschain;

public class Principal {
    private String username;
    private String password;
    private UserRole role;
    private String requestedResource;

    public Principal(String username, String password, UserRole role, String requestedResource) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.requestedResource = requestedResource;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public String getRequestedResource() {
        return requestedResource;
    }

    public void setRequestedResource(String requestedResource) {
        this.requestedResource = requestedResource;
    }
}
