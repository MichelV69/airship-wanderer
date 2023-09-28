package airship_wanderer;

import java.util.ArrayList;

/*
Michel R Vaillancourt <michel@michelrvaillancourt.com>
27 Sept 2023

Simple Game where you fly an airship around and look for stuff
*/

public class AirshipWanderer {

  // internals we'll need
  enum RegistryFlag {
    XX, GB, FR, US, GR, RU;
  }

  final short gameStartDay = 1888 * 365.25;

  // Class Properties
  private String ship_name;
  private RegistryFlag shipRegistryFlag;

  private float captainSkill, navigatorSkill, gunnerSkill, surgeonSkill;
  private float shipClock;

  private short shipNorthPos, shipEastPos, shipAltitude100s;
  private short shipCalendarDay;

  private boolean hasEMIPALE;

  private ArrayList<String> carriedCargo = new ArrayList<String>();

  // Main method
  public static void main(String[] args) {
  }

  // Constructor Method
  public AirshipWanderer(RegistryFlag newFlag, String newName) {

    if (newFlag == null) {
      newFlag = RegistryFlag.XX;
    }

    if (newName == null) {
      newName = "Brand New Ship";
    }

    ship_name = newName;
    shipRegistryFlag = newFlag;

    captainSkill = 0.00f;
    navigatorSkill = -1.00f;
    gunnerSkill = 0.00f;
    surgeonSkill = -1.00f;

    hasEMIPALE = false;

    shipNorthPos = 5;
    shipEastPos = 6;
    shipAltitude100s = 50;

    shipClock = 12.00f;
    shipCalendarDay = gameStartDay;

    for (short i = 0; i <= 3; i++) {
      carriedCargo.add("Spare Parts");
    }
    for (short i = 0; i <= 5; i++) {
      carriedCargo.add("Coal");
    }

  } // public AirshipWanderer

  // Other Class Methods
  public String GetName() {

    String flag_name;

    switch (this.shipRegistryFlag) {
      case XX:
        flag_name = "Pirate";
        break;
      case GB:
        flag_name = "RAS";
        break;
      default:
        flag_name = "CA";
        break;
    }

    return flag_name + " " + this.ship_name;
  }

  public RegistryFlag GetFlag() {
    return this.shipRegistryFlag;
  }

  public void SetFlag(RegistryFlag newFlag) {
    this.shipRegistryFlag = newFlag;
  }

  public void SetName(String newName) {
    this.ship_name = newName;
  }

  public String GetGreetFromClock() {
    String greetingFromClock = (this.shipClock <= 18.00f) ? "Good day" : "Good evening";
    return greetingFromClock + ", Captain.";
  }

  public char[] GetRegistry() {
    return null;
  }
}
