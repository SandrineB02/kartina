// package fr.kartina.backend.configuration;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.security.web.DefaultSecurityFilterChain;


// @Configuration
// @EnableWebSecurity
// public class KartinaSecurity {

//     @Bean
//     public DefaultSecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{
//      http
//     .authorizeHttpRequests()
//     .requestMatchers("/")
//     .permitAll();
//     return http.build();
//     }
//     @Bean
//     public static BCryptPasswordEncoder passwordEncoder(){
//         return new BCryptPasswordEncoder();
//     }
// }

