package polyankina_kvbo0821.prac4.hw4_ex1;

import java.util.Scanner;

public class prac4Ex1IMPROVED {
    public enum Seasons {
        Winter (-7),
        Spring (8),
        Summer (17),
        Autumn (5);

        private final int avr_temp;
        Seasons(int avr_temp) {
            this.avr_temp = avr_temp;
        }

        public int getAvr_temp() {
            return avr_temp;
        }

        public void favouriteSeason(Seasons season) {
            System.out.printf("Мой любимый сезон -- %s\nИнформация о нём: \n",
                    season.seasonNameTranslated(season, true));
            describeAllSeasons descriprion = new describeAllSeasons();

            System.out.printf("Средняя температура: %s\nОбщая характеристика: %s\n",
                    season.getAvr_temp(), descriprion.getDescription(season));
        }

        public String seasonNameTranslated(Seasons season, boolean option) {
            String s = "";
            if (option) {
                switch (season.name()) {
                    case ("Winter") -> s = "зима";
                    case ("Spring") -> s = "весна";
                    case ("Summer") -> s = "лето";
                    case ("Autumn") -> s = "осень";
                }
            }
            else {
                s = switch (season.name()) {
                    case ("Winter") -> "зиму";
                    case ("Spring") -> "весну";
                    case ("Summer") -> "лето";
                    case ("Autumn") -> "осень";
                    default -> s;
                };
            }
            return (s);
        }

        public void seasonBelovedByUser(Seasons season) {
            System.out.printf("Я люблю %s\n", season.seasonNameTranslated(season, false));
        }
    }


    public static class describeColdSeason {
        public String getDescription(Seasons season) {
            return("Холодное время года");
        }
    }

    public static class describeAllSeasons extends describeColdSeason {
        @Override
        public String getDescription(Seasons season) {
            String s = "";
            switch (season.name()) {
                case ("Winter") -> s = "Холодное время года";
                case ("Spring") -> s = "Тёплое время года, переходный сезон";
                case ("Summer") -> s = "Тёплое время года";
                case ("Autumn") -> s = "Холодное время года, переходный сезон";
            }
            return (s);
        }
    }

    public static void main(String[] args) {
        Scanner source = new Scanner(System.in);
        Seasons season = Seasons.Spring;
        season.favouriteSeason(season);
        System.out.println("Введите название сезона: зима, весна, лето или осень");
        String name = source.nextLine();
        switch (name) {
            case ("зима") -> season = Seasons.Winter;
            case ("лето") -> season = Seasons.Summer;
            case ("осень") -> season = Seasons.Autumn;
        }
        season.seasonBelovedByUser(season);
        System.out.println("Информация обо всех сезонах: ");
        describeAllSeasons description = new describeAllSeasons();
        for (int i = 0; i < 4; i ++) {
            season = Seasons.values()[i];
            String s = String.format("Название сезона -- %s\n", season.seasonNameTranslated(season, true));
            s = s + "Общая характеристика: " + description.getDescription(season);
            s = s + String.format("\nСредняя температура: %d\n", season.getAvr_temp());
            System.out.println(s);
        }
    }
}
