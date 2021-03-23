# halla-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>HallaApp</groupId>
    <artifactId>halla-client</artifactId>
    <version>1.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "HallaApp:halla-client:1.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/halla-client-1.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import invalidPackageName.*;
import invalidPackageName.auth.*;
import invalidPackageName.model.*;
import halla_client.DefaultApi;

import java.io.File;
import java.util.*;

public class DefaultApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        DefaultApi apiInstance = new DefaultApi();
        String serviceAccount = "serviceAccount_example"; // String | Identifies the serviceAccount for authorization purposes.
        Orders orders = new Orders(); // Orders | The orders to create.
        try {
            apiInstance.addOrders(serviceAccount, orders);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#addOrders");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://devapi.develop.halla.io*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**addOrders**](docs/DefaultApi.md#addOrders) | **POST** /v2/orders | 
*DefaultApi* | [**addProductsToManyStores**](docs/DefaultApi.md#addProductsToManyStores) | **POST** /v2/stores/products | 
*DefaultApi* | [**addProductsToStore**](docs/DefaultApi.md#addProductsToStore) | **POST** /v2/stores/{sid}/products | 
*DefaultApi* | [**addStore**](docs/DefaultApi.md#addStore) | **POST** /v2/stores | 
*DefaultApi* | [**deleteStore**](docs/DefaultApi.md#deleteStore) | **DELETE** /v2/stores/{sid} | 
*DefaultApi* | [**getProducts**](docs/DefaultApi.md#getProducts) | **GET** /v2/products | 
*DefaultApi* | [**getProductsFromStore**](docs/DefaultApi.md#getProductsFromStore) | **GET** /v2/stores/{sid}/products | 
*DefaultApi* | [**getSearchTerms**](docs/DefaultApi.md#getSearchTerms) | **GET** /v2/searchTerms | 
*DefaultApi* | [**getStore**](docs/DefaultApi.md#getStore) | **GET** /v2/stores/{sid} | 
*DefaultApi* | [**getStoreIds**](docs/DefaultApi.md#getStoreIds) | **GET** /v2/stores | 
*DefaultApi* | [**removeProductFromStore**](docs/DefaultApi.md#removeProductFromStore) | **DELETE** /v2/stores/{sid}/products/{pid} | 


## Documentation for Models

 - [InlineResponse200](docs/InlineResponse200.md)
 - [Item](docs/Item.md)
 - [Nutrient](docs/Nutrient.md)
 - [Order](docs/Order.md)
 - [Orders](docs/Orders.md)
 - [Product](docs/Product.md)
 - [ProductRecommendation](docs/ProductRecommendation.md)
 - [ProductSummary](docs/ProductSummary.md)
 - [ProductUpdate](docs/ProductUpdate.md)
 - [Products](docs/Products.md)
 - [SearchTerm](docs/SearchTerm.md)
 - [Store](docs/Store.md)
 - [Updates](docs/Updates.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### api_key

- **Type**: API key
- **API key parameter name**: key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issue.

## Author



