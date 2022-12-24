package polyankina_kvbo0821.prac13.hw13_3;

public class Tester {

    public static void printAdress(Adress a) {
        System.out.println(a.getCountry() + ' ' + a.getRegion() + ' ' + a.getCity() + ' '
                + ' ' + a.getStreet() + ' ' + a.getCorpus() + ' ' + a.getHouse() + ' ' + a.getFlat());
    }

    public static void main(String[] args) {

        Adress a1 = new Adress();
        Adress a2 = new Adress();
        Adress a3 = new Adress();
        Adress a4 = new Adress();

        a1.getCountryV1("Russia,Msk,Moscow,Lobachevskogo,12,1,34");
        a2.getCountryV2("Russia;Msk.Lobnya;Lenina,9,19,321");
        a3.getCountryV2("Russia,Sbp,Saint-Petersburg,Revolucii,16,2,14");
        a4.getCountryV2("Russia;OmskayaOblast;Omsk;Solncevskaya;13;8;7");

        printAdress(a1);
        printAdress(a2);
        printAdress(a3);
        printAdress(a4);
    }
}
