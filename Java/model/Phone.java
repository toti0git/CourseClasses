import java.*;
import java.lang.Override;
public class Phone {

    private int id;
    private String secondName;
    private String name;
    private String patronomic;
    private String address;
    protected long creditCardNumber;
    private boolean credit;
    private boolean debit;
    private long talkingTime;
    private String charging;
    private String model;

    public Phone(int id, String secondName, String name, String patronomic, String address, long creditCardNumber, boolean credit, boolean debit, long talkingTime) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.patronomic = patronomic;
        this.address = address;
        this.creditCardNumber = creditCardNumber;
        this.credit = credit;
        this.debit = debit;
        this.talkingTime = talkingTime;
    }

    public Phone(String secondName, String name, String charging, String model) {
        this.secondName = secondName;
        this.name = name;
        this.charging = charging;
        this.model = model;
    }

    public Phone(int id, String secondName, String name, String patronomic, String address, long talkingTime) {
        this.id = id;
        this.secondName = secondName;
        this.name = name;
        this.patronomic = patronomic;
        this.address = address;
        this.talkingTime = talkingTime;
    }

    public int getId() {
        return id;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setCharging(boolean charging) {
        this.charging = charging;
    }

    public boolean isCharging() {
        return charging;
    }

    public String getModel() {
        return model;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getName() {
        return name;
    }

    public String getPatronomic() {
        return patronomic;
    }

    public String getAddress() {
        return address;
    }

    public long getCreditCardNumber() {
        return creditCardNumber;
    }

    public boolean isCredit() {
        return credit;
    }

    public boolean isdebit() {
        return debit;
    }

    public long getTalkingTime() {
        return talkingTime;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPatronomic(String patronomic) {
        this.patronomic = patronomic;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCreditCardNumber(long creditCardNumber) {
        this.creditCardNumber = creditCardNumber;
    }

    @Override
    public java.lang.String toString() {
        return "Phone{" +
                "secondName='" + secondName + '\'' +
                '}';
    }

}