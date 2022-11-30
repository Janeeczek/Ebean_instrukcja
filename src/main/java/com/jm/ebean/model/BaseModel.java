package com.jm.ebean.model;

import io.ebean.Model;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
@Getter
@Setter
@MappedSuperclass
public abstract class BaseModel extends Model {
    @Id
    protected int id;
}
