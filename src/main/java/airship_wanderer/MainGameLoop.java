package airship_wanderer;

import airship_wanderer.*;

public class MainGameLoop {
  public static void main(String[] args) {
    AirshipWanderer player_airship = new AirshipWanderer(null, null);

    player_airship.SetName("Bloody Rose");
    player_airship.SetFlag(AirshipWanderer.RegistryFlag.XX);

    System.out.println(player_airship.GetGreetFromClock());
    System.out.println(player_airship.GetName());
    System.out.println(player_airship.GetRegistry());
  }
}
