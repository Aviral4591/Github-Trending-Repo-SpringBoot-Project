package com.TrendingCLI.CommandLineApplication.Models;

import lombok.Data;

@Data
public class RepositoryItem {
    private String full_name;
    private String description;
    private String language;
    private int stargazers_count;
}

