
# Product

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**primaryId** | **String** | The primary key for a product at a given store. | 
**sku** | **String** | Secondary id to link identical products inside of a retailer&#39;s system. |  [optional]
**upcE** | **String** | Secondary link to third party databases to leverage rich product attributes. |  [optional]
**upcA** | **String** | Secondary link to third party databases to leverage rich product attributes. |  [optional]
**ean** | **String** | Secondary link to third party databases to leverage rich product attributes. |  [optional]
**plu** | **String** | Secondary link to third party databases to leverage rich product attributes. |  [optional]
**label** | **String** | Primary product name. | 
**description** | **String** | Secondary descriptive text. |  [optional]
**quantity** | [**BigDecimal**](BigDecimal.md) | Amount of product sold. |  [optional]
**unitOfMeasure** | **String** | Unit this product is measured in. &#39;pack, lb, kg, oz, ml, etc.&#39; |  [optional]
**brand** | **String** | Marketing and promotional brand this product is sold under. |  [optional]
**manufacturer** | **String** | Manufacturer of a given product. |  [optional]
**ingredients** | **String** | String of ingredients found in this product. |  [optional]
**nutrients** | [**List&lt;Nutrient&gt;**](Nutrient.md) | Nutrition information for this product. |  [optional]
**imageUrls** | **List&lt;String&gt;** | Links to product images. |  [optional]
**tags** | [**Map&lt;String, List&lt;String&gt;&gt;**](List.md) | Flexible data structure to capture custom attributes such as categorization, tags, flavors, diet complience, etc. |  [optional]



