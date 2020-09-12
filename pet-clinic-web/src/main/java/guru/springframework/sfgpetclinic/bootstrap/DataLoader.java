package guru.springframework.sfgpetclinic.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.Vet;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.VetService;
import guru.springframework.sfgpetclinic.services.map.OwnerServiceMap;
import guru.springframework.sfgpetclinic.services.map.VetServiceMap;

@Component
public class DataLoader implements CommandLineRunner{
	
	private final OwnerService ownerService; 
	private final VetService vetService; 
	
	public DataLoader() {
		ownerService = new OwnerServiceMap();
		vetService = new VetServiceMap(); 
	}

	@Override
	public void run(String... args) throws Exception {
		
		 	Owner owner1 = new Owner();
		 	owner1.setId(1L);
	        owner1.setFirstName("Michael");
	        owner1.setLastName("Weston");
//	        owner1.setAddress("123 Brickerel");
//	        owner1.setCity("Miami");
//	        owner1.setTelephone("1231231234");

//	        Pet mikesPet = new Pet();
//	        mikesPet.setPetType(savedDogPetType);
//	        mikesPet.setOwner(owner1);
//	        mikesPet.setBirthDate(LocalDate.now());
//	        mikesPet.setName("Rosco");
//	        owner1.getPets().add(mikesPet);
//
	        ownerService.save(owner1);

	        Owner owner2 = new Owner();
	        owner2.setId(2L);
	        owner2.setFirstName("Fiona");
	        owner2.setLastName("Glenanne");
//	        owner2.setAddress("123 Brickerel");
//	        owner2.setCity("Miami");
//	        owner2.setTelephone("1231231234");

//	        Pet fionasCat = new Pet();
//	        fionasCat.setName("Just Cat");
//	        fionasCat.setOwner(owner2);
//	        fionasCat.setBirthDate(LocalDate.now());
//	        fionasCat.setPetType(savedCatPetType);
//	        owner2.getPets().add(fionasCat);
//
	        ownerService.save(owner2);

//	        Visit catVisit = new Visit();
//	        catVisit.setPet(fionasCat);
//	        catVisit.setDate(LocalDate.now());
//	        catVisit.setDescription("Sneezy Kitty");
//
//	        visitService.save(catVisit);

	        System.out.println("Loaded Owners....");

	        Vet vet1 = new Vet();
	        vet1.setId(1L);
	        vet1.setFirstName("Sam");
	        vet1.setLastName("Axe");
//	        vet1.getSpecialities().add(savedRadiology);
//
	        vetService.save(vet1);

	        Vet vet2 = new Vet();
	        vet2.setId(2L);
	        vet2.setFirstName("Jessie");
	        vet2.setLastName("Porter");
//	        vet2.getSpecialities().add(savedSurgery);

	        vetService.save(vet2);

	        System.out.println("Loaded Vets....");
	}

	
}