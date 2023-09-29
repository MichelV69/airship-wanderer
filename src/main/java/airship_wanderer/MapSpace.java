package airship_wanderer;

import static java.lang.Math.max;
import static java.lang.Math.min;

import airship_wanderer.SkyLevels.Altitude;

public class MapSpace {
  private Short shipNorthPos, shipEastPos;
  private SkyLevels.Altitude altitude;

  static short IntToShort(Integer n) {
    short value = (short) min(max(n, Short.MIN_VALUE), Short.MAX_VALUE);
    return value;
  }

  public MapSpace() {
    shipNorthPos = 0;
    shipEastPos = 0;
    altitude = SkyLevels.Altitude.LOW;
  }

  public void setShipNorthPos(Integer newPos) {
    this.shipNorthPos = MapSpace.IntToShort(newPos);
  }

  public void setShipEastPos(Integer newPos) {
    this.shipEastPos = MapSpace.IntToShort(newPos);
  }

  public short getShipNorthPos() {
    return this.shipNorthPos;
  }

  public short getShipEastPos() {
    return this.shipEastPos;
  }

  public void setAltitude(SkyLevels.Altitude newLevel) {
    this.altitude = newLevel;
  }

  public Altitude getAltitude() {
    return this.altitude;
  }

}
