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
          return "Operating between 150 and 300m.";
        default:
          return "Unhandled Skylevel.";
      }
    };
  }
}
