package nio.buffer;

import org.junit.Test;

import java.nio.ByteBuffer;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/27 14:52
 */
public class dome {

    @Test
    public void test1(){
        //获取一个byte缓存区
        ByteBuffer allocate = ByteBuffer.allocate(1024);
        System.out.println("当前容量"+allocate.capacity());
        System.out.println("当前位置"+allocate.position());
    }
}
