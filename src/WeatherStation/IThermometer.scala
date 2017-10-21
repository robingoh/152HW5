package WeatherStation
// problem 5
/**
  * Created by robg on 10/21/17.
  */
trait IThermometer {
  // = avg degrees Fahrenheit
  def getMeanTemperature(cities: List[String]): Double
}
