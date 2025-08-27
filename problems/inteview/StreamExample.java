package inteview;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {

  record Car(String type, String make, String model, Integer engineCapacity) {
  }
  public static void main(String[] args) {
    List<Car> cars = List.of(
      new Car("sedan", "BMW", "530", 1998),
      new Car("sedan", "Audi", "A5", 1998),
      new Car("sedan", "Mercedes", "E-Class", 2500),
      new Car("hatchback", "Skoda", "Octavia", 1600),
      new Car("hatchback", "Toyota", "Type-R", 1600)
    );

    //filter
    List<Car> sedanCars = cars.stream().filter(car -> car.type.equals("sedan")).toList();

    //map
    List<String> carMakeList = cars.stream().map(car -> car.make).toList();

    //flatMap
    List<String> carMakeModelList = cars.stream().flatMap(car -> Stream.of(car.make, car.model)).toList();
 
    //Collect by PartionedBy on type
    Map<Boolean, List<Car>> partionedByCars = cars.stream().collect(Collectors.partitioningBy(car -> car.type.equals("sedan")));

    //grouping By
    //(type, (model,engineCapacity))
    Map<String, Map<String,Integer>> groupingCars = cars.stream().collect(Collectors.groupingBy(Car::type, Collectors.toMap(Car::model, Car::engineCapacity)));

    System.out.println(partionedByCars );
  }
}
