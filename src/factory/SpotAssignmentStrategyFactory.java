package factory;

import Stratergy.RandomParkingSpotStrategy;
import Stratergy.SpotAssignmentStrategy;
import enums.SpotAssignmentStrategyType;

public class SpotAssignmentStrategyFactory {

    public static SpotAssignmentStrategy getSpotAssignmentStrategy(SpotAssignmentStrategyType spotAssignmentStrategyType) {

        if (spotAssignmentStrategyType == SpotAssignmentStrategyType.RANDOM) {
            return new RandomParkingSpotStrategy();
        }

        return null;


    }
}
