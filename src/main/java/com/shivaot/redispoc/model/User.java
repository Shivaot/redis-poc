package com.shivaot.redispoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

@Data
@AllArgsConstructor
public class User implements Serializable {
    String id;
    String name;
    Long salary;
}
