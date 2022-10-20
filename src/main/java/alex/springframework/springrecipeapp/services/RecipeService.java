package alex.springframework.springrecipeapp.services;

import alex.springframework.springrecipeapp.commands.RecipeCommand;
import alex.springframework.springrecipeapp.domain.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.Set;

public interface RecipeService {

    Set<Recipe> getRecipes();

    Recipe findById(Long id);

    RecipeCommand saveRecipeCommand(RecipeCommand command);

    RecipeCommand findCommandById(Long id);
}
