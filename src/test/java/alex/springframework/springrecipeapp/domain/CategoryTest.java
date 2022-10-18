package alex.springframework.springrecipeapp.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CategoryTest {

    Category category;

    @BeforeEach
    public void setUp() {
        category = new Category();
    }

    @Test
    void getId() {
        Long expected = 4L;
        category.setId(expected);
        assertEquals(category.getId(), expected);
    }

    @Test
    void getDescription() {
    }

    @Test
    void getRecipes() {
    }
}