package IO流.转换流;

import java.util.List;

/**
 * @author xiaotiaowa
 * @version 1.0
 * @date 2019/10/15 22:55
 */
public class Hello {

    /**
     * name : 王小二
     * age : 15
     * address : {"province":"浙江","city":"杭州","district":"西湖区"}
     * hobby : ["足球","棒球","乒乓球"]
     */

    private String name;
    private int age;
    private AddressBean address;
    private List<String> hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public AddressBean getAddress() {
        return address;
    }

    public void setAddress(AddressBean address) {
        this.address = address;
    }

    public List<String> getHobby() {
        return hobby;
    }

    public void setHobby(List<String> hobby) {
        this.hobby = hobby;
    }

    public static class AddressBean {
        /**
         * province : 浙江
         * city : 杭州
         * district : 西湖区
         */

        private String province;
        private String city;
        private String district;

        public String getProvince() {
            return province;
        }

        public void setProvince(String province) {
            this.province = province;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getDistrict() {
            return district;
        }

        public void setDistrict(String district) {
            this.district = district;
        }
    }
}
