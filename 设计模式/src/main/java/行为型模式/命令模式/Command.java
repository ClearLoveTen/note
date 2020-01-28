package 行为型模式.命令模式;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 17:11
 */
//创建命令接口
public interface Command {

    /**
     * 执行
     */
    void execute();

    /**
     * 撤销
     */
    void undo();

}
