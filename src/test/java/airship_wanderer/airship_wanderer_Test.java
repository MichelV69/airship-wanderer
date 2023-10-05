package airship_wanderer;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

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
  void testSkyLevels() {
    // SEA(0), GROUND(20), TREES(40), HILLS(40 - 150) , LOW(150 - 300),
    // MIDDLE(300 - 1000), HIGH(1000 - 1800), THIN (<1800);

    assertAll("Flight Levels Defined", () -> {
      assertNotNull(SkyLevels.Altitude.SEA);
      assertNotNull(SkyLevels.Altitude.GROUND);
      assertNotNull(SkyLevels.Altitude.TREES);
      assertNotNull(SkyLevels.Altitude.HILLS);
      assertNotNull(SkyLevels.Altitude.LOW);
      assertNotNull(SkyLevels.Altitude.MIDDLE);
      assertNotNull(SkyLevels.Altitude.HIGH);
      assertNotNull(SkyLevels.Altitude.THIN);
    });

    assertAll("FL Descriptions", () -> {
      test_airship.setAltitude(SkyLevels.Altitude.SEA);
      assertEquals("Floating at Zero.", test_airship.getAltitude().getFLText(), "SEA Level");
      test_airship.setAltitude(SkyLevels.Altitude.GROUND);
      assertEquals("Hovering at Docking height.", test_airship.getAltitude().getFLText(), "GROUND Level");
      test_airship.setAltitude(SkyLevels.Altitude.TREES);
      assertEquals("Flying at tree-top level. Pinecones in the propellers!.", test_airship.getAltitude().getFLText(),
          "TREES Level");
      test_airship.setAltitude(SkyLevels.Altitude.HILLS);
      assertEquals("Cruising through the valleys and over the hills.", test_airship.getAltitude().getFLText(),
          "HILLS Level");
      test_airship.setAltitude(SkyLevels.Altitude.LOW);
      assertEquals("Flying between 150 and 300m.", test_airship.getAltitude().getFLText(), "LOW Level");
      test_airship.setAltitude(SkyLevels.Altitude.MIDDLE);
      assertEquals("Cruising above 300m and below 1000m.", test_airship.getAltitude().getFLText(), "MIDDLE Level");
      test_airship.setAltitude(SkyLevels.Altitude.HIGH);
      assertEquals("Operating above 1000m and below 1800m.", test_airship.getAltitude().getFLText(), "HIGH Level");
      test_airship.setAltitude(SkyLevels.Altitude.THIN);
      assertEquals("Daring Fate above 1800m.", test_airship.getAltitude().getFLText(), "THIN Level");

    });

  }

  @Test
  void testCityLists() {
    CityList test_cities = new CityList();
    CityList.CityInfo firstCity = test_cities.getInfo("FirstCity");
    assertAll("City Object WAEx", () -> {
      // Name, FlavorText, PosX, PosY, OwnedBy
      assertNotNull(test_cities, "did object instanciate?");
      assertNotNull(firstCity, "did constructor run as expected?");
      assertEquals("FirstCity", firstCity.name, "firstCity.Name");
      assertEquals("Smokey industrial spires and sprawling airship docks.", firstCity.flavorText,
          "firstCity.FlavorText");
    });
  }

  /*
   * @Test
   * void testAirshipKnowsMap() {
   * assertAll("Ship Knows Map & Movement", () -> {
   * test_airship.setLocation(CityList.FirstCity);
   * test_airship.setAltitude(SkyLevels.Ground);
   *
   * assertEquals(CityList.getInfo("FirstCity"), test_airship.getLocation());
   * assertEquals(SkyLevels.Ground, test_airship.getAltitude());
   * });
   * }
   */

}
