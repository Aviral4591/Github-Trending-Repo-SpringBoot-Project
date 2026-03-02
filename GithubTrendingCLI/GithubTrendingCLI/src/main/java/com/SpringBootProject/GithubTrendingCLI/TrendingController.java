package com.SpringBootProject.GithubTrendingCLI;

import com.SpringBootProject.GithubTrendingCLI.Models.RepositoryItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/trending")
public class TrendingController {

    @Autowired
    private GitHubService gitHubService;

    @GetMapping
    public List<RepositoryItem> getTrending(
            @RequestParam(defaultValue = "week") String duration,
            @RequestParam(defaultValue = "10") int limit) {

        return gitHubService.fetchTrending(duration, limit);
    }
}

