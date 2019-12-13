package day1.java;


/**
 * A module is something that requires an amount of fuel to leave the 
 * earth successfully.
 */
public class Module {
  private int mass;
  private double requiredFuel;

  /**
   * Constructor that takes in the required mass.
   *
   * @param mass The mass of the module.
   */
  public Module(Integer mass) {
      this.mass = mass;
      calculateRequiredFuel();
  }

  /**
   * Performs calculation to determine the required fuel
   * 
   */
  private void calculateRequiredFuel() {
    double dividedByThree = mass / 3;
    double roundedDown = Math.floor(dividedByThree);
    double subtractedValue = roundedDown - 2;
    this.requiredFuel = subtractedValue;
  }

  // getters and setters

  public double getRequiredFuel() {
    return this.requiredFuel;
  }
}