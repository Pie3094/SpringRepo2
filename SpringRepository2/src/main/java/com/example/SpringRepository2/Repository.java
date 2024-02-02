package com.example.SpringRepository2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-languages", collectionResourceDescription = @Description("Descrizione della classe"))
public interface Repository extends JpaRepository<ProgrammingLanguage, Long> {
}
