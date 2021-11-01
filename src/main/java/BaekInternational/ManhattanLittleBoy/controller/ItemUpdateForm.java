package BaekInternational.ManhattanLittleBoy.controller;

import BaekInternational.ManhattanLittleBoy.domain.ItemDetail;
import BaekInternational.ManhattanLittleBoy.domain.Question;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class ItemUpdateForm {
    private String newItemName;
    private int newItemPrice;
    private String newItemContents;
}
