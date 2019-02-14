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
    private CatHouse catHouse;
    private Cat cat;
    private Cat cat2;

    @Before
    public void setup(){
        this.catHouse = new CatHouse();
        this.cat =new Cat("chuck", new Date(25),45);
        this.cat2 = new Cat("pheobe", new Date(25), 45);

    }

    @After
    public void tearDown(){
        //tear down method which is in animal warehouse
        this.catHouse.clear();

    }


    @Test
    public void addTest(){
        catHouse.add(cat);
        Integer expected = 1;

        Assert.assertEquals(expected,catHouse.getNumberOfCats());

    }

    @Test
    public void removeIdTest(){

        catHouse.add(cat);
        catHouse.remove(45);
        Integer expected = 0;

        Assert.assertEquals(expected,catHouse.getNumberOfCats());

    }

    @Test
    public void removeTest(){
        catHouse.add(cat);
        catHouse.remove(45);
        Integer expected = 0;

        Assert.assertEquals(expected,catHouse.getNumberOfCats());

    }

   @Test
    public void getCatbyIdTest(){

        catHouse.add(cat);
        Assert.assertEquals(catHouse.getCatById(45),cat);

   }

   @Test
    public void getNumberOfCatsTest(){
        catHouse.add(cat);
        catHouse.add(cat2);
        Integer expected = 2;

        Assert.assertEquals(expected,catHouse.getNumberOfCats());
   }

    // TODO - Create tests for `void remove(Integer id)`
    // TODO - Create tests for `void remove(Cat cat)`
    // TODO - Create tests for `Cat getCatById(Integer id)`
    // TODO - Create tests for `Integer getNumberOfCats()`
}
