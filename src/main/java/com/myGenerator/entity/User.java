package com.myGenerator.entity;

import java.io.Serializable;

public class User implements Serializable {
    /**
     * 
     */
    private Long id;

    /**
     * 
     */
    private Long version;

    /**
     * 
     */
    private Boolean enabled;

    /**
     * 
     */
    private String password;

    /**
     * 
     */
    private String socialRole;

    /**
     * 
     */
    private String username;

    /**
     * 
     */
    private Boolean accountExpired;

    /**
     * 
     */
    private Boolean accountLocked;

    /**
     * 
     */
    private Boolean passwordExpired;

    /**
     * 
     */
    private String sex;

    /**
     * 
     */
    private String phoneNumber;

    /**
     * 
     */
    private String name;

    /**
     * 密码
     */
    private String passwd;

    /**
     * 
     */
    private String token;

    /**
     * 
     */
    private String portrait;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSocialRole() {
        return socialRole;
    }

    public void setSocialRole(String socialRole) {
        this.socialRole = socialRole == null ? null : socialRole.trim();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public Boolean getAccountExpired() {
        return accountExpired;
    }

    public void setAccountExpired(Boolean accountExpired) {
        this.accountExpired = accountExpired;
    }

    public Boolean getAccountLocked() {
        return accountLocked;
    }

    public void setAccountLocked(Boolean accountLocked) {
        this.accountLocked = accountLocked;
    }

    public Boolean getPasswordExpired() {
        return passwordExpired;
    }

    public void setPasswordExpired(Boolean passwordExpired) {
        this.passwordExpired = passwordExpired;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber == null ? null : phoneNumber.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd == null ? null : passwd.trim();
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token == null ? null : token.trim();
    }

    public String getPortrait() {
        return portrait;
    }

    public void setPortrait(String portrait) {
        this.portrait = portrait == null ? null : portrait.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", version=").append(version);
        sb.append(", enabled=").append(enabled);
        sb.append(", password=").append(password);
        sb.append(", socialRole=").append(socialRole);
        sb.append(", username=").append(username);
        sb.append(", accountExpired=").append(accountExpired);
        sb.append(", accountLocked=").append(accountLocked);
        sb.append(", passwordExpired=").append(passwordExpired);
        sb.append(", sex=").append(sex);
        sb.append(", phoneNumber=").append(phoneNumber);
        sb.append(", name=").append(name);
        sb.append(", passwd=").append(passwd);
        sb.append(", token=").append(token);
        sb.append(", portrait=").append(portrait);
        sb.append("]");
        return sb.toString();
    }
}