package caolocvinh.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import caolocvinh.entity.Category;
@Repository
public interface ICategoryRepository extends JpaRepository<Category, Long> {
}
