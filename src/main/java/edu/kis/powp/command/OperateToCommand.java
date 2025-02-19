package edu.kis.powp.command;

import edu.kis.powp.jobs2d.Job2dDriver;

public class OperateToCommand implements DriverCommand {
    int x;
    int y;

    public OperateToCommand(int x, int y) {
        this.x=x;
        this.y=y;
    }

    @Override
    public void execute(Job2dDriver driver) {
        driver.operateTo(this.x, this.y);
    }
}
