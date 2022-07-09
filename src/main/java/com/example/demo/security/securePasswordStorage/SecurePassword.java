//package com.example.demo.security.securePasswordStorage;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import javax.sql.DataSource;
//
//
//
//@EnableWebSecurity
//public class SecurePassword extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    DataSource dataSource;
//
//    @Autowired
//    BCryptPasswordEncoder encoder;
//
//    @Autowired
//    public void ConfigureGlobal(AuthenticationManagerBuilder auth)throws Exception{
//        auth.jdbcAuthentication().dataSource(dataSource)
//                .usersByUsernameQuery("select username,password,enabled from users where username=?")
//                .authoritiesByUsernameQuery("select username,role from user_role where username=?");
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.httpBasic().and()
//                .authorizeRequests()
//                .antMatchers("/customer")
//                .permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .csrf().disable();
//    }
//}
