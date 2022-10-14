package alex.springframework.springrecipeapp.controllers;

import alex.springframework.springrecipeapp.domain.Category;
import alex.springframework.springrecipeapp.domain.UnitOfMeasure;
import alex.springframework.springrecipeapp.repositories.CategoryRepository;
import alex.springframework.springrecipeapp.repositories.UnitOfMeasureRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Optional;

@Controller
public class IndexController {

    private CategoryRepository categoryRepository;
    private UnitOfMeasureRepository unitOfMeasureRepository;

    public IndexController(CategoryRepository categoryRepository, UnitOfMeasureRepository unitOfMeasureRepository) {
        this.categoryRepository = categoryRepository;
        this.unitOfMeasureRepository = unitOfMeasureRepository;
    }


    @RequestMapping({"", "/", "/index"})
    public String getIndexPage() {
        Optional<Category> categoryOptional = categoryRepository.findByDescription("American");
        Optional<UnitOfMeasure> unitOfMeasureOptional = unitOfMeasureRepository.findByUnit("Teaspoon");

        System.out.println("cat id is: " + categoryOptional.get().getId());
        System.out.println("unit of measure id is: " + unitOfMeasureOptional.get().getId());

        return "index";
    }
}
