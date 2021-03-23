/**
 * Halla I/O
 * <p><strong>Getting Started:</strong></p> <ol type=\"1\"> <li><p>Obtain Credentials (Please Contact Halla to Obtain Credentials):</p> <ol type=\"a\"> <li><p><strong>'serviceAccount'</strong>: Add your Service Account in the <strong>header</strong> for all API requests to the Halla services. This is used to track API usage for authorization, billing, etc.</p></li> <li><p><strong>'key'</strong>: Add your API Key to the <strong>query</strong> for all API requests to the Halla services. This is used as a first line of defense to authenticate API requests.</p></li> </ol></li> <li><p>Add Your Catalog:</p> <ol type=\"a\"> <li><p>Use the <strong>POST STORE</strong> route to create a virtual product catalog. Please add a minimum of 1 <strong>thousand products per store</strong>, each with a <strong>'primaryId'</strong> and <strong>'label'</strong>. This will trigger Halla to index the catalog, allowing for Recommendation, Substitution, and Search services within minutes.</p></li> </ol></li> <li><p>Get Recommendations:</p> <ol type=\"a\"> <li><p>Use the <strong>GET PRODUCTS</strong> route and set the strategy to <strong>'recommend'</strong>.</p></li> <li><p>Fill in the <strong>'storeId'</strong> query parameter to use a specific catalog.</p></li> <li><p>Provide <strong>one or more</strong> of the following query parameters:</p> <ol type=\"i\"> <li><p><strong>'productId'</strong>: Biases recommendations to be relevant for a specific product.</p></li> <li><p><strong>'cartProductIds'</strong>: Biases recommendations to be relevant for all products in the cart.</p></li> <li><p><strong>'consumerId'</strong>: Biases recommendations to be relevant for the consumer's previous browsing and past purchase history.</p></li> </ol></li> <li><p>If multiple inputs are given, the recommendations will be blended to best satisfy multiple constraints.</p></li> </ol></li> <li><p>Get Substitutions:</p> <ol type=\"a\"> <li><p>Use the <strong>GET PRODUCTS</strong> route and set the strategy to <strong>'substitute'</strong>.</p></li> <li><p>Fill in the <strong>'storeId'</strong> query parameter to use a specific catalog.</p></li> <li><p>Fill in the <strong>'productId'</strong> query parameter.</p></li> </ol></li> <li><p>Get Search Results:</p> <ol type=\"a\"> <li><p>Use the <strong>GET PRODUCTS</strong> route and set the strategy to <strong>'search'</strong>.</p></li> <li><p>Fill in the <strong>'storeId'</strong> query parameter to use a specific catalog.</p></li> <li><p>Fill in the <strong>'text'</strong> query parameter.</p></li> </ol></li> <li><p>Supercharge Performance with Purchases:</p> <ol type=\"a\"> <li><p>Use the <strong>POST ORDER</strong> route to add one or more transactions to our system. Transactions will be used to fine tune our models to provide a better experience for your shoppers. To enable advanced personalization, please provide the <strong>'consumerId'</strong> field.</p></li> </ol></li> </ol> <p><strong>Advanced Integration:</strong></p> <ul> <li><p>Integrate Multi-Tenant Capabilities:</p> <ul> <li><p>Ensure that store and product <strong>ids</strong> are <strong>globally unique</strong> across all tenants. If needed, tenant name can be appended to the id in question to guarantee uniqueness.</p></li> <li><p>Attach <strong>'brand'</strong> field to allow for better personalization at scale.</p></li> </ul></li> <li><p>Enable Real-Time Inventory:</p> <ul> <li><p>Integrate the <strong>POST STORE</strong> route into your inventory management solution and do one of the following:</p> <ul> <li><p>Call the <strong>POST STORE</strong> route at regular intervals to overwrite existing store data.</p></li> <li><p>Call the <strong>ADD / DELETE</strong> product from store routes to update the catalog upon changes and current availabilities.</p></li> </ul></li> </ul></li> <li><p>(BETA) Enable Advanced Filtering:</p> <ul> <li><p>To enable SNAP, Own-Brand, Sponsored Product and other custom filters, create multiple virtual stores for each real store location. Each virtual store should correspond to a subset of products to include in the filter. Store ids can be generated by prepending the filter identifier to your store id.</p></li> </ul></li> <li><p>(BETA) Run an A/B Test:</p> <ul> <li><p>Work with your Halla Support Rep to define the scope of your A/B test.</p></li> <li><p>Call the <strong>POST ORDER</strong> route to add purchases with which to evaluate.</p></li> <li><p>If you are <strong>tracking spend</strong> between test groups, then it is <strong>required</strong> to attach the <strong>'campaign'</strong> field in the request body of the order.</p></li> <li><p>If you are <strong>testing at the consumer level</strong>, then it is <strong>required</strong> to attach the <strong>'consumerId'</strong> field in the request body of the order.</p></li> </ul></li> <li><p>(BETA) Add Fulfillment Data:</p> <ul> <li><p>Call the <strong>POST ORDER</strong> route multiple times corresponding to when an order is placed and later fulfilled. Set the <strong>'code'</strong> attribute in each item to <strong>'purchased' or 'fulfilled'</strong> corresponding to the order status.</p></li> </ul></li> </ul> 
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.Nutrient;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * Product
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2021-03-23T19:22:16.084Z")
public class Product   {
  @SerializedName("primaryId")
  private String primaryId = null;

  @SerializedName("sku")
  private String sku = null;

  @SerializedName("upcE")
  private String upcE = null;

  @SerializedName("upcA")
  private String upcA = null;

  @SerializedName("ean")
  private String ean = null;

  @SerializedName("plu")
  private String plu = null;

  @SerializedName("label")
  private String label = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("quantity")
  private BigDecimal quantity = null;

  @SerializedName("unitOfMeasure")
  private String unitOfMeasure = null;

  @SerializedName("brand")
  private String brand = null;

  @SerializedName("manufacturer")
  private String manufacturer = null;

  @SerializedName("ingredients")
  private String ingredients = null;

  @SerializedName("nutrients")
  private List<Nutrient> nutrients = new ArrayList<Nutrient>();

  @SerializedName("imageUrls")
  private List<String> imageUrls = new ArrayList<String>();

  @SerializedName("tags")
  private Map<String, List<String>> tags = new HashMap<String, List<String>>();

  public Product primaryId(String primaryId) {
    this.primaryId = primaryId;
    return this;
  }

   /**
   * The primary key for a product at a given store.
   * @return primaryId
  **/
  @ApiModelProperty(example = "null", required = true, value = "The primary key for a product at a given store.")
  public String getPrimaryId() {
    return primaryId;
  }

  public void setPrimaryId(String primaryId) {
    this.primaryId = primaryId;
  }

  public Product sku(String sku) {
    this.sku = sku;
    return this;
  }

   /**
   * Secondary id to link identical products inside of a retailer's system.
   * @return sku
  **/
  @ApiModelProperty(example = "null", value = "Secondary id to link identical products inside of a retailer's system.")
  public String getSku() {
    return sku;
  }

  public void setSku(String sku) {
    this.sku = sku;
  }

  public Product upcE(String upcE) {
    this.upcE = upcE;
    return this;
  }

   /**
   * Secondary link to third party databases to leverage rich product attributes.
   * @return upcE
  **/
  @ApiModelProperty(example = "null", value = "Secondary link to third party databases to leverage rich product attributes.")
  public String getUpcE() {
    return upcE;
  }

  public void setUpcE(String upcE) {
    this.upcE = upcE;
  }

  public Product upcA(String upcA) {
    this.upcA = upcA;
    return this;
  }

   /**
   * Secondary link to third party databases to leverage rich product attributes.
   * @return upcA
  **/
  @ApiModelProperty(example = "null", value = "Secondary link to third party databases to leverage rich product attributes.")
  public String getUpcA() {
    return upcA;
  }

  public void setUpcA(String upcA) {
    this.upcA = upcA;
  }

  public Product ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * Secondary link to third party databases to leverage rich product attributes.
   * @return ean
  **/
  @ApiModelProperty(example = "null", value = "Secondary link to third party databases to leverage rich product attributes.")
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public Product plu(String plu) {
    this.plu = plu;
    return this;
  }

   /**
   * Secondary link to third party databases to leverage rich product attributes.
   * @return plu
  **/
  @ApiModelProperty(example = "null", value = "Secondary link to third party databases to leverage rich product attributes.")
  public String getPlu() {
    return plu;
  }

  public void setPlu(String plu) {
    this.plu = plu;
  }

  public Product label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Primary product name.
   * @return label
  **/
  @ApiModelProperty(example = "null", required = true, value = "Primary product name.")
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public Product description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Secondary descriptive text.
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "Secondary descriptive text.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Product quantity(BigDecimal quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Amount of product sold.
   * @return quantity
  **/
  @ApiModelProperty(example = "null", value = "Amount of product sold.")
  public BigDecimal getQuantity() {
    return quantity;
  }

  public void setQuantity(BigDecimal quantity) {
    this.quantity = quantity;
  }

  public Product unitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
    return this;
  }

   /**
   * Unit this product is measured in. 'pack, lb, kg, oz, ml, etc.'
   * @return unitOfMeasure
  **/
  @ApiModelProperty(example = "null", value = "Unit this product is measured in. 'pack, lb, kg, oz, ml, etc.'")
  public String getUnitOfMeasure() {
    return unitOfMeasure;
  }

  public void setUnitOfMeasure(String unitOfMeasure) {
    this.unitOfMeasure = unitOfMeasure;
  }

  public Product brand(String brand) {
    this.brand = brand;
    return this;
  }

   /**
   * Marketing and promotional brand this product is sold under.
   * @return brand
  **/
  @ApiModelProperty(example = "null", value = "Marketing and promotional brand this product is sold under.")
  public String getBrand() {
    return brand;
  }

  public void setBrand(String brand) {
    this.brand = brand;
  }

  public Product manufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
    return this;
  }

   /**
   * Manufacturer of a given product.
   * @return manufacturer
  **/
  @ApiModelProperty(example = "null", value = "Manufacturer of a given product.")
  public String getManufacturer() {
    return manufacturer;
  }

  public void setManufacturer(String manufacturer) {
    this.manufacturer = manufacturer;
  }

  public Product ingredients(String ingredients) {
    this.ingredients = ingredients;
    return this;
  }

   /**
   * String of ingredients found in this product.
   * @return ingredients
  **/
  @ApiModelProperty(example = "null", value = "String of ingredients found in this product.")
  public String getIngredients() {
    return ingredients;
  }

  public void setIngredients(String ingredients) {
    this.ingredients = ingredients;
  }

  public Product nutrients(List<Nutrient> nutrients) {
    this.nutrients = nutrients;
    return this;
  }

  public Product addNutrientsItem(Nutrient nutrientsItem) {
    this.nutrients.add(nutrientsItem);
    return this;
  }

   /**
   * Nutrition information for this product.
   * @return nutrients
  **/
  @ApiModelProperty(example = "null", value = "Nutrition information for this product.")
  public List<Nutrient> getNutrients() {
    return nutrients;
  }

  public void setNutrients(List<Nutrient> nutrients) {
    this.nutrients = nutrients;
  }

  public Product imageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
    return this;
  }

  public Product addImageUrlsItem(String imageUrlsItem) {
    this.imageUrls.add(imageUrlsItem);
    return this;
  }

   /**
   * Links to product images.
   * @return imageUrls
  **/
  @ApiModelProperty(example = "null", value = "Links to product images.")
  public List<String> getImageUrls() {
    return imageUrls;
  }

  public void setImageUrls(List<String> imageUrls) {
    this.imageUrls = imageUrls;
  }

  public Product tags(Map<String, List<String>> tags) {
    this.tags = tags;
    return this;
  }

  public Product putTagsItem(String key, List<String> tagsItem) {
    this.tags.put(key, tagsItem);
    return this;
  }

   /**
   * Flexible data structure to capture custom attributes such as categorization, tags, flavors, diet complience, etc.
   * @return tags
  **/
  @ApiModelProperty(example = "null", value = "Flexible data structure to capture custom attributes such as categorization, tags, flavors, diet complience, etc.")
  public Map<String, List<String>> getTags() {
    return tags;
  }

  public void setTags(Map<String, List<String>> tags) {
    this.tags = tags;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Product product = (Product) o;
    return Objects.equals(this.primaryId, product.primaryId) &&
        Objects.equals(this.sku, product.sku) &&
        Objects.equals(this.upcE, product.upcE) &&
        Objects.equals(this.upcA, product.upcA) &&
        Objects.equals(this.ean, product.ean) &&
        Objects.equals(this.plu, product.plu) &&
        Objects.equals(this.label, product.label) &&
        Objects.equals(this.description, product.description) &&
        Objects.equals(this.quantity, product.quantity) &&
        Objects.equals(this.unitOfMeasure, product.unitOfMeasure) &&
        Objects.equals(this.brand, product.brand) &&
        Objects.equals(this.manufacturer, product.manufacturer) &&
        Objects.equals(this.ingredients, product.ingredients) &&
        Objects.equals(this.nutrients, product.nutrients) &&
        Objects.equals(this.imageUrls, product.imageUrls) &&
        Objects.equals(this.tags, product.tags);
  }

  @Override
  public int hashCode() {
    return Objects.hash(primaryId, sku, upcE, upcA, ean, plu, label, description, quantity, unitOfMeasure, brand, manufacturer, ingredients, nutrients, imageUrls, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("    primaryId: ").append(toIndentedString(primaryId)).append("\n");
    sb.append("    sku: ").append(toIndentedString(sku)).append("\n");
    sb.append("    upcE: ").append(toIndentedString(upcE)).append("\n");
    sb.append("    upcA: ").append(toIndentedString(upcA)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    plu: ").append(toIndentedString(plu)).append("\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    unitOfMeasure: ").append(toIndentedString(unitOfMeasure)).append("\n");
    sb.append("    brand: ").append(toIndentedString(brand)).append("\n");
    sb.append("    manufacturer: ").append(toIndentedString(manufacturer)).append("\n");
    sb.append("    ingredients: ").append(toIndentedString(ingredients)).append("\n");
    sb.append("    nutrients: ").append(toIndentedString(nutrients)).append("\n");
    sb.append("    imageUrls: ").append(toIndentedString(imageUrls)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

