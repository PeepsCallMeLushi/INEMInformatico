package pt.sali.SALI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SaliApplication {

	public static void main(String[] args) {
		SpringApplication.run(SaliApplication.class, args);
		System.out.println("TINONINONINONINO");
	}
	
	// TODO REST
	// listar tudo (UTs) (inativo tb)
	// confirmar: listar by role (só ativos)
	// login REST
	
	// TODO SPRING
	// nice to have: passar estado UT para String 
	// list by role (confirmar)
}
