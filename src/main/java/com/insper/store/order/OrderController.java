package com.insper.store.order;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestHeader;


@FeignClient(name = "store-order")
public interface OrderController {

    @PostMapping("/orders")
    public ResponseEntity<OrderOut> create(
        @RequestBody(required = true) OrderIn in
    );

    @GetMapping("/orders/{id}")
    public ResponseEntity<OrderOut> get(
        @PathVariable(required = true) String id
    );

    @PutMapping("/orders/{id}")
    public ResponseEntity<OrderOut> update(
        @PathVariable(required = true) String id,
        @RequestBody(required = true) OrderIn in
    );

    @DeleteMapping("/orders/{id}")
    public ResponseEntity<Void> delete(
        @PathVariable(required = true) String id
    );

}