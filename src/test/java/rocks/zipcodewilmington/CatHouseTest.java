package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

/**
 * @author leon on 4/19/18.
 */
public class CatHouseTest {
    // TODO - Create tests for `void add(Cat cat)`
    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
    private Cat cat;
    @Before
    public void setUp(){ cat = new Cat(null, null, 5);
    }

    @Test
    public void addCatTest() {
        Cat expected = new Cat("meowth", null, 5);
        CatHouse house = new CatHouse();
        house.clear();
        house.add(expected);
        Cat actual = house.getCatById(5);
        Assert.assertEquals(expected, actual);
    }



    @Test
    public void removeCatTest(){
        Cat expected = null;
        CatHouse house = new CatHouse();
        house.clear();
        house.add(cat);
        house.remove(2);
        Cat actual = house.getCatById(2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void removeCatByIDTest(){
        Cat expected = null;
        Cat cat = new Cat("meowth", null, 5);
        CatHouse house = new CatHouse();
        house.clear();
        house.add(cat);
        house.remove(5);
        Cat actual = house.getCatById(5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getCatByIDTest(){
        Cat expected = new Cat("meowth", null, 5);
        CatHouse house = new CatHouse();
        house.clear();
        house.add(expected);
        Cat actual = house.getCatById(5);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getNumberOfCatsTest(){
        Integer expected = 4;
        CatHouse house = new CatHouse();
        house.clear();
        house.add(new Cat(null, null, 3));
        house.add(new Cat(null, null, 4));
        house.add(new Cat(null, null, 5));
        house.add(new Cat(null, null, 6));
        Integer actual = house.getNumberOfCats();

        Assert.assertEquals(expected, actual);
    }
}
