package lesson_08;

public class HouseWithBuilder {
    private int doorNum = 1;
    private String topRoofColor = "Red";
    private String color = "White";

    public HouseWithBuilder() {
    }

    // Protected_chi cho thang con cua no dung thoi khong cho ra ngoai class, thuc hien chi readonly
    protected HouseWithBuilder(Builder builder) {
        doorNum = builder.doorNum;
        topRoofColor = builder.topRoofColor;
        color = builder.color;
    }
    //READ ONLY

    public int getDoorNum() {
        return doorNum;
    }

    public String getTopRoofColor() {
        return topRoofColor;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "HouseWithBuilder{" +
                "doorNum=" + doorNum +
                ", topRoofColor='" + topRoofColor + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    // Customer service| Inner class
    public static class Builder {
        private int doorNum = 1;
        private String topRoofColor = "Red";
        private String color = "White";

        // WRITE ONLY_Setter


        public Builder setDoorNum(int doorNum) {
            this.doorNum = doorNum;
            return this;
        }

        public Builder setTopRoofColor(String topRoofColor) {
            this.topRoofColor = topRoofColor;
            return this;
        }

        public Builder setColor(String color) {
            this.color = color;
            return this;
        }

        public HouseWithBuilder build() {
            //this o day la nhung object duoc sinh ra tu HouseWithBuilder nay
            return new HouseWithBuilder(this);
        }
    }
}
