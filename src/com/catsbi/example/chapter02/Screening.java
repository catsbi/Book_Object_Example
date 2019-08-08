package com.catsbi.example.chapter02;

import java.time.LocalDateTime;

//상영 클래스
public class Screening
{
    /**
     * 상영할 영화(movie), 순번(sequence), 상영 시작 시간(whenScreen)을 인스턴스 변수로 가진다.
     * getStartTime(): 상영시작시간
     * isSequence(): 순번의 일치 여부
     * getMovieFee(): 기본 요금 반환환     */
    private Movie movie;
    private int sequence;
    private LocalDateTime whenScreen;

    public Screening(Movie movie, int sequence, LocalDateTime whenScreen)
    {
        this.movie = movie;
        this.sequence = sequence;
        this.whenScreen = whenScreen;
    }

    public LocalDateTime getStartTime()
    {
        return whenScreen;
    }
    public boolean isSequence(int sequence)
    {
        return this.sequence == sequence;
    }
    public Money getMovieFee(){
        return movie.getFee();
    }
}
