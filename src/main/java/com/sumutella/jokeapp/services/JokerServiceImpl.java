package com.sumutella.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

/**
 * @author sumutella
 * @time 11:50 AM
 * @since 11/27/2019, Wed
 */
@Service
public class JokerServiceImpl implements JokerService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    public JokerServiceImpl() {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}
