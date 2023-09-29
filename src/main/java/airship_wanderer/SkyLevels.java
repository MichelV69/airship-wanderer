package airship_wanderer;

public class SkyLevels {
  enum Altitude {
    SEA, GROUND, TREES, HILLS, LOW, MIDDLE, HIGH, THIN;

  public String getFLText() {

    switch (this) {
      case SEA :
      return "Floating at Zero.";
    }
  };
}
