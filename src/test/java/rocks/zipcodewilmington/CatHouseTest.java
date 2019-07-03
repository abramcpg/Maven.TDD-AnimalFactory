package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.animal_storage.CatHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
*/
public class CatHouseTest {
    @Before
    public void setUp(){
        CatHouse house = new CatHouse();
        Cat cat = new Cat("", new Date(),1);
    }
    @After
    public void tearDown(){
        CatHouse house = null;
        Cat cat = null;
    }

    // TODO - Create tests for `void add(Cat cat)`
    @Test
    public void add(){
        CatHouse house = new CatHouse();
        Cat cat = new Cat("", new Date(),1);
        Cat expected = cat;
        house.add(cat);
        Cat actual = CatHouse.getCatById(1);
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void remove(){
        CatHouse house = new CatHouse();
        Cat cat = new Cat("", new Date(),1);
        int expected =0;
        CatHouse.add(cat);
        house.remove(1);

        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Cat cat)`
    @Test
    public void voidRemove(){
        CatHouse house = new CatHouse();
        Cat cat = new Cat("", new Date(),1);
        int expected = 0;
        CatHouse.add(cat);
        house.remove(cat);

        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `Cat getCatById(Integer id)`
    @Test
    public void getCatById(){
        Cat cat = new Cat("", new Date(), 1);
        Cat expected = cat;
        CatHouse.add(cat);
        Cat actual = CatHouse.getCatById(1);
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfCats()`
    @Test
    public void getNumberOfCats(){
        CatHouse house = new CatHouse();
        Cat cat = new Cat("", new Date(),1);
        int expected = 1;
        CatHouse.add(cat);
        int actual = CatHouse.getNumberOfCats();
        Assert.assertEquals(expected, actual);
    }
}

