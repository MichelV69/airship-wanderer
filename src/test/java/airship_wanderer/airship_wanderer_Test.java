package airship_wanderer;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import airship_wanderer.*;

public class airship_wanderer_Test {

  private final AirshipWanderer test_airship = new AirshipWanderer();

  @Test
  void test_airship_gives_flag() {
    assertAll("Ship Flags", () -> {

      assertAll("Russian", () -> {
        test_airship.SetFlag(AirshipWanderer.RegistryFlag.XX);
        assertEquals(AirshipWanderer.RegistryFlag.XX, test_airship.get_flag());
      });

      assertAll("British", () -> {
        test_airship.SetFlag(AirshipWanderer.RegistryFlag.GB);
        assertEquals(AirshipWanderer.RegistryFlag.GB, test_airship.get_flag());
      });
    });
  }

  @Test
  void test_airship_gives_name() {

    assertAll("Ship Flag And Name",
        () -> {
          String test_data = "Cool Test Ship";

          test_airship.SetFlag(AirshipWanderer.RegistryFlag.GB);
          test_airship.SetName(test_data);

          String ship_name = test_airship.GetName();
          System.out.println("TEST DATA :: [" + ship_name + "]");
          assertNotNull(ship_name);
          assertTrue(ship_name.startsWith("RAS"));
          assertEquals(ship_name, "RAS " + test_data);
        });

  }

}
