package application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import application.entity.Book;

public interface BookJpaRepository extends JpaRepository<Book, Long> {

    Book findByTitle(String title);
    boolean existsByTitle(String title);
    void deleteByTitle(String title);

}
