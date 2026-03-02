package com.SpringBootProject.GithubTrendingCLI;

import com.SpringBootProject.GithubTrendingCLI.Models.GitHubResponse;
import com.SpringBootProject.GithubTrendingCLI.Models.RepositoryItem;
import com.SpringBootProject.GithubTrendingCLI.Utils.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@Service
public class GitHubService {

    private final WebClient webClient = WebClient.create("https://api.github.com");

    public List<RepositoryItem> fetchTrending(String duration, int limit) {
        String date = DateUtil.calculateDate(duration);

        String url = "/search/repositories?q=created:>" + date +
                "&sort=stars&order=desc&per_page=" + limit;

        GitHubResponse response = webClient.get()
                .uri(url)
                .retrieve()
                .bodyToMono(GitHubResponse.class)
                .block();

        return response.getItems();
    }
}

