package polyankina_kvbo0821.prac4.hw4_ex2;

import java.util.ArrayList;

// part 4 ex 2
public class AtelierTester {

    public enum sizes {
        XXS (32),
        XS (34),
        S (36),
        M (38),
        L (40);

        private final int euroSize;
        sizes(int euroSize) {
            this.euroSize = euroSize;
        }

        public int getEuroSize() {
            return euroSize;
        }

    }


    public static class describeSize {
        public String getDescription(sizes size) {
            return ("Взрослый размер");
        }
    }

    public static class describeAllSizes extends describeSize {
        @Override
        public String getDescription(sizes size) {
            if ("XXS".equals(size.name())) {
                return ("Детский размер");
            }
            return ("Взрослый размер");
        }
    }

    public static void main(String[] args) {

    }
}
