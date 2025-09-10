package frc.robot.subsystems.groundIntake;

public interface GroundIntakeIO {
 
  /**
   * this interface declares all the methods that are implemented by this package.
   */

  public void setPivotMotorVoltage(double voltage);

  public void setSpinMotorVoltage(double voltage);

  public void setAngle(double angle);

  public double getPivotAngle();

  public void resetPivotEncoder();

  public void update();

  public void runAmp(double amp, double dutyCycle);
}
