package airship_wanderer;

import java.util.ArrayList;
import java.util.Collections;

/*
Michel R Vaillancourt <michel@michelrvaillancourt.com>
27 Sept 2023

Simple Game where you fly an airship around and look for stuff
*/

public class AirshipWanderer {

  // internals we'll need
  final short gameStartDay = (short) (1888 * 365.25);

  // Class Properties
  private String shipName;
  private RegistryFlag.CountryList shipRegistryFlag;

  private Float captainSkill, navigatorSkill, gunnerSkill, surgeonSkill;
  private float shipClock;

  private MapSpace shipPosition;
  private Short shipCalendarDay;

  private Boolean hasEMIPALE;

  private ArrayList<String> carriedCargo = new ArrayList<String>();

  // Main method
  public static void main(String[] args) {
  }

  // Constructor Method
  public AirshipWanderer(RegistryFlag.CountryList newFlag, String newName) {

    if (newFlag == null) {
      newFlag = RegistryFlag.CountryList.XX;
    }

    if (newName == null) {
      newName = "Brand New Ship";
    }

    shipName = newName;
    shipRegistryFlag = newFlag;

    captainSkill = 0.00f;
    navigatorSkill = -1.00f;
    gunnerSkill = 0.00f;
    surgeonSkill = -1.00f;

    hasEMIPALE = false;

    shipPosition.setShipEastPos(0);
    shipPosition.setShipNorthPos(0);
    shipPosition.setAltitude(SkyLevels.Altitude.GROUND);

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
  public String getName() {

    String flag_name = "";

    return flag_name + " " + this.shipName;
  }

  public RegistryFlag.CountryList getFlag() {
    return this.shipRegistryFlag;
  }

  public void setFlag(RegistryFlag.CountryList newFlag) {
    this.shipRegistryFlag = newFlag;
  }

  public void setName(String newName) {
    this.shipName = newName;
  }

  public String getGreetFromClock() {
    String greetingFromClock = (this.shipClock <= 18.00f) ? "Good day" : "Good evening";
    return greetingFromClock + ", Captain.";
  }

  public char[] getRegistry() {
    return null;
  }

  public String getCargoList() {
    String cargoList = "";
    Collections.sort(this.carriedCargo);
    for (String one_cargo : this.carriedCargo) {
      cargoList += one_cargo + ", ";
    }
    return cargoList;
  }

  public String getFlagAndName() {
    String flagAndName = this.shipRegistryFlag.getFlag() + " " + this.shipName;
    return flagAndName;
  }
}
