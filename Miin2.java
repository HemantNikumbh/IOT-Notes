interface Command{
    void execute();
}
class Light{
    public void on(){
        System.out.println("Lightt is on");

    }
    public void off(){
        System.out.println("Light is Off");
    }
}
class LightOnCommand implements Command{
    Light l1;

    public LightOnCommand(Light a){
        this.l1 = a;

    }
    
    public void execute(){
        l1.on();
    }
}
class LightOffCommand implements Command{
    Light l1;

    public LightOffCommand(Light a){
        this.l1 = a;
    }

    public void execute(){
        l1.off();
    }
}

class simpleRemmoteControl{
    Command slot;

    public void setcommand(Command command){
        slot = command;
    }
    public void buttonWasPressed(){
        slot.execute();
    }
}

public class Miin2 {
    public static void main(String args[]){
        simpleRemmoteControl r1 = new simpleRemmoteControl();
        Light l1 = new Light();
        
        LightOnCommand ol = new LightOnCommand(l1);
        r1.setcommand(ol);
        r1.buttonWasPressed();

        LightOffCommand of = new LightOffCommand(l1);
        r1.setcommand(of);
        r1.buttonWasPressed();


    }
}
