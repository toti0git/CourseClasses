import enums.ChargingTypeEnums;
import enums.ModelEnums;
import model.Phone;

public class Main {

    private static Phone adamsPhone = new Phone("Brown", "Adam", ChargingTypeEnums.TYPE_C.toString(), ModelEnums.IPHONE.toString());
    private static Phone johnsPhone = new Phone("Tom", "Tailor", ChargingTypeEnums.STANDART.toString(), ModelEnums.HUAWEI.toString());
    private static Phone[] allPhones = {adamsPhone, johnsPhone};

    static void searchByModel(Phone[] phones, ModelEnums modelEnum){
    for (Phone phone:phones){
        if (phone.getModel().equals(modelEnum.toString())){
            System.out.println("Phone with model "+modelEnum +" is detected");
        }else {
           // System.out.println("Phone with model "+modelEnum +" is not detected");
        }
    }
    }
    static void searchByName(Phone[] phones, String ownersName){
        for (Phone phone:phones){
            if (phone.getName().equals(ownersName)){
                System.out.println("Phone with owner's name "+ownersName +" is detected");
            }else {
               // System.out.println("Phone with model "+modelEnum +" is not detected");
            }
        }
    }
    static void searchBySurname(Phone[] phones, String ownersSurname){
        for (Phone phone:phones){
            if (phone.getSecondName().equals(ownersSurname)){
                System.out.println("Phone with owner's surname "+ownersSurname +" is detected");
            }else {
                // System.out.println("Phone with model "+modelEnum +" is not detected");
            }
        }
    }
    static void searchChargingType (Phone[] phones,  ChargingTypeEnums chargingTypeEnum){
        for (Phone phone:phones){
            if (phone.getCharging().equals(chargingTypeEnum.toString())){
                System.out.println("Phone with owner's chargingType "+chargingTypeEnum +" is detected");
            }else {
                // System.out.println("Phone with model "+modelEnum +" is not detected");
            }
        }
    }


    static void showAllPhones(Phone[] phones){
        for (Phone phone:phones){
            System.out.println("Phones settings: " + phone.getModel());
        }
    }

    public static void main(String[] args) {
        String name = String.valueOf(args[0]);
        showAllPhones(allPhones);
        searchByModel(allPhones, ModelEnums.IPHONE);
        searchByName(allPhones, "Adam");

    }


}