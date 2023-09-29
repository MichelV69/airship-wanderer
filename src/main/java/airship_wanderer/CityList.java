package airship_wanderer;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

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

  public getInfo(String searchedCityName) {

  List<CityInfo> result = this.cityInfo.stream()
      .filter(a -> Objects.equals(a.Name, searchedCityName))
      .collect(Collectors.toList());

    return result;
  }

}
