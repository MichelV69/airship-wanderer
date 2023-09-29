package airship_wanderer;

public class MapSpace {
  private Short shipNorthPos, shipEastPos;
  private SkyLevels altitude;

  public MapSpace() {
    shipNorthPos = 0;
    shipEastPos = 0;
    altitude = SkyLevels.LOW;
  }

  public void setShipNorthPos(short newPos) {
    this.shipNorthPos = newPos;
  }

  public void setShipEastPos(short newPos) {
    this.shipEastPos = newPos;
  }

  public short getShipNorthPos() {
    return this.shipNorthPos
  }

  public short getShipEastPos() {
    return this.shipEastPos
  }

  public Skylevels setAltitude(Skylevels newLevel) {
    this.altitude = newLevel;
  }

}
