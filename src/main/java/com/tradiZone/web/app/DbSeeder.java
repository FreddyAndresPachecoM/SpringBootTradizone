package com.tradiZone.web.app;

import java.util.Arrays;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.tradiZone.web.app.model.Local;
import com.tradiZone.web.app.model.Recomendacion;
import com.tradiZone.web.app.model.CategoriaComida;
import com.tradiZone.web.app.model.Comida;
import com.tradiZone.web.app.model.Cuenta;
import com.tradiZone.web.app.model.Restaurante;
import com.tradiZone.web.app.model.Usuario;
import com.tradiZone.web.app.repository.ComidaRepository;

@Component
public class DbSeeder implements CommandLineRunner{

	private ComidaRepository comidaRepository;
	
	
	
	public DbSeeder(ComidaRepository comidaRepository) {
		super();
		this.comidaRepository = comidaRepository;
	}



	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Comida chanchoHornado = new Comida("Cancho Hornado", 
				"8-10 libras de carne de chancho puede usar espaldilla, paletilla, lomo de cabeza o lomo\n"
				+ "El jugo de 3 limones", 
				"Ponga la carne de chancho en una fuente grande para marinar (asegúrese de que tendrá espacio en la refrigeradora).\n"
				+ "Vierta el jugo de limón sobre el chancho o cerdo.",
				"El hornado de chancho o cerdo es un plato tradicional Ecuatoriano de chancho asado al horno en un adobo de cerveza o chicha, ajo, comino, y achiote.", 
				true,
				30, 
				null, 
				new Restaurante("Cuchara Brava", true, "091313321233", 
						new Cuenta("Francis", "12345", true, null, 
								new Usuario("Francisco Boris", "Quezada Sarmiento", "frencis@gmail.com", "09311323211")), 
						Arrays.asList(
								new Local("Pio Bravo", "Marical Lamar", "02303233203", "531513223", true, 30, "Lunes - Viernes", "08:00 AM - 15:00 PM", null),
								new Local("Amazonas", "Unidad Nacional", "8888888888", "666666666", true, 15, "Lunes - Viernes", "09:00 AM - 16:00 PM", null)
								)
						), 
				Arrays.asList(
						new CategoriaComida("Plato Tradicional", "Lleva mucho tiempo en la ciudad de Cuenca y en el Ecuador"),
						new CategoriaComida("Plato Fuerte", "Contiene gran variedad de alimentos y llena rapido")), 
				Arrays.asList(
						new Recomendacion(4, true, "muy buen servicio")));

		Comida coladaMorada = new Comida("Colada Morada", 
				"8-10 libras de carne de chancho puede usar espaldilla, paletilla, lomo de cabeza o lomo\n"
				+ "El jugo de 3 limones", 
				"Ponga la carne de chancho en una fuente grande para marinar (asegúrese de que tendrá espacio en la refrigeradora).\n"
				+ "Vierta el jugo de limón sobre el chancho o cerdo.",
				"El hornado de chancho o cerdo es un plato tradicional Ecuatoriano de chancho asado al horno en un adobo de cerveza o chicha, ajo, comino, y achiote.", 
				true,
				5, 
				null, 
				new Restaurante("Cuchara Brava", true, "091313321233", 
						new Cuenta("Francis", "12345", true, null, 
								new Usuario("Francisco Boris", "Quezada Sarmiento", "frencis@gmail.com", "09311323211")), 
						Arrays.asList(
								new Local("Pio Bravo", "Marical Lamar", "02303233203", "531513223", true, 30, "Lunes - Viernes", "08:00 AM - 15:00 PM", null),
								new Local("Amazonas", "Unidad Nacional", "8888888888", "666666666", true, 15, "Lunes - Viernes", "09:00 AM - 16:00 PM", null)
								)
						), 
				Arrays.asList(
						new CategoriaComida("Bebida", "es para beber"),
						new CategoriaComida("Tradicional", "es tipico del pais y de la ciudad")), 
				Arrays.asList(
						new Recomendacion(5, true, "excelente servicio")));
		
		
		
		List<Comida> comidas = Arrays.asList(chanchoHornado, coladaMorada);
		this.comidaRepository.saveAll(comidas);
		
	}
	

}
