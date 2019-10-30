package com.quickpoll.domain;

import javax.persistence.*;

import javax.persistence.Entity;

@Entity
    public class Option {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        @Column(name = "OPTION_ID")
        private Long id;
        @Column(name = "OPTION_VALUE")
        private String value;
        // Getters and Setters omitted for brevity

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

