import java.util.HashMap;

public class VehicleRegistry {

    private static HashMap<LicensePlate, String> documents;

    public VehicleRegistry(){
        this.documents=new HashMap<>();
    }


    public boolean add(LicensePlate licensePlate, String owner){
        if(documents.get(licensePlate).isEmpty()){
            documents.put(licensePlate, owner);
            return true;
        }
        return false;
    }

    public static String get(LicensePlate licensePlate){
        return documents.get(licensePlate);
    }

    public boolean remove(LicensePlate licensePlate){
        if (documents.containsKey(licensePlate)){
            documents.remove(licensePlate);
            return true;
        }
        return false;

    }

    public void printLicensePlates(){

        System.out.println(documents.keySet());

    }

    public void printOwners(){

        System.out.println(documents.values());
    }


    public boolean equals(Object comparedObject){

        if (this==comparedObject){
            return  true;
        }

        if (!(comparedObject instanceof VehicleRegistry)){
            return false;
        }

        VehicleRegistry comparedVehicle=(VehicleRegistry) comparedObject;

        if (this.equals(comparedVehicle)){
            return true;
        }

        return false;
    }

}
