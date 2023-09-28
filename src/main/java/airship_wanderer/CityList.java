package airship_wanderer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import airship_wanderer.RegistryFlag;

public class CityList {

  private class CityInfo {
    String Name;
    String FlavorText;
    Short PosX;
    Short PosY;
    RegistryFlag.CountryList OwnedBy;
  }

  // cityInfo
  ArrayList<CityInfo> cityInfo = new ArrayList<CityInfo>();

  public CityList() {
    CityInfo newCity = new CityInfo();
    newCity.Name = "FirstCity";
    newCity.FlavorText = "Smokey industrial spires and sprawling airship docks.";
    newCity.PosX = 13;
    newCity.PosY = 13;
    newCity.OwnedBy = RegistryFlag.CountryList.GR;
    this.cityInfo.add(newCity);

  }

}
