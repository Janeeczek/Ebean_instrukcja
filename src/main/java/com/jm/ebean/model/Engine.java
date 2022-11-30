package com.jm.ebean.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.List;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="engine")
public class Engine extends BaseModel {
    private String name;
    private Double power;
    @OneToMany(mappedBy="engine")
    List<Car> cars;
}
