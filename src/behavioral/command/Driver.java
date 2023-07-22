package behavioral.command;

public class Driver {
    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Television television = new Television();
        OnCommand onCommand = new OnCommand(television);
        remoteControl.setCommand(onCommand);
        remoteControl.pressButton();
    }

}
