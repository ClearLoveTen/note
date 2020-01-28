package 行为型模式.备忘录模式;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/12/30 11:31
 * <p>
 * 守护者对象,负责保存多个备忘录对象，使用集合管理，提高效率
 */
public class Caretaker {



//守护者对象,保存游戏角色的状态

/*
//如果只保存一次状态
private Memento memento;
//对GameRole保存多次状态
private ArrayList<Memento> mementos;*/
//对多个游戏角色保存多个状态
private HashMap<String,Memento> rolesMementos;

    public Caretaker(HashMap<String, Memento> rolesMementos) {
        this.rolesMementos = rolesMementos;
    }
    public Caretaker() {
        this.rolesMementos = new HashMap<>();
    }

    //添加一个备忘录对象

    public void addOrginator(String key,Memento memento){

        rolesMementos.put(key,memento);

    }


    //查询一个备忘录对象

    public Memento getByKeyMemento(String key){

        return rolesMementos.get(key);

    }



}
