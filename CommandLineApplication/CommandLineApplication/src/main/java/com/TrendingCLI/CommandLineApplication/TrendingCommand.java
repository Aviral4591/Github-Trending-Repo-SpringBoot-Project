package com.TrendingCLI.CommandLineApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import picocli.CommandLine;

@CommandLine.Command(name = "trending-repos")
@Component
public class TrendingCommand implements CommandLineRunner {

    @CommandLine.Option(names = "--duration", defaultValue = "week")
    String duration;

    @CommandLine.Option(names = "--limit", defaultValue = "10")
    int limit;

    @Autowired
    TrendingClient trendingClient;

    @Override
    public void run(String... args) {
        trendingClient.printTrending(duration, limit);
    }
}
