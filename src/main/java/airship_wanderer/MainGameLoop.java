package airship_wanderer;

import airship_wanderer.*;

public class MainGameLoop {
  public static void main(String[] args) {
    AirshipWanderer player_airship = new AirshipWanderer(null, null);

    player_airship.setName("Bloody Rose");
    player_airship.setFlag(RegistryFlag.CountryList.XX);

    System.out.println(player_airship.getGreetFromClock());
    System.out.println(player_airship.getName());
    System.out.println(player_airship.getRegistry());
  }
}
