# ShopHub Mobile

This folder contains the Kotlin codebase for the ShopHub mobile application (Android).

## Folder Structure

- **domain models/** - Core business logic models used throughout the app
- **data classes/** - API response models that match the backend JSON structure
- **repository/** - Repository classes that fetch and manage data from various sources

## Architecture

The app follows a clean architecture pattern:
1. **Data Classes** - Raw API responses from the backend
2. **Domain Models** - Business logic models with methods and validations
3. **Repository** - Single source of truth for data, handles API calls and data mapping
