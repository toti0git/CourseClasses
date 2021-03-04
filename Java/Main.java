import enums.ChargingTypeEnums;
import enums.ModelEnums;
import model.Phone;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    private static Phone adamsPhone = new Phone("Brown", "Adam", ChargingTypeEnums.TYPE_C.toString(), ModelEnums.IPHONE.toString());
    private static Phone johnsPhone = new Phone("Tom", "Tailor", ChargingTypeEnums.STANDART.toString(), ModelEnums.HUAWEI.toString());
    private static Phone[] allPhones = {adamsPhone, johnsPhone};

    static void searchPhoneByName(String name) {

        switch (name) {

            case "Adam":
                System.out.println("Phone's owner found ");
                System.out.println(String.valueOf(adamsPhone.getName()) + '\n' +
                        adamsPhone.getSecondName().toString() + '\n' +
                        adamsPhone.getModel().toString() + '\n' +
                        adamsPhone.getCharging().toString());
                break;
            case "Tailor":
                System.out.println("Phone's owner found ");
                System.out.println(String.valueOf(johnsPhone.getName()) + '\n' +
                        johnsPhone.getSecondName().toString() + '\n' +
                        johnsPhone.getModel().toString() + '\n' +
                        johnsPhone.getCharging().toString());
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + name);
        }

    }

//    public static void searchByModel(Phone[] phone, ModelEnums modelEnums, Phone phone1) {
//        for (int i = 0; i < phone.length; i++) {
//            // Arrays.stream(phone).forEachOrdered(phone1 -> System.out.println(""));
//            // Arrays.stream(phone).filter(phone1.getModel().equals("Huawei"));
//            //if (Arrays.stream(phone).filter(){
//            //  String[] newList=  Arrays.stream(phone).filter(phone2 -> phone2.getModel().equals(ModelEnums.HUAWEI));
//            Stream<Phone> newList = Arrays.stream(phone).filter(phone2 -> phone2.getModel().equals(ModelEnums.HUAWEI));
//            System.out.println(newList);
//        }
////            System.out.println+'\n'+
////                    phone1.getSecondName()+'\n'
////            +phone1.getCharging()+'\n'+
////                    phone1.getModel());
//    }
//    //  }


    public static void main(String[] args) {
        String name = String.valueOf(args[0]);

        searchPhoneByName(name);
        //searchByModel(allPhones, ModelEnums.HUAWEI, adamsPhone);
    }


}