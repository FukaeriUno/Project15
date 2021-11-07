package ru.netology.repository;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Movie {
        private int id;
        private String Name;
        private String Genre;
        private String image;
}
