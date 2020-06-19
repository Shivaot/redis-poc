package com.shivaot.redispoc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import org.springframework.data.redis.core.RedisHash;

import java.io.Serializable;

@RedisHash("Book")
@Data
@AllArgsConstructor
public class Book implements Serializable {

    String id;
    String name;
    String author;

}
