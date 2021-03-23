# DefaultApi

All URIs are relative to *https://devapi.develop.halla.io*

Method | HTTP request | Description
------------- | ------------- | -------------
[**addOrders**](DefaultApi.md#addOrders) | **POST** /v2/orders | 
[**addProductsToManyStores**](DefaultApi.md#addProductsToManyStores) | **POST** /v2/stores/products | 
[**addProductsToStore**](DefaultApi.md#addProductsToStore) | **POST** /v2/stores/{sid}/products | 
[**addStore**](DefaultApi.md#addStore) | **POST** /v2/stores | 
[**deleteStore**](DefaultApi.md#deleteStore) | **DELETE** /v2/stores/{sid} | 
[**getProducts**](DefaultApi.md#getProducts) | **GET** /v2/products | 
[**getProductsFromStore**](DefaultApi.md#getProductsFromStore) | **GET** /v2/stores/{sid}/products | 
[**getSearchTerms**](DefaultApi.md#getSearchTerms) | **GET** /v2/searchTerms | 
[**getStore**](DefaultApi.md#getStore) | **GET** /v2/stores/{sid} | 
[**getStoreIds**](DefaultApi.md#getStoreIds) | **GET** /v2/stores | 
[**removeProductFromStore**](DefaultApi.md#removeProductFromStore) | **DELETE** /v2/stores/{sid}/products/{pid} | 


<a name="addOrders"></a>
# **addOrders**
> addOrders(serviceAccount, orders)



Adds new orders, updating associated consumer profiles to allow for real-time personalization.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import halla_client.DefaultApi;

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
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccount** | **String**| Identifies the serviceAccount for authorization purposes. |
 **orders** | [**Orders**](Orders.md)| The orders to create. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="addProductsToManyStores"></a>
# **addProductsToManyStores**
> addProductsToManyStores(serviceAccount, updates)



Bulk method to apply product updates across multiple stores. Note: OVERWRITE will remove products with matching product ids in stores not provided in the request.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import halla_client.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String serviceAccount = "serviceAccount_example"; // String | Identifies the serviceAccount for authorization purposes.
Updates updates = new Updates(); // Updates | The updates to apply.
try {
    apiInstance.addProductsToManyStores(serviceAccount, updates);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addProductsToManyStores");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccount** | **String**| Identifies the serviceAccount for authorization purposes. |
 **updates** | [**Updates**](Updates.md)| The updates to apply. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="addProductsToStore"></a>
# **addProductsToStore**
> addProductsToStore(serviceAccount, sid, products)



Adds one or more products to a store. This method will create a new store if the store id does not exist and will index the newly created products, letting these products be used as input to the Halla services.  Notes:  -Halla will perform best on inventories between 1,000 and 50,000 products.  -Primary product ids persist across multiple stores for a given client.  -Never before seen products will be added in minutes.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import halla_client.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String serviceAccount = "serviceAccount_example"; // String | Identifies the serviceAccount for authorization purposes.
String sid = "sid_example"; // String | Subscriber specific store id
Products products = new Products(); // Products | The products to create.
try {
    apiInstance.addProductsToStore(serviceAccount, sid, products);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addProductsToStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccount** | **String**| Identifies the serviceAccount for authorization purposes. |
 **sid** | **String**| Subscriber specific store id |
 **products** | [**Products**](Products.md)| The products to create. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="addStore"></a>
# **addStore**
> addStore(serviceAccount, store)



Creates / overwrites a store with a distinct catalog. Notes: -Halla will perform best on inventories between 1,000 and 50,000 products. -Primary product ids persist across multiple stores for a given client.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import halla_client.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String serviceAccount = "serviceAccount_example"; // String | Identifies the serviceAccount for authorization purposes.
Store store = new Store(); // Store | The store to create.
try {
    apiInstance.addStore(serviceAccount, store);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#addStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccount** | **String**| Identifies the serviceAccount for authorization purposes. |
 **store** | [**Store**](Store.md)| The store to create. | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: Not defined

<a name="deleteStore"></a>
# **deleteStore**
> deleteStore(serviceAccount, sid)



Deletes store data.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import halla_client.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String serviceAccount = "serviceAccount_example"; // String | Identifies the serviceAccount for authorization purposes.
String sid = "sid_example"; // String | Subscriber specific store id
try {
    apiInstance.deleteStore(serviceAccount, sid);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#deleteStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccount** | **String**| Identifies the serviceAccount for authorization purposes. |
 **sid** | **String**| Subscriber specific store id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getProducts"></a>
# **getProducts**
> List&lt;ProductRecommendation&gt; getProducts(strategy, serviceAccount, text, productId, cartProductIds, consumerId, storeId, limit)



Real-time, contextual product recommendation, substitution and search. Returns a list of products with attached relevance scores.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import halla_client.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String strategy = "strategy_example"; // String | Determines which service should be used for this request. Choose from recommend, substitute, or search.
String serviceAccount = "serviceAccount_example"; // String | Identifies the serviceAccount for authorization purposes.
String text = "text_example"; // String | Text input if search strategy is selected.
String productId = "productId_example"; // String | Subscriber specific product identifier to recommend based on. Required for substitution strategy.
String cartProductIds = "cartProductIds_example"; // String | A comma delimited string of subscriber specific product identifiers for a consumer's current cart. If productId is not passed in the query, then recommendations will be based on the cartProductIds. If a productId is passed in the query, then cartProductIds will be used to improve recommendation relevance.
String consumerId = "consumerId_example"; // String | Subscriber specific consumer identifier to personalize recommendations. If productId and cartProductIds are not passed in the query, then recommendations will be based on previous consumer behavior.
String storeId = "storeId_example"; // String | Subscriber specific store identifier, selecting the catalog of products to recommend from. If storeId is invalid or is not passed in the query, then recommendations will be sourced from the subscriber's master product list.
Integer limit = 56; // Integer | Upper bound on the number of products to return. Default = 15. Max = 30.
try {
    List<ProductRecommendation> result = apiInstance.getProducts(strategy, serviceAccount, text, productId, cartProductIds, consumerId, storeId, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProducts");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **strategy** | **String**| Determines which service should be used for this request. Choose from recommend, substitute, or search. |
 **serviceAccount** | **String**| Identifies the serviceAccount for authorization purposes. |
 **text** | **String**| Text input if search strategy is selected. | [optional]
 **productId** | **String**| Subscriber specific product identifier to recommend based on. Required for substitution strategy. | [optional]
 **cartProductIds** | **String**| A comma delimited string of subscriber specific product identifiers for a consumer&#39;s current cart. If productId is not passed in the query, then recommendations will be based on the cartProductIds. If a productId is passed in the query, then cartProductIds will be used to improve recommendation relevance. | [optional]
 **consumerId** | **String**| Subscriber specific consumer identifier to personalize recommendations. If productId and cartProductIds are not passed in the query, then recommendations will be based on previous consumer behavior. | [optional]
 **storeId** | **String**| Subscriber specific store identifier, selecting the catalog of products to recommend from. If storeId is invalid or is not passed in the query, then recommendations will be sourced from the subscriber&#39;s master product list. | [optional]
 **limit** | **Integer**| Upper bound on the number of products to return. Default &#x3D; 15. Max &#x3D; 30. | [optional]

### Return type

[**List&lt;ProductRecommendation&gt;**](ProductRecommendation.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getProductsFromStore"></a>
# **getProductsFromStore**
> List&lt;Product&gt; getProductsFromStore(serviceAccount, sid)



Gets all products in a store.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import halla_client.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String serviceAccount = "serviceAccount_example"; // String | Identifies the serviceAccount for authorization purposes.
String sid = "sid_example"; // String | Subscriber specific store id
try {
    List<Product> result = apiInstance.getProductsFromStore(serviceAccount, sid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getProductsFromStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccount** | **String**| Identifies the serviceAccount for authorization purposes. |
 **sid** | **String**| Subscriber specific store id |

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getSearchTerms"></a>
# **getSearchTerms**
> List&lt;SearchTerm&gt; getSearchTerms(text, serviceAccount, limit)



Grocery specific autocomplete for search.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import halla_client.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String text = "text_example"; // String | Text to autocomplete.
String serviceAccount = "serviceAccount_example"; // String | Identifies the serviceAccount for authorization purposes.
Integer limit = 56; // Integer | Upper bound on the number of search terms to return. Default = 15. Max = 30.
try {
    List<SearchTerm> result = apiInstance.getSearchTerms(text, serviceAccount, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getSearchTerms");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text to autocomplete. |
 **serviceAccount** | **String**| Identifies the serviceAccount for authorization purposes. |
 **limit** | **Integer**| Upper bound on the number of search terms to return. Default &#x3D; 15. Max &#x3D; 30. | [optional]

### Return type

[**List&lt;SearchTerm&gt;**](SearchTerm.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getStore"></a>
# **getStore**
> List&lt;Product&gt; getStore(serviceAccount, sid)



Gets store data.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import halla_client.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String serviceAccount = "serviceAccount_example"; // String | Identifies the serviceAccount for authorization purposes.
String sid = "sid_example"; // String | Subscriber specific store id
try {
    List<Product> result = apiInstance.getStore(serviceAccount, sid);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccount** | **String**| Identifies the serviceAccount for authorization purposes. |
 **sid** | **String**| Subscriber specific store id |

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="getStoreIds"></a>
# **getStoreIds**
> InlineResponse200 getStoreIds(serviceAccount)



Gets all store ids.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import halla_client.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String serviceAccount = "serviceAccount_example"; // String | Identifies the serviceAccount for authorization purposes.
try {
    InlineResponse200 result = apiInstance.getStoreIds(serviceAccount);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStoreIds");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccount** | **String**| Identifies the serviceAccount for authorization purposes. |

### Return type

[**InlineResponse200**](InlineResponse200.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

<a name="removeProductFromStore"></a>
# **removeProductFromStore**
> removeProductFromStore(serviceAccount, sid, pid)



Removes a product from a store.

### Example
```java
// Import classes:
//import invalidPackageName.ApiClient;
//import invalidPackageName.ApiException;
//import invalidPackageName.Configuration;
//import invalidPackageName.auth.*;
//import halla_client.DefaultApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

DefaultApi apiInstance = new DefaultApi();
String serviceAccount = "serviceAccount_example"; // String | Identifies the serviceAccount for authorization purposes.
String sid = "sid_example"; // String | Subscriber specific store id
String pid = "pid_example"; // String | Subscriber specific product id
try {
    apiInstance.removeProductFromStore(serviceAccount, sid, pid);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#removeProductFromStore");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceAccount** | **String**| Identifies the serviceAccount for authorization purposes. |
 **sid** | **String**| Subscriber specific store id |
 **pid** | **String**| Subscriber specific product id |

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

