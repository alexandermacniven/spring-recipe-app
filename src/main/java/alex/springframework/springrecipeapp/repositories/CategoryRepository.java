package alex.springframework.springrecipeapp.repositories;

import alex.springframework.springrecipeapp.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
