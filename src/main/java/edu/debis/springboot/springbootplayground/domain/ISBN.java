package edu.debis.springboot.springbootplayground.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "ISBN")
@Data
public class ISBN {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private String code;
        private String area;
        private String publisher;

}
