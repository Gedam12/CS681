Integer averagePrice= cars.stream().map( car -> car.getPrice() ).reduce(new int[2],
     the average of those elems]
     List<Car> carsDetails = UserDB.getCarsDetails();
Map<String, DoubleSummaryStatistics> collect4 = carsDetails.stream()
                .collect(Collectors.groupingBy(Car::getMake, Collectors.summarizingDouble(Car::getPrice)));
collect4.entrySet().forEach(e->System.out.println(e.getKey()+" "+e.getValue().getMax()+" "+e.getValue().getMin()));
                                                                        return;
                                                                        }),
(finalResult, intermediateResult)->finalResult)[1];
int[]result= new int[2];
for(Integer price: prices)
{
  result= accumulate(result, price);
}
import static org.junit.jupiter.api.Assertions.*;

import java.util.Collections;
import java.util.LinkedList;

import org.junit.jupiter.api.Test;

class PriceComparatorTest {


    LinkedList<Car> carList = new LinkedList<Car>();
  
    void() {
        Car car1 = new Car("Audi", "XL", 2005, 43, 12000);
        Car car2 = new Car("BMW", "X3", 2004, 40, 22000);
        carList.add(car1);
        carList.add(car2);
        Collections.sort(carList, (Car arg0, Car arg1) -> (int) (arg1.getPrice() - arg0.getPrice()));
        assertEquals(car2, carList.get(0));
        assertEquals(car1, carList.get(1));

    }

}
