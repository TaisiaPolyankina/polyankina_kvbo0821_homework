package polyankina_kvbo0821.prac13.hw13_3;

public class Adress {

    private String country;
    private String region;
    private String city;
    private String street;
    private String house;
    private String corpus;
    private String flat;

    public void getCountryV1(String s1){
        String[] words = s1.split(",");
        country = words[0];
        region = words[1];
        city = words[2];
        street = words[3];
        house = words[4];
        corpus = words[5];
        flat = words[6];
    }

    public void getCountryV2(String s1){
        String[] words = s1.split("[,;.]");
        country = words[0];
        region = words[1];
        city = words[2];
        street = words[3];
        house = words[4];
        corpus = words[5];
        flat = words[6];
    }
    public String getCountry() {
        return country;
    }

    public String getRegion() {
        return region;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getHouse() {
        return house;
    }

    public String getCorpus() {
        return corpus;
    }

    public String getFlat() {
        return flat;
    }

}
