package rocks.zipcodewilmington;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.animal_creation.AnimalFactory;
import rocks.zipcodewilmington.animals.animal_storage.DogHouse;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogHouseTest {
    @Before
    public void setUp(){
        DogHouse house = new DogHouse();
        Dog dog = new Dog("", new Date(),1);
    }
    @After
    public void tearDown(){
        DogHouse house = null;
        Dog dog = null;
    }


    // TODO - Create tests for `void add(Dog dog)`
    @Test
    public void add(){
        DogHouse house = new DogHouse();
        Dog dog = new Dog("", new Date(),1);
        Dog expected = dog;
        house.add(dog);
        Dog actual = DogHouse.getDogById(1);
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void remove(Integer id)`
    @Test
    public void remove(){
        DogHouse house = new DogHouse();
        Dog dog = new Dog("", new Date(),1);
        int expected =0;
        DogHouse.add(dog);
        house.remove(1);

        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `void remove(Dog dog)`
    @Test
    public void voidRemove(){
        DogHouse house = new DogHouse();
        Dog dog = new Dog("", new Date(),1);
        int expected = 0;
        DogHouse.add(dog);
        house.remove(dog);

        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);

    }
    // TODO - Create tests for `Dog getDogById(Integer id)`
    @Test
    public void getDogById(){
        Dog dog = new Dog("", new Date(), 1);
        Dog expected = dog;
        DogHouse.add(dog);
        Dog actual = DogHouse.getDogById(1);
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `Integer getNumberOfDogs()`
    @Test
    public void getNumberOfDogs(){
        DogHouse house = new DogHouse();
        Dog dog = new Dog("", new Date(),1);
        int expected = 1;
        DogHouse.add(dog);
        int actual = DogHouse.getNumberOfDogs();
        Assert.assertEquals(expected, actual);
    }

}
