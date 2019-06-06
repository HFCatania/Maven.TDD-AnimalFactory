package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class AnimalFactoryTest {
    //TODO - Create Test for `Animal createDog(String name, Date birthDate)`
    //TODO - Create Test for `Animal createCat(String name, Date birthDate)`
    @Test
    public void dogTest() {
        Dog dog = AnimalFactory.createDog("fido", new Date(666));
        String expectedName = "fido";
        String expectedBirthDate = new Date(666).toString();

        String actualName = dog.getName();
        String actualBirthDate = dog.getBirthDate().toString();

        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedName, actualName);
    }
    @Test
    public void catTest(){
        Cat cat = AnimalFactory.createCat("meowth", new Date(666));
        String expectedName = "meowth";
        String expectedBirthDate = new Date(666).toString();

        String actualName = cat.getName();
        String actualBirthDate = cat.getBirthDate().toString();

        Assert.assertEquals(expectedBirthDate, actualBirthDate);
        Assert.assertEquals(expectedName, actualName);
        }

    }

