package ru.gb.java_core2.l8.DZ.provider;

import ru.gb.java_core2.l8.DZ.entity.WeatherData;
import ru.gb.java_core2.l8.DZ.enums.Periods;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface WeatherProvider {

    void getWeather(Periods periods) throws IOException, SQLException;

    List<WeatherData> getAllFromDb() throws IOException, SQLException;
}
