# Github-Trending-Repo-SpringBoot-Project
A CLI Application which will display Github's trending Repository usingSpringBoot 
Create a command-line interface (CLI) tool that interacts with the GitHub API to retrieve and display trending repositories. The tool will allow users to specify a time range (day, week, month, or year) to filter the trending repositories. 
The CLI tool will fetch data from the GitHub API and present it in a user-friendly format. The tool should be easy to use and provide clear output.


Language: Java (SpringBoot for backend)
GitHub API: Utilize the GitHub REST API for fetching repository data. 
Time Range Options: Support filtering by day, week, month, and year. 
Data Fetching: Implement error handling for API requests. 
Data Parsing: Parse the JSON response from the GitHub API. 
Sorting: Sort repositories by star count.
Output Formatting: Display the trending repositories in a clear and readable format (e.g., repository name, description, number of stars, language). 
Command-Line Arguments: --duration: Specifies the time i.e. day, week, month, year). Default to week. --limit: Specifies the number of repositories to display. Default to 10.
Example Usage: trending-repos --duration month --limit 20 using Java and SpringBoot for backend ,could use microservices
