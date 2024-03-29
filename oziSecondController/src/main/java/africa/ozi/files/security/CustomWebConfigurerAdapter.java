package africa.ozi.files.security;

import africa.ozi.files.filter.JWTAuthenticationFilter;
import africa.ozi.files.filter.JWTAuthorizationFilter;
import africa.ozi.files.security.facebook.FacebookConnectionSignup;
import africa.ozi.files.security.facebook.FacebookSignInAdapter;
import africa.ozi.files.services.AUserDetailServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.social.connect.ConnectionFactoryLocator;
import org.springframework.social.connect.UsersConnectionRepository;
import org.springframework.social.connect.mem.InMemoryUsersConnectionRepository;
import org.springframework.social.connect.support.ConnectionFactoryRegistry;
import org.springframework.social.connect.web.ProviderSignInController;
import org.springframework.social.facebook.connect.FacebookConnectionFactory;

@Configuration
@EnableWebSecurity
public class CustomWebConfigurerAdapter extends WebSecurityConfigurerAdapter {

    @Autowired
    private FacebookConnectionSignup facebookConnectionSignup;

    @Autowired
    AUserDetailServiceImpl myUserDetailsService;

//    @Value("${spring.social.facebook.appSecret}")
//    String appSecret;
//    @Value("{spring.social.facebook.appId}")
//    String appId;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(myUserDetailsService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception{
        http
                .csrf().disable()
                .authorizeRequests()
                .antMatchers(HttpMethod.POST).permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .addFilter(new JWTAuthenticationFilter(authenticationManager()))
                .addFilter(new JWTAuthorizationFilter(authenticationManager()))
                .exceptionHandling()
                .and()
                .sessionManagement()
                .sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    }

//    @Bean
//    public ProviderSignInController providerSignInController(){
//        ConnectionFactoryLocator connectionFactoryLocator=
//                connectionFactoryLocator();
//        UsersConnectionRepository usersConnectionRepository =
//                getUsersConnectionRepository(connectionFactoryLocator);
//        ((InMemoryUsersConnectionRepository) usersConnectionRepository)
//                .setConnectionSignUp(facebookConnectionSignup);
//        return new ProviderSignInController(connectionFactoryLocator,
//                usersConnectionRepository, new FacebookSignInAdapter());
//
//    }

//    private ConnectionFactoryLocator connectionFactoryLocator(){
//        ConnectionFactoryRegistry registry = new ConnectionFactoryRegistry();
//        registry.addConnectionFactory(new FacebookConnectionFactory(appId
//        ,appSecret));
//        return registry;
//    }

//    private UsersConnectionRepository getUsersConnectionRepository(ConnectionFactoryLocator connectionFactoryLocator){
//        return new InMemoryUsersConnectionRepository(connectionFactoryLocator);
//    }
//    @Bean
//    public AuthenticationProvider authenticationProvider(){
//        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//        provider.setUserDetailsService(myUserDetailsService);
//        provider.setPasswordEncoder(new BCryptPasswordEncoder());
//        return provider;
//    }
}
