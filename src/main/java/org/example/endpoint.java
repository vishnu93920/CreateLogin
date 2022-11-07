package org.example;
import org.example.models.Cart;
import org.example.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path="/JSON", produces="application/json")// BY DEFAULT IT WILL GIVE RESPONCE "MediaType"
@CrossOrigin(origins="*")
public class EndPoint {
    @Autowired
    private EndPoint endPoint;

    @PostMapping("/login")
    public ResponseEntity<APIResponce> login(@RequestParam("username") String username, @RequestParam("password") String password) throws IOException {
          // System.out.println("HTTP Triggered");
        APIResponce apiResponce = new APIResponce(); //IF YOU WANT TO USE API RESPONCECLASS THEN YOU WILL CREATE OBJECT OF THAT CLASS

        if (username.equalsIgnoreCase( "Vishnu" ) && password.equals( "123" )) {
            apiResponce.setStatus("SUCCESS");
            apiResponce.setMessage("LOGIN SUCCESSFULL");
        } else {
            apiResponce.setStatus( "Failed" );
            apiResponce.setMessage( "Login Failed");
        }

       System.out.println( apiResponce.toString() );

        //HttpHeaders headers = new HttpHeaders();
        ResponseEntity<APIResponce> entity = new ResponseEntity<>(  apiResponce,HttpStatus.OK  );

      System.out.println( "entity-->" + entity.toString() );
       return entity;
    }

    @PostMapping("/cart")
    public ResponseEntity<Response> cart() throws IOException {
        List<Cart> list = new ArrayList<Cart>();
        Response response = new Response();
        int i;
        for ( i = 0; i <=10; i ++){
            System.out.println("Index-->"+i);
            list.add(createCartObject(i));
        }


        response.setCart(list);
        HttpHeaders headers = new HttpHeaders();
        ResponseEntity<Response> entity = new ResponseEntity<>(response, headers, HttpStatus.OK );
//RESPONCE ENTITY IS NOTHING BUT IT RETURNS THE RESPONCE AS A GROUP LIKE HTTP STATUS AND API RESPONCE HEADERS NOT REQ HERE LEARN THAT LATER
        System.out.println( "entity-->" + entity.toString() );
        return entity;
    }

    private Cart createCartObject(int i) {
        Cart cart = new Cart();


        if(i == 5){
            cart.setTitle("Green Colour");
            cart.setPrice(String.valueOf( 200 ));
            cart.setBrand( "NIKE");
        }
        else {
            cart.setTitle("Shirt-->"+i);
            cart.setPrice(String.valueOf( i ));
            cart.setBrand("PUMA VARIANT  "+i);
        }


        return  cart;
    }
}
