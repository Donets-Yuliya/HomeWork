import Clinic.Animal;
import Clinic.Cat;
import Clinic.Dog;
import Clinic.Rat;
import Instrument.Instrument;
import Instrument.Guiter;
import Instrument.Drum;
import Instrument.Tuba;
import com.company.vehicles.Car;
import com.company.vehicles.Lorry;
import com.company.vehicles.SportCar;

public class Main {

    public static void ClinicWork() {
        Animal[] clinicAnimals = new Animal[3];
        clinicAnimals[0] = new Cat("Мурзик", 5);
        clinicAnimals[1] = new Dog("Бобик", 2);
        clinicAnimals[2] = new Rat("Рататуй", 1);

        for (Animal ca : clinicAnimals) {
            ca.makeNoise();
        }
    }

    public static void InstrumentPlay() {
        Instrument[] instruments = new Instrument[3];
        instruments[0] = new Guiter(7);
        instruments[1] = new Drum(35, 15);
        instruments[2] = new Tuba(10);

        for (Instrument ins : instruments) {
            ins.play();
        }
    }

    public static void CarDrive() {
        Car[] cars = new Car[3];
        cars[0] = new Car("Мазда", 'D', 1500, "Зайцев Вальдемар Иванович", 10, 500, "МТЗ");
        cars[1] = new Lorry("МАН", 'J', 5000, 10000, "Жуков Михаил Борисович", 20, 1000, "БТРЗ");
        cars[2] = new SportCar("Феррари", 'D', 1000, 350, "Зубарев Михаил Сергеевич", 15, 850, "БелАЗ");

        for (Car car : cars) {
            car.toString();
            car.start();
            car.turnRight();
            car.turnLeft();
            car.stop();
        }
    }

    public static void main(String[] args) {
        ClinicWork();
        InstrumentPlay();
        CarDrive();
    }
}