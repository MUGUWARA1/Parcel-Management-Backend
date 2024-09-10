# Parcel Management Backend

This project is a backend application built with the Spring framework to manage parcel delivery services. It includes functionalities for managing local and regional centers, parcels, and personnel.

## Table of Contents
- Installation
- Usage
- Project Structure
- Endpoints


## Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/yourusername/parcel-management-backend.git
   cd parcel-management-backend
   ```
2. **Build the project:**
```bash
./mvnw clean install
```
3. **Run the application:**
```bash
./mvnw spring-boot:run
```

## Usage
Once the application is running, you can access the API at http://localhost:8080.

## Project Structure

- **Controller**: Handles HTTP requests.
  - `CentrePostalController.java`
- **Entity**: Represents the domain model.
  - `CentreLocal.java`
  - `CentrePostal.java`
  - `CentreRegional.java`
  - `Colis.java`
  - `Personne.java`
- **Repository**: Interfaces for database operations.
  - `CentreLocalRepo.java`
  - `CentrePostalRepo.java`
  - `CentreRegionalRepo.java`
  - `ColisRepo.java`

## Endpoints

- **Centre Postal**
  - `GET /centres`: Retrieve all postal centers.
  - `POST /centres`: Create a new postal center.
- **Parcels (Colis)**
  - `GET /colis`: Retrieve all parcels.
  - `POST /colis`: Create a new parcel.
- **Personnel (Personne)**
  - `GET /personnes`: Retrieve all personnel.
  - `POST /personnes`: Add new personnel.


