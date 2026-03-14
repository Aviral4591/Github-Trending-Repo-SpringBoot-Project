# Github-Trending-Repo-SpringBoot-Project

## Overview
A Spring Boot CLI application that fetches trending repositories
from the GitHub API and displays them in the terminal.

## Features
- Fetch repositories using GitHub API
- Filter by duration (day, week, month, year)
- Sort by star count
- CLI arguments support
- Error handling for API failures

## Tech Stack
- Java
- Spring Boot
- GitHub REST API
- Maven

## CLI Arguments

| Argument | Description | Default |
|---------|-------------|--------|
| --duration | day, week, month, year | week |
| --limit | Number of repositories | 10 |

## Example Usage

```bash
java -jar trending-repos.jar --duration month --limit 20
