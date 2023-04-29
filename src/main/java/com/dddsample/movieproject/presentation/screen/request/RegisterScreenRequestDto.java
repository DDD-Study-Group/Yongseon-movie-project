package com.dddsample.movieproject.presentation.screen.request;

import com.dddsample.movieproject.domain.movie.model.Movie;
import com.dddsample.movieproject.domain.screen.model.Screen;
import com.dddsample.movieproject.domain.screen.model.Tickets;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
@Builder
@AllArgsConstructor
public class RegisterScreenRequestDto {
    private LocalDateTime startedAt;
    private Integer tickets;

    public Screen toEntity(Movie movie) {
        return Screen.builder()
                .startedAt(startedAt)
                .tickets(Tickets.of(tickets))
                .runningTime(movie.getRunningTime())
                .movieId(movie.getId())
                .build();
    }
}