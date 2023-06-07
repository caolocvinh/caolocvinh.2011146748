package caolocvinh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import caolocvinh.entity.Book;
@Repository
public interface IBookRepository extends JpaRepository<Book, Long> {
}
