package co.kr.travelscheduler.domain.Element;

import co.kr.travelscheduler.domain.Review.Review;
import co.kr.travelscheduler.domain.Schedule.Schedule;
import jakarta.persistence.*;

import java.util.Date;
import java.util.List;
import java.util.UUID;

public abstract class Element {
    Integer code;
    Integer offset;
    String name;
    Date sDate;
    Date eDate;
    List<Review> reviews;
    Schedule schedule;
}
