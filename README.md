# StockLedger

A stock management application for tracking inventory movements and sales.

## Features

- Track stock movements (sales, adjustments, restocks)
- Manage product inventory
- Process sales transactions
- Automatically generate changelog

## Changelog Automation

This project includes an automated changelog generation system that updates the CHANGELOG.md file before each push to the repository. The automation is implemented using a Git pre-push hook.

### How It Works

1. When you push changes to the repository, the pre-push hook automatically runs.
2. The hook collects all the commits that are about to be pushed.
3. It updates the CHANGELOG.md file with these commits, organizing them by date.
4. The updated CHANGELOG.md file is automatically committed before the push completes.

### Manual Update

If you need to update the changelog manually, you can run:

```bash
bash .git/hooks/pre-push
```

### Customizing the Changelog

The changelog format follows the [Keep a Changelog](https://keepachangelog.com/en/1.0.0/) conventions. If you want to customize the format or behavior of the changelog generation, you can edit the pre-push hook script located at `.git/hooks/pre-push`.

## Setup

1. Clone the repository
2. Configure your database settings in `application.properties`
3. Run the application using Spring Boot

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- Git Hooks for automation