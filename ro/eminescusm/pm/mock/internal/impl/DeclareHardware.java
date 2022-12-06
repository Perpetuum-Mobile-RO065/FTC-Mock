package ro.eminescusm.pm.mock.internal.impl;

import ro.eminescusm.pm.mock.external.util.OpModeStarter;

public interface DeclareHardware {

    /**
     * Adds a motor to the list of motors that will be used in the OpMode.
     *
     * @param motorName the name of the motor
     * @return the current DeclareHardware object
     */
    DeclareHardware addMotor(String motorName);

    /**
     * Adds multiple motors to the list of motors that will be used in the OpMode.
     *
     * @param motorNames the names of the motors
     * @return the current DeclareHardware object
     */
    DeclareHardware addMotors(String... motorNames);


    OpModeStarter getStartOpMode();

    /**
     * Creates a new DeclareHardware object.
     *
     * @return a new DeclareHardware object
     */
    static DeclareHardware getInstance() {
        return new DeclareHardwareImpl();
    }
}