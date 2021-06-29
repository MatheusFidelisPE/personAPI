package one.digitalinnovation.personapi.utils;

import one.digitalinnovation.personApi.dto.request.PersonDTO;
import one.digitalinnovation.personApi.entity.Person;

import java.time.LocalDate;
import java.util.Collections;

public class PersonUtils {

    private static final String FIRST_NAME = "Matheus";
    private static final String LAST_NAME = "Fidelis";
    private static final String CPF_NUMBER = "123.456.789-10";
    private static final long PERSON_ID = 1L;
    public static final LocalDate BIRTH_DATE = LocalDate.of(2000, 10, 10);

    public static PersonDTO createFakeDTO() {
        return PersonDTO.builder()
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate("10-10-2000")
                .phones(Collections.singletonList(one.digitalinnovation.personapi.utils.PhoneUtils.createFakeDTO()))
                .build();
    }

    public static Person createFakeEntity() {
        return Person.builder()
                .id(PERSON_ID)
                .firstName(FIRST_NAME)
                .lastName(LAST_NAME)
                .cpf(CPF_NUMBER)
                .birthDate(BIRTH_DATE)
                .phones(Collections.singletonList(one.digitalinnovation.personapi.utils.PhoneUtils.createFakeEntity()))
                .build();
    }
}
