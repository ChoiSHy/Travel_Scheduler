package co.kr.travelscheduler.domain.Schedule;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Schedule {
    @Id
    UUID id;
}
