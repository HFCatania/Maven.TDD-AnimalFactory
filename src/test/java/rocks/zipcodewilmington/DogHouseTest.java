package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    // TODO - Create tests for `void add(Dog dog)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Dog dog)`
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {

        String name = "eddie";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();
        DogHouse.add(animal);
        DogHouse.getNumberOfDogs();
    }


    @Test
    public void addDogTest() {
        Dog expected = new Dog(null, null, 5);
        DogHouse house = new DogHouse();
        house.clear();
        house.add(expected);
        Dog actual = DogHouse.getDogById(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatTest(){
        Dog expected = null;
        Dog dog = new Dog(null, null, 5);
        DogHouse house = new DogHouse();
        house.clear();
        house.add(dog);
        house.remove(dog);
        Dog actual = house.getDogById(5);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatByIDTest(){
        Dog expected = null;
        Dog dog = new Dog(null, null, 5);
        DogHouse house = new DogHouse();
        house.clear();
        house.add(dog);
        house.remove(5);
        Dog actual = house.getDogById(5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIDTest(){
        Dog expected = new Dog(null, null, 5);
        DogHouse house = new DogHouse();
        house.clear();
        house.add(expected);
        Dog actual = house.getDogById(5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        Integer expected = 4;
        DogHouse house = new DogHouse();
        house.clear();
        house.add(new Dog(null, null, 4));
        house.add(new Dog(null, null, 5));
        house.add(new Dog(null, null, 6));
        house.add(new Dog(null, null, 7));
        Integer actual = house.getNumberOfDogs();

        Assert.assertEquals(expected, actual);
    }

}
