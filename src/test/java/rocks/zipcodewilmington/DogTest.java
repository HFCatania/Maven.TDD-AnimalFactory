package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `new Dog(String name, Date birthDate, Integer id)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`

    private Dog dog;
    @Before
    public void setUp(){ dog = new Dog(null, null, null);
    }

    @Test
    public void setNameTest() {
        // Given (a name exists and a dog exists)
        String givenName = "Milo";

        // When (a dog's name is set to the given name)
        dog.setName(givenName);

        // Then (we expect to get the given name from the dog)
        String dogName = dog.getName();
        Assert.assertEquals(dogName, givenName);
    }

    @Test
    public void setBirthDateTest(){
        Date expected = new Date();
        dog.setBirthDate(expected);
        Date actual = dog.getBirthDate();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void speakTest(){
        String expected = "bark!";
        String actual = dog.speak();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void eatFoodTest(){
        Integer expected = dog.getNumberOfMealsEaten();
        dog.eat(new Food());
        Integer actual = dog.getNumberOfMealsEaten();
        Assert.assertEquals(expected, actual );
    }

    @Test
    public void getIdTest() {
        Integer actual = null;
        Integer expected = dog.getId();
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void instanceOfTest(){
       Assert.assertTrue(dog instanceof Mammal) ;
       Assert.assertTrue(dog instanceof Animal);
    }
}
