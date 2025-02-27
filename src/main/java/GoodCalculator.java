public class GoodCalculator {
    String goodName;
    String goodSumName = "Добавленные товары:";
    double goodPrice;
    double goodSumPrice;

    GoodCalculator() {
        String goodName = "";
        double goodPrice;
        double goodSumPrice = 0.0;
    }

    void addGood(String goodName, double goodPrice) {
        this.goodSumName = goodSumName + "\n" + goodName + ": " + goodPrice + " " + rubleEnding(goodPrice);
        this.goodSumPrice += goodPrice;
    }

    String rubleEnding(double rubleValue) {
        int rubleValueInt = (int) (Math.floor(rubleValue));
        String result;

        if ((rubleValueInt % 100 > 10) && (rubleValueInt % 100 < 20)) {
            result = "рублей";
        }
        else {
            switch (rubleValueInt % 10) {
                case 1:
                    result = "рубль";
                    break;

                case 2:
                case 3:
                case 4:
                    result = "рубля";
                    break;

                default:
                    result = "рублей";
                    break;
            }
        }

        return result;

    }

}
