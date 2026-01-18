# Repository

This folder contains repository classes that manage data fetching and provide a single source of truth for the app.

## Purpose

Repositories are responsible for:
- Fetching data from API services
- Converting API response models (data classes) to domain models
- Managing data caching and offline support
- Providing clean data access methods to the rest of the app

## Current Repositories

- **ProductRepository.kt** - Manages product catalog data
  - `getAllProducts()` - Fetch all products
  - `getProductById()` - Fetch a specific product
  - `getProductsByCategory()` - Filter products by category
  - `getActiveProducts()` - Get only active products

## Architecture Pattern

The repository pattern:
- Separates data source logic from business logic
- Allows easy switching between data sources (API, local DB, cache)
- Provides a consistent interface for ViewModels and UI components

## Data Flow

1. Repository receives API response (ProductResponse)
2. Maps to domain model (Product) using `mapToDomainModel()`
3. Returns domain model to calling code
