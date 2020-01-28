package 行为型模式.命令模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 17:16
 */
public class LightOffCommand implements Command {

    private LightReceiver light;

    public LightOffCommand(LightReceiver light) {
        this.light = light;
    }

    @Override
    public void execute() {

        light.off();
    }

    @Override
    public void undo() {

        light.on();
    }
}
