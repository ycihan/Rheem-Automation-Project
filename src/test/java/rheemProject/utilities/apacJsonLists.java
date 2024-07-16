package rheemProject.utilities;

import java.util.ArrayList;
import java.util.List;

public class apacJsonLists {
    public static List<String> selectProductName(String siteName, String pageName) {

        List<String> productNameList = new ArrayList<>();
        List<String> productDetailsList = new ArrayList<>();

        switch (siteName)
        {
            case "singapore":

                switch (pageName)
                {
                    case "Electric Instant Water Heaters":
                        productNameList.add("Royal Instant Water Heater");
                        productNameList.add("Royal Plus Instant Water Heater");
                        productNameList.add("Royal Platinum Instant Water Heater");
                        productNameList.add("RH188 Electric Instant Water Heater");
                        productNameList.add("Prestige Platinum Black Instant Water Heater");
                        productNameList.add("Prestige Platinum Instant Water Heater");
                        productNameList.add("Prestige Plus Instant Water Heater");
                        productNameList.add("Prestige Instant Water Heater");
                        productNameList.add("Classic Plus Electric Instantaneous Water Heater");
                        break;
                    case "Electric Storage Water Heaters":
                        productNameList.add("Xwell Slim Classic Plus Electric Storage Water Heater");
                        productNameList.add("Xwell Cube Classic Plus Electric Storage Water Heater");
                        productNameList.add("EHG Smart Wifi Classic Electric Storage Water Heater");
                        productNameList.add("EHG Slim Smart Wifi Classic Electric Storage Water Heater");
                        productNameList.add("RCY Classic Plus Electric Storage Water Heater");
                        productNameList.add("EHG Slim Classic Electric Storage Water Heater");
                        productNameList.add("EHG Classic Electric Storage Water Heater");
                        productNameList.add("85VP-65SVP Classic Electric Storage Water Heater");
                        productNameList.add("86VP Classic Electric Storage Water Heaters");
                        productNameList.add("86H Classic Electric Storage Water Heater");
                        productNameList.add("EH Classic Electric Storage Water Heater");
                        break;
                    case "Solar Water Heaters":
                        productNameList.add("Premier Loline Solar Water Heater");
                        productNameList.add("Premier Hiline Solar Water Heater");
                        break;
                    case"Centralized Control Panels":
                        productNameList.add("Integrated Control Panel for Commercial Centralized Hot Water System");
                        break;
                    case"Commercial Electric Storage Water Heaters":
                        productNameList.add("82V Series Floor Mounted Electric Water Heater");
                        productNameList.add("Heavy Duty Electric Water Heater");
                        productNameList.add("85V Series Floor Mounted Electric Water Heater");
                        break;
                    case"Gas-Fired Water Heaters":
                        productNameList.add("Universal Commercial Gas Tank Water Heater");
                        break;
                    case"Heat Pump Water Heaters":
                        productNameList.add("RHP-5207C ProTerra Series Heat Pump Water Heater");
                        productNameList.add("RHP-2805 ProTerra Series Heat Pump Water Heater");
                        productNameList.add("Rheem HDi Series All In One Heat Pump Water Heater");
                        productNameList.add("Rheem Thermal Pool Heat Pump Water Heater");
                        productNameList.add("Rheem MPi Series All In One Heat Pump Water Heater");
                        productNameList.add("Rheem Thermal Hot Water Heat Pump Water Heater");
                        productNameList.add("Rheem RHP Series All in One Heat Pump Water Heater");
                        break;
                    case"Hot Water Storage Tanks":
                        productNameList.add("Storage Tank");
                        break;
                    case"Tankless Electric Water Heaters":
                        productNameList.add("Professional Classic Tankless Electric Water Heaters");
                        break;
                    case"Thermal Expansion Tanks":
                        productNameList.add("Therm-X-Guard");
                        break;
                }
                break;
            case "philippines":

                switch (pageName)
                {
                    case "Electric Instant Water Heaters":
                        productNameList.add("RH188 Electric Instant Water Heater");
                        productNameList.add("Prestige Platinum Instant Water Heater");
                        productNameList.add("RTEC-06 Multipoint Instant Water Heater");
                        productNameList.add("Prestige Plus Instant Water Heater");
                        productNameList.add("Prestige Instant Water Heater");
                        break;
                    case "Electric Storage Water Heaters":
                        productNameList.add("RCY Classic Plus Electric Storage Water Heater");
                        productNameList.add("85VP-65SVP Classic Electric Storage Water Heater");
                        productNameList.add("86VP Classic Electric Storage Water Heaters");
                        productNameList.add("86H Classic Electric Storage Water Heater");
                        break;
                    case "Solar Water Heaters":
                        productNameList.add("Premier Loline Solar Water Heater");
                        productNameList.add("Premier Hiline Solar Water Heater");
                        break;
                    case"Commercial Centralized Control Panels":
                        productNameList.add("Integrated Control Panel for Commercial Centralized Hot Water System");
                        break;
                    case"Commercial Electric Storage Water Heaters":
                        productNameList.add("Heavy Duty Electric Water Heater");
                        productNameList.add("82V Series Floor Mounted Electric Water Heater");
                        productNameList.add("85V Series Floor Mounted Electric Water Heater");
                        break;
                    case"Commercial Gas-Fired Water Heaters":
                        productNameList.add("Universal Commercial Gas Tank Water Heater");
                        productNameList.add("Heavy Duty Gas-Fired Water Heaters");
                        break;
                    case"Commercial Heat Pump Water Heaters":
                        productNameList.add("Rheem Thermal Hot Water Heat Pump Water Heater");
                        productNameList.add("Rheem Thermal Pool Heat Pump Water Heater");
                        productNameList.add("Professional Prestige ProTerra Hybrid Electric Heat Pump with LeakGuard");
                        break;
                    case"Commercial Hot Water Storage Tanks":
                        productNameList.add("Storage Tank");
                        break;
                    case"Commercial Tankless Electric Water Heaters":
                        productNameList.add("Professional Classic Tankless Electric Water Heaters");
                        break;
                    case"Commercial Thermal Expansion Tanks":
                        productNameList.add("Therm-X-Guard");
                        break;
                }
                break;
            case "vietnam":
                switch (pageName) {
                    case "Electric Instant Water Heaters":
                        productNameList.add("RH688 Electric Instant Water Heater");
                        break;
                    case "Electric Storage Water Heaters":
                        productNameList.add("Xwell Cube Classic Plus Electric Storage Water Heater");
                        productNameList.add("Xwell Slim Classic Plus Electric Storage Water Heater");
                        productNameList.add("86H Classic Electric Storage Water Heater");
                        productNameList.add("86VP Classic Electric Storage Water Heaters");
                        break;
                    case "Solar Water Heaters":
                        productNameList.add("Premier Hiline Solar Water Heater");
                        productNameList.add("Premier Loline Solar Water Heater");
                        break;
                    case"Commercial Centralized Control Panels":
                        productNameList.add("85V Series Floor Mounted Electric Water Heater");
                        productNameList.add("82V Series Floor Mounted Electric Water Heater");
                        productNameList.add("Heavy Duty Electric Water Heater");
                        break;
                    case"Commercial Electric Storage Water Heaters":
                        productNameList.add("Storage Tank");
                        break;
                    case"Commercial Gas-Fired Water Heaters":
                        break;
                    case"Commercial Heat Pump Water Heaters":
                        break;
                    case"Commercial Hot Water Storage Tanks":
                        break;
                    case"Commercial Tankless Electric Water Heaters":
                        break;
                    case"Commercial Thermal Expansion Tanks":
                        break;
                }
                break;
            case"malaysia":
                switch (pageName) {
                    case "Electric Instant Water Heaters":
                        productNameList.add("Prestige Platinum Instant Water Heater");
                        productNameList.add("Prestige Plus Instant Water Heater");
                        productNameList.add("Prestige Instant Water Heater");
                        productNameList.add("RH188 Electric Instant Water Heater");
                        productNameList.add("RH688 Electric Instant Water Heater");
                        break;
                    case "Electric Storage Water Heaters":
                        productNameList.add("RCY Classic Plus Electric Storage Water Heater");
                        productNameList.add("86VP Classic Electric Storage Water Heaters");
                        productNameList.add("EHG Classic Electric Storage Water Heater");
                        productNameList.add("86H Classic Electric Storage Water Heater");
                        break;
                    case "Solar Water Heaters":
                        productNameList.add("Premier Hiline Solar Water Heater");
                        productNameList.add("Premier Loline Solar Water Heater");
                        break;
                    case"Commercial Centralized Control Panels":
                        productNameList.add("Integrated Control Panel for Commercial Centralized Hot Water System");
                        break;
                    case"Commercial Electric Storage Water Heaters":
                        productNameList.add("Heavy Duty Electric Water Heater");
                        productNameList.add("85V Series Floor Mounted Electric Water Heater");
                        productNameList.add("82V Series Floor Mounted Electric Water Heater");
                        break;
                    case"Commercial Gas-Fired Water Heaters":
                        productNameList.add("Heavy Duty Gas-Fired Water Heaters");
                        productNameList.add("Universal Commercial Gas Tank Water Heater");
                        break;
                    case"Commercial Heat Pump Water Heaters":
                        productNameList.add("Rheem RHP Series All in One Heat Pump Water Heater");
                        productNameList.add("Rheem HDi Series All In One Heat Pump Water Heater");
                        productNameList.add("Rheem Thermal Hot Water Heat Pump Water Heater");
                        productNameList.add("Rheem MPi Series All In One Heat Pump Water Heater");
                        productNameList.add("Rheem Thermal Pool Heat Pump Water Heater");
                        break;
                    case"Commercial Hot Water Storage Tanks":
                        productNameList.add("Storage Tank");
                        break;
                    case"Commercial Tankless Electric Water Heaters":
                        productNameList.add("Professional Classic Tankless Electric Water Heaters");
                        break;
                    case"Commercial Thermal Expansion Tanks":
                        productNameList.add("Therm-X-Guard");
                        break;
                }
                break;
            case"indonesia":
                switch (pageName) {
                    case "Tankless Electric Water Heaters":
                        productNameList.add("Professional Classic Tankless Electric Water Heaters");
                        break;
                    case "Electric Storage Water Heaters":
                        productNameList.add("Xwell Cube Classic Plus Electric Storage Water Heater");
                        productNameList.add("RC Plus Classic Plus Electric Storage Water Heaters");
                        productNameList.add("EHG Classic Electric Storage Water Heater");
                        productNameList.add("RCY Electric Storage Water Heater");
                        productNameList.add("RV Plus Classic Electric Storage Water Heater");
                        productNameList.add("Xwell Slim Classic Plus Electric Storage Water Heater");
                        break;
                    case "Solar Water Heaters":
                        productNameList.add("SS Indirect Solar Water Heater");
                        productNameList.add("VE Direct Solar Water Heater");
                        break;
                    case"Commercial Centralized Control Panels":
                        productNameList.add("Integrated Control Panel for Commercial Centralized Hot Water System");
                        break;
                    case"Commercial Electric Storage Water Heaters":
                        break;
                    case"Commercial Gas-Fired Water Heaters":
                        break;
                    case"Commercial Heat Pump Water Heaters":
                        break;
                    case"Commercial Hot Water Storage Tanks":
                        break;
                    case"Commercial Tankless Electric Water Heaters":
                        break;
                    case"Commercial Thermal Expansion Tanks":
                        break;
                }
                break;
            case"asia":
                switch (pageName) {
                    case "Electric Instant Water Heaters":
                        productNameList.add("RH188 Electric Instant Water Heater");
                        productNameList.add("Prestige Platinum Instant Water Heater");
                        productNameList.add("Prestige Platinum Black Instant Water Heater");
                        productNameList.add("Prestige Plus Instant Water Heater");
                        productNameList.add("Prestige Instant Water Heater");
                        productNameList.add("RTEC-06 Multipoint Instant Water Heater");
                        productNameList.add("Classic Plus Electric Instantaneous Water Heater");
                        break;
                    case "Electric Storage Water Heaters":
                        productNameList.add("Xwell Slim Classic Plus Electric Storage Water Heater");
                        productNameList.add("Xwell Cube Classic Plus Electric Storage Water Heater");
                        productNameList.add("RCY Classic Plus Electric Storage Water Heater");
                        productNameList.add("RFA Classic Plus Electric Storage Water Heater");
                        productNameList.add("EHG Smart Wifi Classic Electric Storage Water Heater");
                        productNameList.add("EHG Slim Smart Wifi Classic Electric Storage Water Heater");
                        productNameList.add("RC Plus Classic Plus Electric Storage Water Heaters");
                        productNameList.add("EHG Slim Classic Electric Storage Water Heater");
                        productNameList.add("EHG Classic Electric Storage Water Heater");
                        productNameList.add("85VP-65SVP Classic Electric Storage Water Heater");
                        productNameList.add("86VP Classic Electric Storage Water Heaters");
                        productNameList.add("86H Classic Electric Storage Water Heater");
                        productNameList.add("EV Classic Electric Storage Water Heater");
                        productNameList.add("EH Classic Electric Storage Water Heater");
                        productNameList.add("RVE Classic Electric Storage Water Heater");
                        productNameList.add("RHE Classic Electric Storage Water Heater");
                        break;
                    case "Solar Water Heaters":
                        productNameList.add("Premier Hiline Solar Water Heater");
                        productNameList.add("Premier Loline Solar Water Heater");
                        break;
                    case"Commercial Centralized Control Panels":
                        productNameList.add("Integrated Control Panel for Commercial Centralized Hot Water System");
                        break;
                    case"Commercial Electric Storage Water Heaters":
                        productNameList.add("85V Series Floor Mounted Electric Water Heater");
                        productNameList.add("Heavy Duty Electric Water Heater");
                        productNameList.add("82V Series Floor Mounted Electric Water Heater");
                        break;
                    case"Commercial Gas-Fired Water Heaters":
                        productNameList.add("Heavy Duty Gas-Fired Water Heaters");
                        productNameList.add("Universal Commercial Gas Tank Water Heater");
                        break;
                    case"Commercial Heat Pump Water Heaters":
                        productNameList.add("RHP-5207C ProTerra Series Heat Pump Water Heater");
                        productNameList.add("RHP-2805 ProTerra Series Heat Pump Water Heater");
                        productNameList.add("Rheem Thermal Hot Water Heat Pump Water Heater");
                        productNameList.add("Rheem MPi Series All In One Heat Pump Water Heater");
                        productNameList.add("Rheem RHP Series All in One Heat Pump Water Heater");
                        productNameList.add("Rheem HDi Series All In One Heat Pump Water Heater");
                        productNameList.add("Rheem Thermal Pool Heat Pump Water Heater");
                        break;
                    case"Commercial Hot Water Storage Tanks":
                        productNameList.add("Storage Tank");
                        break;
                    case"Commercial Tankless Electric Water Heaters":
                        productNameList.add("Professional Classic Tankless Electric Water Heaters");
                        break;
                    case"Commercial Thermal Expansion Tanks":
                        productNameList.add("Therm-X-Guard");
                        break;
                }
                break;
        }
        return productNameList;

    }


}
