package hw_2.hw_2_1;

public class Geo {
 double lat;
 double lng;

 @Override
 public String toString() {
  return "Geo{" +
          "lat=" + lat +
          ", lng=" + lng +
          '}';
 }

 public Geo(double lat, double lng) {
  this.lat = lat;
  this.lng = lng;
 }

 public Geo() {
 }
}
