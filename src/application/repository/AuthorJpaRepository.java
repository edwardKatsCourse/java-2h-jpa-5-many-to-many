package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.Author;

public interface AuthorJpaRepository extends JpaRepository<Author, Long>{

    Author findByName(String name);
    boolean existsByName(String name);
    void deleteByName(String name);

}
