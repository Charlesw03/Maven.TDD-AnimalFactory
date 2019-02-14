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
    private DogHouse dogHouse;
    private Dog dog;
    private Dog dog2;


    @Before
    public void setUp(){
        this.dogHouse = new DogHouse();
        this.dog = new Dog("lenny", new Date(25),45);
        this.dog2 = new Dog("Roxy", new Date(25),45);


    }

    @After
    public void tearDown(){

        this.dogHouse.clear();
    }

    @Test
    public void addDogTest(){
        dogHouse.add(dog);
        Integer expected = 1;
    }


    @Test
    public void  removeIdint(){
        dogHouse.remove(45);
        Integer expected = 0;
        Assert.assertEquals(expected,DogHouse.getNumberOfDogs());

    }

    @Test
    public void removeDog(){
        dogHouse.remove(dog);
        dogHouse.remove(45);
        Integer expected = 0;

        Assert.assertEquals(expected,DogHouse.getNumberOfDogs());
    }

    @Test
    public void getDogByIdTest(){
        dogHouse.add(dog);
        Assert.assertEquals(dogHouse.getDogById(45),dog);

    }
    @Test
    public void getNumberOfDogsTest(){
        dogHouse.add(dog);
        dogHouse.add(dog2);
        Integer expected= 2;

        Assert.assertEquals(expected,dogHouse.getNumberOfDogs());
    }

    // TODO - Create tests for `void add(Dog dog)` done
    // TODO - Create tests for `void remove(Integer id)`done
    // TODO - Create tests for `void remove(Dog dog)`done
    // TODO - Create tests for `Dog getDogById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfDogs()`

    @Test
    public void testGetNumberOfDogs() {
        // Given (some
        String name = "Milo";
        Date birthDate = new Date();
        Dog animal = AnimalFactory.createDog(name, birthDate);
        DogHouse.clear();

        // When
        DogHouse.add(animal);

        // Then
        DogHouse.getNumberOfDogs();
    }

    @Test
    public void addTest(){


    }


}
