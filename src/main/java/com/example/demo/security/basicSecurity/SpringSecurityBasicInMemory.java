//package com.example.demo.security.basicSecurity;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
//
//@EnableWebSecurity
//public class SpringSecurityBasicInMemory extends WebSecurityConfigurerAdapter {
//
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
//        auth.inMemoryAuthentication()
//                .withUser("sam").password("{noop}sam@123").roles("CUSTOMER")
//                .and()
//                .withUser("pat").password("{noop}pat@123").roles("ADMIN");
//    }
//
////    @Override
////    protected void configure(HttpSecurity http) throws Exception {
////        http.authorizeRequests()
////                .antMatchers("/**")
////                .hasAnyRole("CUSTOMER","ADMIN")
////                .anyRequest().authenticated()
////                .and().httpBasic();
////    }
//    /*
//    Restricting url access
//     */
//        @Override
//        protected void configure(HttpSecurity http) throws Exception {
//            http.authorizeRequests()
//                    .antMatchers("/customer/**").permitAll()
//                    .antMatchers("/insert").permitAll()
//                    .antMatchers("/get").permitAll()
//                    .antMatchers("/delete").hasRole("ADMIN")
//                    .antMatchers("/update/**").permitAll();
//
//
//        }
//}
