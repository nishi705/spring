package com.stackroute.domain;

public class Movie {

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }

    Actor actor;
    Movie(Actor actor)
    {
        this.actor = actor;
    }
}
