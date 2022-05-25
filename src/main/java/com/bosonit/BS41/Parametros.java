package com.bosonit.BS41;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix="param")
public class Parametros {
    @Value("${url:default_value}")
    private String url;
    @Value("${password:default_value}")
    private String password;

    public String getUrl() {
        return url;
    }

    public String getPassword() {
        return password;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
