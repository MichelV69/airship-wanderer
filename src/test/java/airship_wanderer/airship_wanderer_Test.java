package airship_wanderer;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import airship_wanderer.*;

public class airship_wanderer_Test {

  private final airship_wanderer test_airship = new airship_wanderer();

  @Test
  void test_airship_gives_name() {

    assertAll("properties",
        () -> {
          String test_data = "Cool Test Ship";

          test_airship.set_flag(airship_wanderer.RegistryFlag.GB);
          test_airship.set_name(test_data);

          String ship_name = test_airship.get_name();
          System.out.println("TEST DATA :: [" + ship_name + "]");
          assertNotNull(ship_name);
          assertTrue(ship_name.startsWith("RAS"));
        });

  }

}
