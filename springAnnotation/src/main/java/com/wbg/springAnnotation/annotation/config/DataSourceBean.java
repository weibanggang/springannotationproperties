package com.wbg.springAnnotation.annotation.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DataSourceBean {
    @Value("${jdbc.driver}")
    private String driver = null;
    @Value("${jdbc.url}")
    private String url = null;
    @Value("${jdbc.user}")
    private String user = null;
    @Value("${jdbc.password}")
    private String password = null;
    @Value("${log4j.appender.000}")
    private String log4j=null;
    @Override
    public String toString() {
        return "DataSourceBean{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", user='" + user + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    @Bean("dataSource")
    public String getDataSourceBean(){
        System.out.println(toString());
        System.out.println(this.log4j);
        return this.toString();
    }
}
