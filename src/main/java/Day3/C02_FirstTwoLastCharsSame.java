package Day3;

public class C02_FirstTwoLastCharsSame {

    //Ilk iki ve son iki karekteri ayni olan kelimeyi bulan method
    //BABA -->TRUE , AA -->TRUE, A -->fALSE

    public boolean checkIfFirstTwoLastAreSame(String str){

        if (str.length()<=1) return false;
        if (str.length()==2) return true;

        String firstTwoChars = str.substring(0,2);
        String lastTwoChars = str.substring(str.length()-2);

        return firstTwoChars.equals(lastTwoChars);

    }


}
