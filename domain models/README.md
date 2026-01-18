# Domain Models

This folder contains the core business logic models for the ShopHub mobile app.

## Purpose

Domain models represent the business entities used throughout the application. They contain:
- Data properties (attributes)
- Business logic methods (e.g., `isInStock()`, `updateStock()`)
- Validation rules

## Current Models

- **Product.kt** - Product entity with stock management and availability checks

## Usage

Domain models are used by:
- ViewModels and UI components
- Repository classes (as return types)
- Business logic layer

These models are independent of API structure and can evolve separately from backend changes.
