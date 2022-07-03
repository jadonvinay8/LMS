package com.knf.dev.librarymanagementsystem.entity;

import lombok.Data;

@Data
public class UserToBook {

    private long id;
    private long bookId;
    private long userId;

}
