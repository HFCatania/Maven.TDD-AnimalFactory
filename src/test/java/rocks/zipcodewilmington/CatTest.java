package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.security.PublicKey;
import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    // TODO - Create tests for `speak`
    // TODO - Create tests for `setBirthDate(Date birthDate)`
    // TODO - Create tests for `void eat(Food food)`
    // TODO - Create tests for `Integer getId()`
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    private Cat cat;
    @Before
    public void setUp(){ cat = new Cat(null, null, null);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }
    @Test
    public void setBirthdateTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        cat.setBirthDate(givenBirthDate);
        Date retreivedBirthDate = cat.getBirthDate();

        Assert.assertEquals(givenBirthDate, retreivedBirthDate);

    }
        @Test
    public void setterTest(){
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        cat.setName(givenName);
        cat.setBirthDate(givenBirthDate);

        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();

        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
    }

        @Test
        public void speakTest(){
        String expected = "meow!";
        Cat cat = new Cat(null, null, 25);
        String actual = cat.speak();

        Assert.assertEquals(expected, actual);
        }

        @Test
        public void eatFoodTest(){
        Integer expected = cat.getNumberOfMealsEaten();
        cat.eat(new Food());
        Integer actual = cat.getNumberOfMealsEaten();

        Assert.assertEquals(expected, actual);
        }

        @Test
        public void getIdTest(){
        Integer actual = null;
        Integer expected = cat.getId();
        Assert.assertEquals(expected, actual);

        }

        @Test
        public void instanceOfTest(){
            Assert.assertTrue(cat instanceof Mammal) ;
            Assert.assertTrue(cat instanceof Animal);
        }
}



