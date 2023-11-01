package racingcar.service;

import java.util.ArrayList;
import java.util.List;

import racingcar.domain.Car;

public class RacingService {

	public List<Car> getWinners(List<Car> cars) {
		List<Car> winners = new ArrayList<>();

		int maxPosition = cars.stream().mapToInt(Car::getPosition).max().orElse(0);

		for (Car car : cars) {
			if (car.getPosition() == maxPosition) {
				winners.add(car);
			}
		}

		return winners;
	}

}