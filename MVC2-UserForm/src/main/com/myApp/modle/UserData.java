package main.com.myApp.modle;

import java.util.List;

public class UserData {
    private String name;
    private String password;
    private String country;
    private String proLang;
    private List<String> operatingSystem;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProLang() {
        return proLang;
    }

    public void setProLang(String proLang) {
        this.proLang = proLang;
    }

    public List<String> getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(List<String> operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
}
