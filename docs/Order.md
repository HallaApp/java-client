
# Order

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**consumerId** | **String** | Identifies the consumer to allow for one to one personalization. |  [optional]
**orderId** | **String** | Identifies the order. | 
**storeId** | **String** | Links the order to a store. |  [optional]
**date** | **String** | &#39;YYYY-MM-DD HH:mm:ss&#39; formatted date object specifying a (4 digit year, 2 digit month, 2 digit day, 0-24 hour, 2 digit minute and 2 digit second) time interval in GMT. Will use current date if not provided. |  [optional]
**campaign** | **String** | Flexible identifier specifying the campaign this order belongs to. Used for A/B testing. |  [optional]
**items** | [**List&lt;Item&gt;**](Item.md) | Individual transaction elements in this order. | 



