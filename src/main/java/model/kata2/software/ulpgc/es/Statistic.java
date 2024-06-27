package model.kata2.software.ulpgc.es;

import java.util.List;
import java.util.Map;

public interface Statistic {

    Map<String, Float> calculate(List<F1DriverRegister> registros);

}
