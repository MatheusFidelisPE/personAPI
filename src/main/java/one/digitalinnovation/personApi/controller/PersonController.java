package one.digitalinnovation.personApi.controller;

import one.digitalinnovation.personApi.dto.request.PersonDTO;
import one.digitalinnovation.personApi.dto.response.MessageResponseDTO;
import one.digitalinnovation.personApi.entity.Person;
import one.digitalinnovation.personApi.repository.PersonRepository;
import one.digitalinnovation.personApi.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonService personService;

//    Aula 5, 6
    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    // Aula 5, 6
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public MessageResponseDTO createPerson(@RequestBody @Valid PersonDTO personDTO){
        return personService.createPerson(personDTO);
    }

    public List<PersonDTO> listAll(){
        return personService.listAll();
    }
}