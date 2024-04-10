# Deploying a Simple Java Spring Boot Microservice Application on AKS

## Introduction

This repo is supporting material for a tutorial that guides you through deploying a simplistic Java Spring Boot microservice application on the Azure Kubernetes Service (AKS). It aims to showcase the power and flexibility of microservices architecture, particularly when combined with Kubernetes for orchestration. The application allows users to write reviews for movies stored in a MongoDB database, highlighting the dynamic, loosely coupled nature of microservices and the ease of inter-service communication within a Kubernetes environment.

## Prerequisites
- A [MongoDB Atlas](https://www.mongodb.com/cloud/atlas?tck=docs_atlas) account, if you don't have one already, with a cluster ready with the [MongoDB sample data](https://www.mongodb.com/basics/sample-database#:~:text=Does%20MongoDB%20Provide%20Sample%20Datasets,in%20only%20a%20few%20clicks.)
- A [Microsoft Azure account](https://azure.microsoft.com/en-us/free) with an active subscription
- [Azure CLI](https://learn.microsoft.com/en-us/cli/azure/), or you can [install Azure PowerShell](https://learn.microsoft.com/en-us/powershell/azure/), but this tutorial uses Azure CLI. Sign in and configure your command line tool following the steps in the documentation for [Azure CLI]([https://learn.microsoft.com/en-us/cli/azure/azure-cli-configuration](https://learn.microsoft.com/en-us/cli/azure/azure-cli-configuration)) and [Azure PowerShell](https://learn.microsoft.com/en-us/powershell/azure/configure-global-settings)
- Java 17
- Maven 3.9.6

## Tutorial Overview
1. **Setting Up AKS**: We begin by creating an AKS cluster, a foundational step for deploying our microservices.
2. **Containerizing Our Application**: Each microservice, including User Management, Movie Catalogue, and Reviews, will be containerized and prepared for deployment.
3. **Deploying to AKS**: We'll deploy our containerized microservices to the AKS cluster, ensuring they're configured to communicate with each other and the MongoDB database.
4. **Testing Our Deployment**: A simple test to verify our microservices are operational and can communicate within the AKS environment.
    
## Highlights
- **Microservice Architecture**: Emphasizes the modular approach of developing applications, enabling independent development, deployment, and scaling of services.
- **Kubernetes Deployment Simplification**: AKS reduces the complexity of managing a Kubernetes cluster, making it easier to deploy and scale microservices.
- **Inter-Service Communication**: Demonstrates how services within a Kubernetes cluster can discover and communicate with each other efficiently.
- **Security and Configuration**: Utilizes Kubernetes secrets for sensitive configurations and Azure Container Registry for secure container image management.

## Conclusion
By the end of this tutorial, you'll have a basic yet functional microservice application running on AKS, demonstrating the scalability, maintainability, and deployment flexibility that microservices architecture and Kubernetes offer. This tutorial sets the stage for further exploration into more advanced microservices best practices and design patterns.
