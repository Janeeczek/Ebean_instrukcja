package com.jm.ebean.model;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
@Getter
@Setter
@RequiredArgsConstructor
@Entity
@Table(name="car")
public class Car extends BaseModel {
    private String name;
    @ManyToOne
    @JoinColumn(name="engine_id", nullable=false)
    private Engine engine;
}
