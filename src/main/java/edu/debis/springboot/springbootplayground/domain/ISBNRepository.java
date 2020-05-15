package edu.debis.springboot.springbootplayground.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "isbns")
public interface ISBNRepository extends JpaRepository<ISBN, String> {
}
