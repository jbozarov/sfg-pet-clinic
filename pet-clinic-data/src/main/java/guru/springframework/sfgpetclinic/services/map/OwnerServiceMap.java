package guru.springframework.sfgpetclinic.services.map;

import java.util.Set;

import org.springframework.stereotype.Service;

import guru.springframework.sfgpetclinic.model.Owner;
import guru.springframework.sfgpetclinic.model.Pet;
import guru.springframework.sfgpetclinic.model.PetType;
import guru.springframework.sfgpetclinic.services.OwnerService;
import guru.springframework.sfgpetclinic.services.PetService;
import guru.springframework.sfgpetclinic.services.PetTypeService;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService  {

	private PetTypeService petTypeService; 
	private PetService petService; 
	
	public OwnerServiceMap(PetTypeService petTypesService, PetService petService) {
		this.petTypeService = petTypesService;
		this.petService = petService;
	}

	@Override
	public Set<Owner> findAll() {
	
		return super.findAll();
	}

	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}

	@Override
	public Owner save(Owner object) {
//		if (owner != null) {
//			if (owner.getPets() != null) {
//				owner.getPets().forEach(pet -> {
//					if (pet.getPetType() != null) {
//						if (pet.getPetType().getId() == null) {
//							pet.setPetType(petTypesService.save(pet.getPetType()));
//						}
//					} else {
//						throw new RuntimeException("Pet Type is required");
//					}
//					if (pet.getId() == null) {
//						Pet savedPet = petService.save(pet); 
//						pet.setId(savedPet.getId());
//					}
//				});
//			}
//			return super.save(owner);
//		} else {
//			return null; 
//		}
	
		if(object != null) {
		      if(object.getPets() != null) {
		        object.getPets().forEach(pet -> {
		          if(pet.getPetType() != null) {
		            if(pet.getPetType().getId() == null) {
		              pet.setPetType(petTypeService.save(pet.getPetType()));
		            }
		          }else {
		            throw new RuntimeException("Pet Type is required");
		          }

		          if(pet.getId() == null) {
		            Pet savedPet = petService.save(pet);
		            pet.setId(savedPet.getId());
		          }
		        });
		      }
		      return super.save(object);
		    }else {
		      return null;
		    }
	}

	@Override
	public void delete(Owner owner) {
		super.delete(owner);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return null;
	}
	
	
}
