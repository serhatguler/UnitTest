package Day3;

public class C01_StringModify {

    //Task: Kelimenin ilk iki harfinde iceridinde A varsa silinsin.
    //Kelimelerin hepsi buyuk harf

    public String deleteA(String str){
        if (str.length()<=2)
            return str.replace("A","");
        String firstTwoChar = str.substring(0,2);
        String afterLastTwoChar = str.substring(2);

        return firstTwoChar.replaceAll("A","") + afterLastTwoChar;
    }

}
