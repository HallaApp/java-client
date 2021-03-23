
# Store

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** | Used across services to link to this store object. | 
**channel** | **String** | The application type that will be using Halla&#39;s services. &#39;Choose from E_COMMERCE, SELF_SCAN, SMART_CART, PROMOTIONS, OTHER.&#39; |  [optional]
**type** | **String** | The type of store that will be using Halla&#39;s services. &#39;Choose from GROCERY_STORE, SUPER_STORE, CONVENIENCE, DELI, OTHER.&#39; |  [optional]
**brand** | **String** | Brand of store. |  [optional]
**postalCode** | **String** | 5 digit zip code of store location. |  [optional]
**country** | **String** | 2 digit country abbreviation. &#39;US for United States and UK for United Kingdom.&#39; |  [optional]
**products** | [**List&lt;Product&gt;**](Product.md) | Products in the given store&#39;s catalog. |  [optional]
**productSummary** | [**ProductSummary**](ProductSummary.md) | Descriptive information on a store&#39;s products. |  [optional]



