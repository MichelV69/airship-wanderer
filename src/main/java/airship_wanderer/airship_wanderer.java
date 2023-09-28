package airship_wanderer;

public class airship_wanderer {

  String ship_name = "Brand New Ship";

  enum RegistryFlag {
    XX, GB, FR, US, GR, RU;
  }

  RegistryFlag shipRegistryFlag = RegistryFlag.XX;

  // Main method
  public void main(String[] args) {
  }

  public String get_name() {

    String flag_name;

    switch (this.shipRegistryFlag) {
      case XX:
        flag_name = "Pirate";
        break;
      case GB:
        flag_name = "RAS";
        break;
      default:
        flag_name = "CA";
        break;
    }

    return flag_name + " " + this.ship_name;
  }

  public RegistryFlag get_flag() {
    return this.shipRegistryFlag;
  }

  public void set_flag(RegistryFlag newFlag) {
    this.shipRegistryFlag = newFlag;
  }

  public void set_name(String newName) {
    this.ship_name = newName;
  }
}
