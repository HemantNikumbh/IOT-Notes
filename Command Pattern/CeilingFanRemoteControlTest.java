public class CeilingFanRemoteControlTest {
    public static void main(String[] args) {
        RemoteControl remote = new RemoteControl();

        CeilingFan livingRoomFan = new CeilingFan("Living Room");

        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(livingRoomFan);
        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(livingRoomFan);
        CeilingFanLowCommand ceilingFanLow = new CeilingFanLowCommand(livingRoomFan);
        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(livingRoomFan);

        // Assign commands to slots
        remote.setCommand(0, ceilingFanHigh, ceilingFanOff);
        remote.setCommand(1, ceilingFanMedium, ceilingFanOff);
        remote.setCommand(2, ceilingFanLow, ceilingFanOff);

        // Test High Speed and Undo
        System.out.println(remote);
        remote.onButtonWasPressed(0);
        remote.undoButtonWasPressed();

        // Test Medium Speed and Undo
        remote.onButtonWasPressed(1);
        remote.undoButtonWasPressed();

        // Test Low Speed and Undo
        remote.onButtonWasPressed(2);
        remote.undoButtonWasPressed();

        // Turn Off and Undo
        remote.offButtonWasPressed(0);
        remote.undoButtonWasPressed();
    }
}

