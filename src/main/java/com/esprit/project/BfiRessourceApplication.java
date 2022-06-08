package com.esprit.project;

import org.springframework.boot.CommandLineRunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
//import com.esprit.project.entity.*;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

import com.esprit.project.entity.Compte;
import com.esprit.project.repository.*;

@EnableAuthorizationServer
@SpringBootApplication
public class BfiRessourceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BfiRessourceApplication.class, args);
	}
	   /*PasswordEncoder passwordEncoder(){
	      return new BCryptPasswordEncoder();

	   }*/
	   /*@Bean
	   public CorsFilter corsFilter(){
	      CorsConfiguration corsConfiguration =new CorsConfiguration();
	      corsConfiguration.setAllowCredentials(true);
	      corsConfiguration.setAllowedOrigins(Arrays.asList("http://localhost:4200"));
	      corsConfiguration.setAllowedHeaders(Arrays.asList("Origin", "Access-Control-Allow-Origin", "Content-type",
	            "Accept","Authorization", "Origin, Accept", "X-Requested-With",
	            "Access-Control-Request-Method", "Access-Control-Request-Headers"));
	      corsConfiguration.setExposedHeaders(Arrays.asList("Origin", "Content-type", "Accept","Authorization",
	            "Access-Control-Allow-Origin","Access-Control-Allow-Origin", "Access-Control-Allow-Credentials"));
	      corsConfiguration.setAllowedMethods(Arrays.asList("GET","POST","PUT","DELETE","OPTIONS"));
	      UrlBasedCorsConfigurationSource urlBasedCorsConfigurationSource = new UrlBasedCorsConfigurationSource();
	      urlBasedCorsConfigurationSource.registerCorsConfiguration("/**",corsConfiguration);
	      return new CorsFilter(urlBasedCorsConfigurationSource);


	   }*/

	   /*@Bean
	   CommandLineRunner start(CompteRepository compteRepository) {
	      return args -> {
	    	  
	         Compte c1 = compteRepository.save(new Compte(null,"NUM_1123115","Compte epargne","1511321131615610",20000L,12000L));
	         Compte c2 = compteRepository.save(new Compte(null,"NUM_2111899","Compte epargne","1511321131615610",100000L,8800L));
	         Compte c3 = compteRepository.save(new Compte(null,"NUM_5615161","Compte cheque","1511321131615610",2000L,-2500L));


	         /*PersonnePhysique pp1 = personnePhysiqueRepository.save(new PersonnePhysique(25,"celibataire","samir","raoudha","jerba"));
	         PersonnePhysique pp2 = personnePhysiqueRepository.save(new PersonnePhysique(20,"celibataire","mohammed","ameni","kelibia"));
	         //PersonnePhysique pp3 =personnePhysiqueRepository.save(new PersonnePhysique(null,))
	         //Tiers pp3 = tiersRepository.save(new PersonnePhysique())

	         appUserService.saveUser(new AppUser(null,"souhail","souhail001","1234",new ArrayList<>()));
	         appUserService.saveUser(new AppUser(null,"mohammed","med007","1234",new ArrayList<>()));
	         appUserService.saveUser(new AppUser(null,"amine","amuneTwil02","1234",new ArrayList<>()));
	         appUserService.saveUser(new AppUser(null,"khaled","groomftw","1234",new ArrayList<>()));

	         appUserService.saveRole(new AppRole(null,"ROLE_USER"));
	         appUserService.saveRole(new AppRole(null,"ROLE_ADMIN"));
	         appUserService.saveRole(new AppRole(null,"ROLE_MANAGER"));
	         appUserService.saveRole(new AppRole(null,"ROLE_SUPER_ADMIN"));

	         appUserService.addRoleToUser("souhail001", "ROLE_ADMIN");
	         appUserService.addRoleToUser("amuneTwil02","ROLE_USER");
	         appUserService.addRoleToUser("groomftw","ROLE_MANAGER");
	         appUserService.addRoleToUser("med007","ROLE_USER");
	         appUserService.addRoleToUser("med007","ROLE_ADMIN");
	         appUserService.addRoleToUser("med007","ROLE_MANAGER");




*/




	     // };
	 //  }
	}
