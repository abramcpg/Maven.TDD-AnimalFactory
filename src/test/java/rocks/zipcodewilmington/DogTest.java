package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Dog;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class DogTest {
    // TODO - Create tests for `void setName(String name)`
    String name = "Tom";
    Date birthDay = new Date("06/06/06");
    int id = 0;
    Dog dog = new Dog(name,birthDay,id);

    @Test
    public void setName(){
        String expected = "Tom";
        String actual = dog.getName();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        //Given
        dog.speak();
        //When
        System.out.println(dog.speak());
        //Then
        Assert.assertEquals("bark!", dog.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDay(){
        Date expected = new Date("06/06/06");
        Date actual = dog.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eat(){
        int before = dog.getNumberOfMealsEaten();
        dog.eat(new Food());
        int after = dog.getNumberOfMealsEaten();
        Assert.assertEquals(before +1, after);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getId(){
        int expected = 0;
        int actual = dog.getId();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfAnimal(){
        Assert.assertEquals(dog instanceof Animal, true);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfMammal(){
        Assert.assertEquals(dog instanceof Mammal, true);
    }

    @Test
    public void constructorTest() {
        // Given (dog data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a dog is constructed)
        Dog dog = new Dog(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the dog)
        String retrievedName = dog.getName();
        Date retrievedBirthDate = dog.getBirthDate();
        Integer retrievedId = dog.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}

