package com.capitoleconsulting.technicalqainterview.testengine.example.model;

import lombok.Getter;
import lombok.Setter;
import okhttp3.Response;

public class CoinGeckoInfo {

    @Getter @Setter
    Response healthResponse;
}
