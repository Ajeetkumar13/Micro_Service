package com.rating.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Rating {

    @Id
    //@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;

}
