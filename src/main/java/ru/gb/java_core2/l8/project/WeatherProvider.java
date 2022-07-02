package ru.gb.java_core2.l8.project;

import ru.gb.java_core2.l7.project.enums.Periods;
import ru.gb.java_core2.l8.project.entity.WeatherData;

import java.io.IOException;

public interface WeatherProvider {

    WeatherData getWeather(Periods periods) throws IOException;

    WeatherData getAllFromDb() throws IOException;
}
