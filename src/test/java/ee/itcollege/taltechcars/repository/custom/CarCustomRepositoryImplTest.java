package ee.itcollege.taltechcars.repository.custom;

import ee.itcollege.taltechcars.repository.CarRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class CarCustomRepositoryImplTest {

    @Autowired
    private CarRepository carRepository;

    @Test
    public void findCarByModelNrAndYearOlder() {
        carRepository.findCarByModelNrAndYearOlder("123", 123);
    }
}