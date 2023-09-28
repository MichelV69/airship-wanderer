package airship_wanderer;

public class RegistryFlag {
  enum CountryList {
    XX, GB, FR, US, GR, RU;

    public String getFlag() {

      switch (this) {
        case XX:
          return "Pirate";
        case GB:
          return "RAS";
        default:
          return null;
      }

    }

  }
}
