package com.feign.UserService.entity;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product_id",
    "product_name",
    "price"
})

public class FeignProduct {

    @JsonProperty("product_id")
    private int product_id;
    @JsonProperty("product_name")
    private String product_name;
    @JsonProperty("price")
    private int price;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("product_id")
    public Integer getProductId() {
        return product_id;
    }

    @JsonProperty("product_id")
    public void setProductId(int product_id) {
        this.product_id = product_id;
    }

    @JsonProperty("product_name")
    public String getProductName() {
        return product_name;
    }

    @JsonProperty("product_name")
    public void setProductName(String product_name) {
        this.product_name = product_name;
    }

    @JsonProperty("price")
    public int getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setUsername(int price) {
        this.price = price;
    }

    @Override
	public String toString() {
		return "FeignProduct [product_id=" + product_id + ", product_name=" + product_name + ", price=" + price + "]";
	}

	public FeignProduct(int product_id, String product_name, int price) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
	}

	public FeignProduct() {
		super();
	}

	public FeignProduct(int product_id, String product_name, int price, Map<String, Object> additionalProperties) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.price = price;
		this.additionalProperties = additionalProperties;
	}

	@JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}