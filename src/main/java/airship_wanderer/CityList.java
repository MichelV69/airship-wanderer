package airship_wanderer;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class CityList {

  static class CityInfo {
    String name;
    String flavorText;
    MapSpace location = new MapSpace();
    RegistryFlag.CountryList ownedBy;

    public MapSpace getLocation() {
      return location;
    }

    public String[] getLocationAsArray() {
      String[] result = { String.valueOf(location.getShipNorthPos()), String.valueOf(location.getShipEastPos()),
          location.getAltitude().getFLText() };
      return result;
    }

  }

  // cityInfo
  ArrayList<CityInfo> cityInfo = new ArrayList<CityInfo>();

  public CityList() {
    CityInfo newCity = new CityInfo();
    newCity.name = "FirstCity";
    newCity.flavorText = "Smokey industrial spires and sprawling airship docks.";

    newCity.ownedBy = RegistryFlag.CountryList.GR;
    this.cityInfo.add(newCity);

  }

  public CityInfo getInfo(String searchedCityName) {

    List<CityList.CityInfo> result = this.cityInfo.stream()
        .filter(a -> Objects.equals(a.name, searchedCityName))
        .collect(Collectors.toList());

    try {
      return result.iterator().next();
    } catch (Exception e) {
      return null;
    }

  }

}
// *** end of file ***
