package WeatherStation
// problem 5
/**
  * Created by robg on 10/21/17.
  */
object WeatherStation extends App {
  val thermometer: IThermometer = new IThermometer {
    val celsiusTherm = new CelsiusTherm
    override def getMeanTemperature(cities: List[String]) =
      cities
        .map(celsiusTherm.computeTemp _)
        .reduce((x: Double, y: Double)=> x + y) / cities.size
    // Using .map().sum will be more succinct but problem requires
    // using .map().reduce().
  }
  val avgTemp = thermometer.getMeanTemperature(List("LA", "SF", "SLC", "Rio"))
  println(s"avg temp = $avgTemp")
}