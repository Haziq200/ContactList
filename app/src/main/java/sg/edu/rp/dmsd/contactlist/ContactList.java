package sg.edu.rp.dmsd.contactlist;

/**
 * Created by 17010603 on 24/7/2018.
 */

public class ContactList {
    private String name;
    private String countrynum;
    private String num;


    public ContactList(String name, String countrynum, String num) {
        this.name = name;
        this.countrynum = countrynum;
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountrynum() {
        return countrynum;
    }

    public void setCountrynum(String countrynum) {
        this.countrynum = countrynum;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "ContactList{" +
                "name='" + name + '\'' +
                ", countrynum='" + countrynum + '\'' +
                ", num='" + num + '\'' +
                '}';
    }
}
