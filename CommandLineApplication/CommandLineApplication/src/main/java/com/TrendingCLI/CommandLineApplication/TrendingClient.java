package com.TrendingCLI.CommandLineApplication;

import com.TrendingCLI.CommandLineApplication.Models.RepositoryItem;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class TrendingClient {

    private final WebClient webClient = WebClient.create("http://localhost:8080");

    public void printTrending(String duration, int limit) {
        List<RepositoryItem> repos = webClient.get()
                .uri("/api/trending?duration={d}&limit={l}", duration, limit)
                .retrieve()
                .bodyToFlux(RepositoryItem.class)
                .collectList()
                .block();

        repos.forEach(r ->
                System.out.printf("⭐ %d | %s | %s | %s%n",
                        r.getStargazers_count(),
                        r.getFull_name(),
                        r.getLanguage(),
                        r.getDescription())
        );
    }
}

