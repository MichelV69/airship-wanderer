package airship_wanderer;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import airship_wanderer.*;

public class airship_wanderer_Test {

  private final AirshipWanderer test_airship = new AirshipWanderer(null, null);

  @Test
  void testAirshipGivesFlag() {
    assertAll("Ship Flags", () -> {

      assertAll("Russian", () -> {
        test_airship.setFlag(RegistryFlag.CountryList.RU);
        assertEquals(RegistryFlag.CountryList.RU, test_airship.getFlag());
      });

      assertAll("British", () -> {
        test_airship.setFlag(RegistryFlag.CountryList.GB);
        assertEquals(RegistryFlag.CountryList.GB, test_airship.getFlag());
      });

      assertAll("German", () -> {
        test_airship.setFlag(RegistryFlag.CountryList.GR);
        assertEquals(RegistryFlag.CountryList.GR, test_airship.getFlag());
      });

      assertAll("French", () -> {
        test_airship.setFlag(RegistryFlag.CountryList.FR);
        assertEquals(RegistryFlag.CountryList.FR, test_airship.getFlag());
      });

      assertAll("Pirate", () -> {
        test_airship.setFlag(RegistryFlag.CountryList.XX);
        assertEquals(RegistryFlag.CountryList.XX, test_airship.getFlag());
      });
    });
  }

  @Test
  void testAirshipGivesNameAndFlag() {

    assertAll("Ship Flag And Name",
        () -> {
          String test_data = "Cool Test Ship";

          test_airship.setFlag(RegistryFlag.CountryList.GB);
          test_airship.setName(test_data);

          String ship_name = test_airship.getFlagAndName();
          System.out.println("TEST DATA :: [" + ship_name + "]");
          assertNotNull(ship_name);
          assertTrue(ship_name.startsWith("RAS"));
          assertEquals(ship_name, "RAS " + test_data);
        });

  }

  @Test
  void testAirshipKnowsMap() {
    assertAll("Ship Knows Map & Movement", () -> {
      test_airship.setLocation(CityList.FirstCity);
      test_airship.setAltitude(SkyLevels.Ground);

      assertEquals(CityList.FirstCity, test_airship.getLocation());
      assertEquals(SkyLevels.Ground, test_airship.getAltitude());
    });
  }

}
