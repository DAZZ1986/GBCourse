package ru.gb.java_core2.l7.project;

import ru.gb.java_core2.l7.project.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    public void getWeather(Periods period) throws IOException;
}
