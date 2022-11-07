package org.example.models;

import com.fasterxml.jackson.annotation.*;

import javax.annotation.Generated;
import java.util.HashMap;
import java.util.List;
import java.util.Map;                                             // CART RESPONCE USEING JSONSCHEMA TO POJO

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cart"
})
@Generated("jsonschema2pojo")
public class Response {                                         // CART RESPONCE USEING JSONSCHEMA TO POJO

    @JsonProperty("cart")
    private List<Cart> cart = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("cart")
    public List<Cart> getCart() {
        return cart;
    }

    @JsonProperty("cart")
    public void setCart(List<Cart> cart) {
        this.cart = cart;
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
