package com.dbcrud.models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;
    @ManyToOne(targetEntity = PickPoint.class, fetch = FetchType.EAGER)
    @JoinColumn(name = "pickPoint_id")
    private PickPoint pickPoint;
    private LocalDate date;
    private BigDecimal sum;
    @ManyToOne(targetEntity = Client.class,fetch = FetchType.EAGER)
    @JoinColumn(name="client_id")
    private Client client;
    @OneToMany(mappedBy = "order",fetch = FetchType.EAGER)
    private List<OrderItem> itemList=new ArrayList<>();

    public Order(PickPoint pickPoint, LocalDate date, BigDecimal sum, Client client, OrderItem item) {
        this.pickPoint = pickPoint;
        this.date = date;
        this.sum = sum;
        this.client = client;
        this.itemList.add(item);
    }

    public String toString(){
        return String.format(
                "Order[id="+id+", location="+pickPoint+
                        ", date="+date+", sum="+sum+", client="+client+", item="+itemList+"]"
        );
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public PickPoint getPickPoint() {
        return pickPoint;
    }

    public void setPickPoint(PickPoint pickPoint) {
        this.pickPoint = pickPoint;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public BigDecimal getSum() {
        return sum;
    }

    public void setSum(BigDecimal sum) {
        this.sum = sum;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getItemList() {
        return itemList;
    }

    public void setItemList(List<OrderItem> itemList) {
        this.itemList = itemList;
    }
}
