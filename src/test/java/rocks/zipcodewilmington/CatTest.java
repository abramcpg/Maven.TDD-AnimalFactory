package rocks.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;
import rocks.zipcodewilmington.animals.Animal;
import rocks.zipcodewilmington.animals.Cat;
import rocks.zipcodewilmington.animals.Mammal;

import java.util.Date;

/**
 * @author leon on 4/19/18.
 */
public class CatTest {
    // TODO - Create tests for `void setName(String name)`
    String name = "Tom";
    Date birthDay = new Date("06/06/06");
    int id = 0;
    Cat cat = new Cat(name,birthDay,id);

    @Test
    public void setName(){
        String expected = "Tom";
        String actual = cat.getName();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create tests for `speak`
    @Test
    public void speakTest(){
        //Given
        cat.speak();
        //When
        System.out.println(cat.speak());
        //Then
        Assert.assertEquals("meow!", cat.speak());
    }

    // TODO - Create tests for `setBirthDate(Date birthDate)`
    @Test
    public void setBirthDay(){
        Date expected = new Date("06/06/06");
        Date actual = cat.getBirthDate();
        Assert.assertEquals(expected, actual);
    }

    // TODO - Create tests for `void eat(Food food)`
    @Test
    public void eat(){
        int before = cat.getNumberOfMealsEaten();
        cat.eat(new Food());
        int after = cat.getNumberOfMealsEaten();
        Assert.assertEquals(before +1, after);
    }
    // TODO - Create tests for `Integer getId()`
    @Test
    public void getId(){
        int expected = 0;
        int actual = cat.getId();
        Assert.assertEquals(expected, actual);
    }
    // TODO - Create test to check Animal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfAnimal(){
        Assert.assertEquals(cat instanceof Animal, true);
    }
    // TODO - Create test to check Mammal inheritance; google search `java instanceof keyword`
    @Test
    public void instanceOfMammal(){
        Assert.assertEquals(cat instanceof Mammal, true);
    }

    @Test
    public void constructorTest() {
        // Given (cat data)
        String givenName = "Zula";
        Date givenBirthDate = new Date();
        Integer givenId = 0;

        // When (a cat is constructed)
        Cat cat = new Cat(givenName, givenBirthDate, givenId);

        // When (we retrieve data from the cat)
        String retrievedName = cat.getName();
        Date retrievedBirthDate = cat.getBirthDate();
        Integer retrievedId = cat.getId();

        // Then (we expect the given data, to match the retrieved data)
        Assert.assertEquals(givenName, retrievedName);
        Assert.assertEquals(givenBirthDate, retrievedBirthDate);
        Assert.assertEquals(givenId, retrievedId);
    }

}
