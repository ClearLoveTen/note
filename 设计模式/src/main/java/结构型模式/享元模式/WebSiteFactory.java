package 结构型模式.享元模式;

import java.util.HashMap;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/1/3 14:46
 */
public class WebSiteFactory {

    //集合充当池子的作用
    private HashMap<String, ConcretWebSite> map = new HashMap<>();
    //根据网站类型返回一个类型，如何没有，放入池子中

    public ConcretWebSite getConcretWebSite(String type) {

        if (!map.containsKey(type)) {

            map.put(type, new ConcretWebSite(type));

        }


        return map.get(type);


    }


    public int getSize(){

        return map.size();
    }

}
