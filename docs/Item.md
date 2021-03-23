
# Item

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**product** | [**Product**](Product.md) | Product in a given transaction. |  [optional]
**code** | **String** | Denotes that a given purchase does or does not have an item. Can represent purchases, coupons, bottle returns, refunds, etc. |  [optional]
**cost** | [**BigDecimal**](BigDecimal.md) | The cost of this transaction in the currency of this store&#39;s country. |  [optional]
**quantity** | [**BigDecimal**](BigDecimal.md) | Amount sold. |  [optional]
**unitOfMeasure** | **String** | Unit this purchase is measured in. &#39;count, lb, kg, oz, ml, etc.&#39; |  [optional]
**message** | **String** | Flexible means of ingesting additiional transaction level information. |  [optional]



