# Data Classes

This folder contains Kotlin data classes that represent API response models.

## Purpose

Data classes mirror the exact structure of JSON responses from the backend API. They are used for:
- JSON deserialization (parsing API responses)
- Temporary storage of raw API data
- Mapping to domain models

## Current Models

- **ProductResponse.kt** - Product data from API
- **UserResponse.kt** - User data from API
- **CartResponse.kt** - Shopping cart data from API
- **OrderResponse.kt** - Order data from API
- **OrderItemResponse.kt** - Order item data from API

## Usage

These classes are typically:
1. Created when parsing JSON from API calls
2. Converted to domain models by repository classes
3. Not used directly in UI or business logic

## Note

These models match the backend Java domain models structure and should be updated if the API changes.
