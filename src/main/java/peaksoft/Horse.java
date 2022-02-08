package peaksoft;

public class Horse implements Animal {
    private String bred;
    private String color;
    private long price;

    @Override
    public void animalPlus() {
        System.out.println("The horse is the wing of man");
    }

    @Override
    public void animalMinus() {
        System.out.println("The horse is very fat and kicks the owner");
    }

    public String getBred() {
        return bred;
    }

    public void setBred(String bred) {
        this.bred = bred;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "bred='" + bred + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                '}';
    }
}
