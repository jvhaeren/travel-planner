package com.julienvanhaeren.travelplanner.model;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "meals")
public class Meal extends BaseActivity  {

    @Column(name = "date")
    private LocalDate date;

    @ManyToOne
    @JoinColumn(name = "destination_id")
    private Destination destination;
}
