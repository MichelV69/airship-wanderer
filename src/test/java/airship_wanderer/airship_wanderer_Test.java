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
  void test_airship_gives_flag() {
    assertAll("Ship Flags", () -> {

      assertAll("Russian", () -> {
        test_airship.setFlag(AirshipWanderer.RegistryFlag.XX);
        assertEquals(AirshipWanderer.RegistryFlag.XX, test_airship.getFlag());
      });

      assertAll("British", () -> {
        test_airship.setFlag(AirshipWanderer.RegistryFlag.GB);
        assertEquals(AirshipWanderer.RegistryFlag.GB, test_airship.getFlag());
      });
    });
  }

  @Test
  void test_airship_gives_name() {

    assertAll("Ship Flag And Name",
        () -> {
          String test_data = "Cool Test Ship";

          test_airship.setFlag(AirshipWanderer.RegistryFlag.GB);
          test_airship.setName(test_data);

          String ship_name = test_airship.getName();
          System.out.println("TEST DATA :: [" + ship_name + "]");
          assertNotNull(ship_name);
          assertTrue(ship_name.startsWith("RAS"));
          assertEquals(ship_name, "RAS " + test_data);
        });

  }

}
