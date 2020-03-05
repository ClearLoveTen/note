package 布隆过滤器;

import cn.hutool.bloomfilter.BitMapBloomFilter;
import cn.hutool.core.text.StrBuilder;
import cn.hutool.system.SystemUtil;
import sun.security.util.Length;


/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2020/2/20 12:13
 *
 *   某位置0: 按位& 1111110111……， 0的位置为想要置0的所在数的位置.
 *   某位置1: 按位|  0000001000……， 1的位置为想要置1的所在数的位置.
 *
 *
 */
public class BloomFilter {

    public static void main(String[] args) {
        BitMapBloomFilter filter = new BitMapBloomFilter(10);
        filter.add("123");
        filter.add("abc");
        filter.add("ddd");
        // 查找
        System.out.println(filter.contains("abc"));
        SystemUtil.getHostInfo();
    }
}

