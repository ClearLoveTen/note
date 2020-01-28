package 行为型模式.备忘录模式;

import java.util.MissingResourceException;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/30 11:28
 */
public class Client {
    public static void main(String[] args) {

        Caretaker caretaker = new Caretaker();

        Memento memento = new Memento(100, 100);

        caretaker.addOrginator("1",memento.saveMemento());



    }
}
