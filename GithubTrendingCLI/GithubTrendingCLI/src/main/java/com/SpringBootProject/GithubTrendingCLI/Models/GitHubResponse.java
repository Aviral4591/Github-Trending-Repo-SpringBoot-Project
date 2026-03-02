package com.SpringBootProject.GithubTrendingCLI.Models;

import lombok.Data;

import java.util.List;

@Data
public class GitHubResponse {
    private List<RepositoryItem> items;
}

