package com.infinite.spr.annotation;


import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
@ComponentScan(basePackages = "com.infinite.spr.annotation")
public class AppConfig {

  @Bean
  public EmployDaoImpl employDao(JdbcTemplate jdbcTemplate) {
    EmployDaoImpl dao = new EmployDaoImpl();
    dao.setJdbcTemplate(jdbcTemplate);   // manual injection
    return dao;
  }
  // DataSource Bean (Equivalent to <bean id="ds">)
  @Bean
  public DataSource dataSource() {
    DriverManagerDataSource ds = new DriverManagerDataSource();
    ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
    ds.setUrl("jdbc:mysql://localhost:3306/infinite26");
    ds.setUsername("root");
    ds.setPassword("root");
    return ds;
  }

  @Bean
  public JdbcTemplate jdbcTemplate(DataSource ds) {
    return new JdbcTemplate(ds);
  }
}
