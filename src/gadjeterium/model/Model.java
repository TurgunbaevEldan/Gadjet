package gadjeterium.model;

import gadjeterium.enums.Category;

import java.time.LocalDate;

public class Model {
    private Long id;
    private int price;
    private double discount;
    private LocalDate localDate;
    private Category category;
    public Model(){

    }
    public Model(Long id, int price, double discount, LocalDate localDate, Category category) {
        this.id = id;
        this.price = price;
        this.discount = discount;
        this.localDate = localDate;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Model{" +
                "id=" + id +
                ", price=" + price +
                ", discount=" + discount +
                ", localDate=" + localDate +
                ", category=" + category +
                '}';
    }
}
