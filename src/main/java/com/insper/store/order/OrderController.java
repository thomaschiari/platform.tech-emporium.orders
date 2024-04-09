package com.insper.store.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;

@FeignClient(name = "store-order")
public interface OrderController {

    @PostMapping("/orders")
    public ResponseEntity<Order> create(
        @RequestBody(required = true) Order in
    );

    @PutMapping("/orders/{id}")
    public ResponseEntity<Order> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) Order in
    );

    @GetMapping("/orders/{id}")
    public ResponseEntity<Order> read(
        @PathVariable(required = true) String id
    );

    @GetMapping("/orders")
    public ResponseEntity<Order> read(
        @RequestHeader(required = true, name = "id-user") String idUser,
        @RequestHeader(required = true, name = "role-user") String roleUser
    );
    
}
