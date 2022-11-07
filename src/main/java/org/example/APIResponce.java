package org.example;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;





public class APIResponce {   //IT IS ALSO CALLED JAVA BEAN CLASS  // LOGIN RESPONCE USEING JSONSCHEMA TO POJO
    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("message")                                      // CART RESPONCE USEING JSONSCHEMA TO POJO
    @Expose
    private String message;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
