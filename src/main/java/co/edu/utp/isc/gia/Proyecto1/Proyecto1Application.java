package co.edu.utp.isc.gia.Proyecto1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("hola")
@SpringBootApplication
public class Proyecto1Application {

	public static void main(String[] args) {
		SpringApplication.run(Proyecto1Application.class, args);
	}

	@GetMapping("get/{nombre}/{apellido}")
	public String holaMundo(@PathVariable("nombre") String nombre, @PathVariable("apellido") String apellido ){
		return String.format("Hola %s %s", nombre, apellido);
	}

	@GetMapping("param")
	public String holaMundo(@RequestParam String nombre){
		return String.format("Hola %s", nombre);
	}
}
