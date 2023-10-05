package airship_wanderer;

public class SkyLevels {
  enum Altitude {
    SEA, GROUND, TREES, HILLS, LOW, MIDDLE, HIGH, THIN;

    public String getFLText() {

      switch (this) {
        case SEA:
          return "Floating at Zero.";
        case GROUND:
          return "Hovering at Docking height.";
        case TREES:
          return "Flying at tree-top level. Pinecones in the propellers!.";
        case HILLS:
          return "Cruising through the valleys and over the hills.";
        case LOW:
          return "Flying between 150 and 300m.";
        case MIDDLE:
          return "Cruising above 300m and below 1000m.";
        case HIGH:
          return "Operating above 1000m and below 1800m.";
        case THIN:
          return "Daring Fate above 1800m.";
        default:
          return "Unhandled Skylevel.";
      }
    };
  }
}
