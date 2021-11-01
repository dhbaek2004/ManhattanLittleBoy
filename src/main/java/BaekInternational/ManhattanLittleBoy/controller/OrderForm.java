package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.domain.*;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
public class OrderForm {

    private LocalDateTime orderDate;
    private String orderAddress;
    private int orderPrice;

    private OrderStatus orderStatus;
    private OrderPayment orderPayment;
    private int memberSequence;
    private List<OrderItem> orderItems;
    private Delivery delivery;
}
