package com.example.ivan.webapiservice;

/**
 * Created by Ivan on 4/4/2016.
 */
public class RestService {
    private static final String URL = "http://10.0.2.2:5433/api/thesis";
    private retrofit.RestAdapter restAdapter;
    private InstituteService apiService;

    public RestService()
    {
        restAdapter = new retrofit.RestAdapter.Builder()
                .setEndpoint(URL)
                .setLogLevel(retrofit.RestAdapter.LogLevel.FULL)
                .build();

        apiService = restAdapter.create(InstituteService.class);
    }

    public InstituteService getService()
    {
        return apiService;
    }
}
