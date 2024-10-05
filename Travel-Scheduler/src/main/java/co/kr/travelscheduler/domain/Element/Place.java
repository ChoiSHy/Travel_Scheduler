package co.kr.travelscheduler.domain.Element;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Place extends Element{
    @Id
    UUID id;

    double x;
    double y;
    String addr;

}
