package polyankina_kvbo0821.prac4_1.hw_4_1_2;

class Phone {
    private String number;
    private String model;
    private double weight;

    public void receiveCall(String abonent_name){
        System.out.println(abonent_name + " is calling you");
    }
    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }
    public Phone(String number, String model, double weight) {
        this(number,model);
        this.weight = weight;
    }

    public void setNumber(String number) {
        this.number = number;
    }
    public String getNumber() {
        return number;
    }


    public void receiveCall(String abonent_name, String abonent_number){
        System.out.println(abonent_name + " is calling you, the number is " + abonent_number);
    }
    public void sendMessage(String... numbers){
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Sms is sent to:");
            System.out.println(numbers[i]);
        }
    }
}

class Tester {
    public static void main(String[] args) {
        Phone phone_1 = new Phone("8 313 454 51-27","huawei",400);
        Phone phone_2 = new Phone("8 834 231 12-13","samsung",200);
        Phone phone_3 = new Phone("8 734 832 11-13","xiaomi",250);
        phone_1.receiveCall("Vlad");
        phone_2.receiveCall("Victor");
        phone_3.receiveCall("Victoria");
        phone_1.receiveCall("Varya","8 800 535 35-35");
        phone_1.sendMessage(phone_1.getNumber(),phone_2.getNumber(),phone_3.getNumber());
    }
}