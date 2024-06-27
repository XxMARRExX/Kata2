package kata2.software.ulpgc.es;

import model.kata2.software.ulpgc.es.*;

import java.io.File;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        List<F1DriverRegister> registers = CSVFileLoader
                .with(new File("drivers_updated.csv"))
                .load();
        TeamPointsStatistic statistic = new TeamPointsStatistic();
        Map<String, Float> map = statistic.calculate(registers);

        int count = 0;
        for (String key: map.keySet()) {
            if(count >= 10) break;
            System.out.println(key + " = " + map.get(key));
            count++;
        }
    }

}
